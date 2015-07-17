/*********************************
	Lab05:  Control Structures Meet Graphics
    Name: Amir Mousavi
    Submitted: June 28, 2013
    Teacher: Christopher Slowley
	 *******************************/

import java.awt.*;
import java.applet.*;

public class Lab05 extends Applet {
	
	private static final long serialVersionUID = 1L;
	final int width = 800;
	final int height = 600;
	public void init() {
		resize(width+20,height+20);
	}
	public void paint(Graphics g) {
	g.drawRect(10,10,width,height);
		 
		 for (int y = 10; y <= 610; y += 20) {
		 g.drawLine(10,10,810,y);
		 g.drawLine(810,10,10,y);
		 g.drawLine(810,610,10,y);
		 g.drawLine(10,610,810,y);
		 }
	}

}
