import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class DrawApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(80,120,160,120);
		g.drawOval(10,10,100,100);
		g.drawLine(250,280,290,280);
	}
	

}

/*
<applet code="DrawApplet.class" width="400" height="400">
</applet>
*/