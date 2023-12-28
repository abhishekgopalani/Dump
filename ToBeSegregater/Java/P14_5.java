import java.awt.*;
import java.applet.*;

class P14_5 extends Applet
{
	public void paint (Graphics g)
	{
		int a=10;
		int b=20;
		int c=a+b;
		String s = "Sum of a and b : "+ String.valueOf(c);
		g.drawString(s,100,100);	
		
	}
}