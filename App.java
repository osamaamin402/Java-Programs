import java.applet.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class App extends Frame implements ActionListener,WindowListener
{
	Frame f=new Frame();
 Color cl=new Color(112,211,111);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Button b1,b2,b3,b4;
	int a,b,c;
	TextField t1,t2,t3;
	public void ini2()
	{try{

		f.setVisible(true);
		f.setSize(400,400);
		f.setLayout(new GridLayout(4,6));
		t1=new TextField();
			f.add(t1);
			t1.setBackground(new Color(112,200,180));
			

			//b1.setBounds(10,10,50,50);


		t2=new TextField();
			f.add(t2);
			t2.setBackground(new Color(112,200,180));
			
			//setSize(50,50);
		//b1.setBounds(100,100,50,50);



		b1=new Button("add");
			f.add(b1);
			b1.setSize(50,50);
			b1.setBackground(new Color(1,211,1));
			//b1.setBounds(200,200,50,50);

		b2=new Button("Div");
			f.add(b2);
			b2.setSize(50,50);
			b2.setBackground(new Color(221,2,1));
			
		b3=new Button("Sub");
			f.add(b3);
			b3.setSize(50,50);
			b3.setBackground(new Color(1,1,251));
			
		b4=new Button("Mul");
			f.add(b4);
			b4.setSize(50,50);
			b4.setBackground(new Color(221,221,121));
			

		t3=new TextField();
			f.add(t3);
			setSize(50,50);
			t3.setBackground(new Color(12,200,180));
			
			//b1.setBounds(300,300,50,50);

	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.addWindowListener(this);
		}
		catch(NullPointerException n){}
		
	}
	public void actionPerformed(ActionEvent e)
	{ 
		String strp=e.getActionCommand();
		try
		{
			 a=Integer.parseInt(t1.getText());

			 b=Integer.parseInt(t2.getText());
			 	if (strp.equals("add")) 
			{
					c=a+b;
			t3.setText("Addition is "+c);
		
			}
			 	if (strp.equals("Sub")) 
			{
					c=a-b;
			t3.setText("Sub is "+c);
		
			}
			 	if (strp.equals("Mul")) 
			{
					c=a*b;
			t3.setText("Mul is "+c);
		
			}
			 	if (strp.equals("Div")) 
			{
					c=a/b;
			t3.setText("Div is "+c);
		
			}

		}

		catch(Exception ex)
		{
		}
			

		
			

		
	}
	public static void main(String[] args) {
		App ast=new App();
		ast.ini2();
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we)
	{
	
	}

	public void windowActivated(WindowEvent we)
	{
	
	}

	public void windowIconified(WindowEvent we)
	{
	
	}
	
	public void windowDeiconified(WindowEvent we)
	{
	
	}

	public void windowClosed(WindowEvent we)
	{
	
	}

	public void windowOpened(WindowEvent we)
	{
	
	}
}