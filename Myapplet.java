import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{	Font f;
 
	public void init()
	{
		setBackground(Color.lightGray);

			f=new Font("Algerian",Font.BOLD,100);
	
	}
	public void paint(Graphics g)
	{

		g.drawLine(12,21,212,21);
		g.drawString("Hello Java World.",30,70);

	}
}/*
<applet code=Myapplet width=400 height=400>
</applet>*/