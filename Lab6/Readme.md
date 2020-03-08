# Java Applet
Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client side.

#### Advantage of Applet
There are many advantages of applet. They are as follows:

1. It works at client side so less response time.
1. Secured
1. It can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc.

#### Drawback of Applet
Plugin is required at client browser to execute applet.

---


#### Lifecycle of Java Applet
1. Applet is initialized.
1. Applet is started.
1. Applet is painted.
1. Applet is stopped.
1. Applet is destroyed. 


--- 

#### Displaying Graphics in Applet
java.awt.Graphics class provides many methods for graphics programming.

* Commonly used methods of Graphics class:
+ public abstract void drawString(String str, int x, int y): is used to draw the specified string.
+ public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
+ public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
+ public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
+ public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
+ public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
+ public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
+ public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
+ public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
+ public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
+ public abstract void setFont(Font font): is used to set the graphics current font to the specified font.
