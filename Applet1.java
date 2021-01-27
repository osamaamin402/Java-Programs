import java.applet.*;
import java.awt.*;
public class Applet1 extends Applet
{	
	public void paint(Graphics g)
	{

		g.drawLine(12,21,212,21);
		g.drawString("Hello Java World.",30,70);

	}
}/*
<applet code=Applet1 width=400 height=400>
</applet>*/