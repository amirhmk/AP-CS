// Lab06: The Random Graphics Program
// Name:Amir Mousavi		  
// Sep/14/2013
// Teacher: Christopher Slowley 
  
import java.awt.*;  
import java.applet.*;  
import java.util.*;   
  
public class Lab06 extends Applet {  
	
	private static final long serialVersionUID = 1L;
	public void init() {  
        resize(800,600);  
    }  
	public void paint(Graphics g) {  

        // Draw Grid  
        g.drawRect(10,10,780,580);  
        g.drawLine(400,10,400,590);  
        g.drawLine(10,300,790,300);  
          
        Random rnd = new Random(1234); 
        for (int k = 10; k <= 400; k+=10) { // The first box lines
               g.drawLine(k,20,k,290); }    // The dimentions of the lines
        for (int k = 10; k <= 290; k+=10) { // The second box lines
        	g.drawLine(420, k, 770, k);     // The dimestions
        	int red = rnd.nextInt(256);     //The colors
        	int green = rnd.nextInt(256); 
        	int blue = rnd.nextInt(256); 
        	g.setColor(new Color(red,green,blue)); // The randomness of colors
        	}
        for (int k = 1; k <= 100; k++) {     // The 3rd circles
            int x = rnd.nextInt(330);        // the random of x lo
            int y = rnd.nextInt(230);        // the randm of y
            int red = rnd.nextInt(256);     // the random of colors
            int green = rnd.nextInt(256); 
            int blue = rnd.nextInt(256); 
            g.setColor(new Color(red,green,blue)); 
            g.fillOval(x+10,y+300,50,50);}   // the place of all the ovals
        
	        Polygon side1 = new Polygon(); //blue side of cube
	        side1.addPoint(600, 410);
	        side1.addPoint(635, 410);
	        side1.addPoint(635, 480);
	        side1.addPoint(600, 445);
	        g.setColor(Color.blue);
	        g.fillPolygon(side1);
	        Polygon side2 = new Polygon(); //green side of cube
	        side2.addPoint(510, 380);
	        side2.addPoint(550, 410);
	        side2.addPoint(550, 495);
	        side2.addPoint(510, 455);
	        g.setColor(Color.green);
	        g.fillPolygon(side2);
	        Polygon side3 = new Polygon(); //yellow side of cube
	        side3.addPoint(550, 445);
	        side3.addPoint(600, 445);
	        side3.addPoint(635, 480);
	        side3.addPoint(550, 495);
	        g.setColor(Color.yellow);
	        g.fillPolygon(side3);
	        Polygon side4 = new Polygon(); //red side of cube
	        side4.addPoint(510, 380);
	        side4.addPoint(550, 410);
	        side4.addPoint(635, 410);
	        side4.addPoint(600, 380);
	        g.setColor(Color.red);
	        g.fillPolygon(side4);
	        // TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
	
	}}
		
	
