// Lab13.java  
// The Paint Brush Program  
// Amir Mousavi  
// Jan/19/14 
// AP Computer Science  
  
import java.applet.Applet;  
import java.awt.*;  
  
public class Lab13 extends Applet {  //all variables declared
	private static final long serialVersionUID = 1L;
	Rectangle red, blue, green, black, yellow;
    int numColor, numTool, xClick, yClick; 
    int[] xCoord,yCoord; 
    int pointCount; 
  
    public void init() {  //all variables with valuees declared
        numColor = 1;  
        numTool = 1;  
        red = new Rectangle(5, 5, 42, 42);  
        blue = new Rectangle(5, 47, 42, 42);  
        green = new Rectangle(5, 89, 42, 42);
        black = new Rectangle(5, 131, 42, 42);
        yellow = new Rectangle(5, 173, 42, 42);
        xCoord = new int[10000]; 
        yCoord = new int[10000]; 
        pointCount = 0; 
    }  
  
    public void paint(Graphics g) {   // the colors boxes are made
        g.setColor(Color.red);  //red box
        g.fillRect(5, 5, 42, 42);  
        g.setColor(Color.blue); //blue box
        g.fillRect(5,47,42,42); 
        g.setColor(Color.green); //green box
        g.fillRect(5,89,42,42); 
        g.setColor(Color.black); //black box
        g.fillRect(5,131,42,42);
        g.setColor(Color.yellow); //yellow boz
        g.fillRect(5,173,42,42);

        switch (numColor) {  //choosing color option
        case 1:  
            g.setColor(Color.red);  //red option
            break;  
        case 2:
        	g.setColor(Color.blue); //blue option
        	break;
        case 3:
        	g.setColor(Color.green); //green option
        	break;
        case 4:
        	g.setColor(Color.black);//black option
        	break;
        case 5:
        	g.setColor(Color.yellow); //yellow option
        	break;
        }  
  
        switch (numTool) {  //determines which color to fill the rectangle with
        case 1:  
            g.fillRect(xClick, yClick, 2, 2);  
            break;  
        }  
        for (int k = 0; k < pointCount; k++) 
        g.fillRect(xCoord[k],yCoord[k],2,2);
    }  
    public boolean mouseDrag(Event e, int x, int y) //free-hand drawing
    { 
    	xCoord[pointCount] = x; 
    	yCoord[pointCount] = y; 
    	pointCount++; 
    	repaint(); 
    	return true; 
    } 
    @SuppressWarnings("deprecation")
	public boolean mouseDown(Event e, int x, int y) {  // the pixel drawing
    	if(red.inside(x,y)) 
    		 numColor = 1; 
    	else if(blue.inside(x,y)) 
    		 numColor = 2; 
    	else if(green.inside(x,y)) 
    		 numColor = 3; 
    	else if(black.inside(x,y)) 
        		 numColor = 4; 
    	else if(yellow.inside(x,y)) 
    	numColor = 5; 
    	xClick = x;  
    	yClick = y;  
    	repaint();  
    	return true;  
    }  
} 
