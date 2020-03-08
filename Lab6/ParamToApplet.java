import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class ParamToApplet extends Applet
{
	public void paint(Graphics g)
	{
		String n = getParameter("Name");
		String a = getParameter("Age");
		g.drawString("Name is: " + n, 20, 20);
		g.drawString("Age is: " + a, 20, 40);
	}
}
/*
	<applet code="ParamToApplet.class" height="300" width="500">
		<param name="Name" value="Aadarsha" />
		<param name="Age" value="20" />
	</applet>
*/

