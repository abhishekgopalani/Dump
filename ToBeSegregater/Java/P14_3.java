//applet with parameter 

import java.awt.*;
import java.applet.*;
public class P14_3 extends Applet
{
	
	 	String str;
	public void init()
	{

		str=getParameter("String");
			if(str==null)
			{
				str="java";
			}
			else 
			{
				str=str+"java";
			}

	}
			public void paint(Graphics g)
		{
			g.drawString(str,10,100);
		}
}