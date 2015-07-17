// Lab 09: The Composition/Inheritance Program
// Name:Amir Mousavi		  
// Oct/31/2013
// Teacher: Christopher Slowley
import java.applet.*;
import java.awt.*;

public class Lab09 extends Applet {  //
	   
	private static final long serialVersionUID = 1L;

	public void paint (Graphics g)
	   {
		   House h = new House(g,100); //The House is created
	   }
	}
class rectangle //class rectangle is declared
{
	private Color rectangleColor;
	public rectangle (Graphics g,Color cc,int x )
	{
		rectangleColor= cc;
		g.setColor(rectangleColor);
		g.fillRect(x,250,200,150); 
	}
}
class square extends rectangle //class square is declared, subclass of rectangle
{   private int x;

	public square(Graphics g, Color cc, int x1)
	{
	super(g, cc, x1);
	x = x1;
	drawWindow(g);
	drawDoor(g);
	drawRoof(g);
	}

	public void drawWindow(Graphics g)  //the windos of house
	{
		g.setColor(Color.white); 
		g.fillOval(x+100,300,50,50); 
		g.setColor(Color.black);
		g.drawLine(x+125, 300, x+125, 350);
		g.drawLine(x+100, 325, x+150, 325);
	}
	public void drawDoor(Graphics g)  //the door of the house
	{
		g.setColor(Color.blue); 
		g.fillRect(x+20, 320, 30, 80);
		g.setColor(Color.yellow);
		g.fillOval(x+20, 350, 5, 5);
	}
	public void drawRoof(Graphics g) //the roof of the house
	{
		 Polygon roof = new Polygon(); 
		 roof.addPoint(x,250); 
		 roof.addPoint(x+200,250); 
		 roof.addPoint(x+100,180); 
		 g.setColor(Color.red); 
		 g.fillPolygon(roof); 
	}
}
class House //the class house, which passes out the info
{
	private square squ;
	public House (Graphics g,int x)
	{
		squ= new square(g,Color.green , 100);
	} 
}
