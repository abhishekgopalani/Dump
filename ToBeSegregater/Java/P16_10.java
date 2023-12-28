import java.awt.*;
import java.io.*;

class P16_10 extends Frame
	
{
	
			TextField number,name,marks;
			Label numLabel,nameLabel,marksLabel;
			Button Done,Enter;
		
				P16_10 ()
				{
					super ("Writing in Student File");
				}
				
				void setup()
				{	
					resize(400,200);
					setLayout(new GridLayout(4,2));
					number=new TextField(25);
					name= new TextField (25);
					marks=new TextField(25);
					numLabel = new Label("Roll Number");
					nameLabel = new Label("Name");
					marksLabel = new Label("Marks");
					Done= new Button("Done");
					Enter = new Button("Enter");
					add(numLabel);
					add(number);
					add(nameLabel);
					add(name);						
					add(marksLabel);
					add(marks);
					add(Done);
					add(Enter);
				}
			public static void main(String args[])
			{
				P16_10 st = new P16_10();
				st.setup();
			}
	}