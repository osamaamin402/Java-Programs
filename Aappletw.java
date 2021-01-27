import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Aappletw extends Applet implements ActionListener
{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Button b1;
	int a,b,c;
	TextField t1,t2,t3;
	public void init()
	{
		
		t1=new TextField();
			add(t1);

		t2=new TextField();
			add(t2);

		b1=new Button("+");
		add(b1);

		t3=new TextField();
			add(t3);
		b1.addActionListener(this);
			//t.setBound(50,50,200,200);
	}
	public void actionPerformed(ActionEvent e)
	{ 
		try
		{
			 a=Integer.parseInt(t1.getText());

			 b=Integer.parseInt(t2.getText());

			if (e.equals("+")) 
			{
				
			 c=a+b;
			t3.setText("Addition"+c);
			}
		}
		catch(Exception ex)
		{
			t3.setText("Addition"+c);

		}
		finally{	 c=a+b;t3.setText(""+c);}
		
	}

}
/*<applet code=Aappletw.class width=400 height=400>
</applet>*/