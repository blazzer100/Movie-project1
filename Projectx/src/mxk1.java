import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mxk1 {
ArrayList plist=new ArrayList();
ArrayList  linklist= new ArrayList();


JFrame frm=new JFrame();
JPanel pan= new JPanel();
JEditorPane jpan= new  JEditorPane();
JButton butz;
int numz=0;
static int x=0;
	
	public void pic(String target) throws Exception{
		
		URL tg1= new URL(target);
		Scanner scn=new Scanner(tg1.openStream());
		Pattern pat=Pattern.compile(" data-original=.*jpg");
		while (scn.hasNext()){
			Matcher mat=pat.matcher(scn.nextLine());
			if (mat.find()){
				String to1=mat.group();
				String to2=to1.replace("data-original=\"","");
				plist.add(to2);
				
			//System.out.println(plist.get(0));
				                     }
			
			
	
			
			
		                     }
		
		
		
		
		
		
	                }
	
	
	protected void getlink(String target) throws Exception{
		
		
		URL targ= new URL(target);
		Pattern patz= Pattern.compile("<h2><a href=\"http://www.moviexk.net/.*\" title");
		Scanner sccn= new Scanner(targ.openStream());
		while(sccn.hasNext()){
		Matcher mat=patz.matcher(sccn.nextLine());
		if (mat.find()){
			String l1=mat.group();
			String l2=l1.replace("<h2><a href=\"","");
			String l3=l2.replace("\" title", "");
			linklist.add(l3);
			//System.out.println(l3);
		       }
			
		
		
		
		                      }
		
	}
	
	
	
protected void showme(){
	frm.add(jpan);
		
	//jpan.setText(htt);	
	while (numz<10){
		
		numz++;
		x++;
		String htt="<html><body><Img src=\""+plist.get(numz).toString()+"\"height=\"200\" width=\"200\"></body></html>";
		butz= new JButton(htt);
		
		butz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(linklist.get(x).toString());
				
			}
		});
		
		
		butz.setBackground(Color.BLACK);
		butz.setSize(200,200); 
		pan.add(butz);
		
		
	        }
	
	
	pan.setBackground(Color.BLACK);
	frm.add(pan);
	frm.setSize(1350, 800);
	frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
	frm.setVisible(true);
		
	
	                    }
	
	
	
	
	
	
}
