import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class AppletCycle extends Applet
{

	public void init()
	{
		System.out.println("Init");
	}
	public void start()
	{
		System.out.println("start");
	}
	public void paint(Graphics g)
	{
		System.out.println("paint");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
}
/*
<applet code="AppletCycle.class" width="400" height="400">
</applet>
*/

