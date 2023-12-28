import java.awt.*;
import java.applet.*;

class P14_6 extends Applet
{
	TextField t1;
	TextField t2;
	public void init()
	{
		t1 = new TextField(8);
		t2 = new TextField(8);
		add(t1);
		add(t2);
		t1.setText("0");
		t2.setText("0");
	}
	public void paint(Graphics g)
	{
		g.drawString("Enter value of A and B in each box",10,20);
		
		int x=0,y=0,z=0;
		String s1,s2,s;
		
		try
		{
			s1=t1.getText();
			x=Integer.parseInt(s1);
			s2=t2.getText();
			z=Integer.parseInt(s2);
		}
		catch (Exception e)
		{
			g.drawString("error recieved ",10,10);
		}
		z=x+y;
		s=String.valueOf(z);
		g.drawString("Sum od A and B is ",20,20);
		
	}
	public boolean action(Event event,Object object)
	{ 
		repaint( );
		return true;
	}
}