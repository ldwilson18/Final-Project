import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Clock extends JComponent 
{
	int dx = 0;
	int dy = 0;
	public Clock(int x, int y)
	{
		setLocation(x,y);
		setSize(20,40);
	}
	
	public void paintComponent(Graphics g)
	{
	Graphics2D g2 = (Graphics2D) g;
	Ellipse2D.Double circle = new Ellipse2D.Double(0,0,20,20);
	g2.setColor(Color.MAGENTA);
	g2.fill(circle);
	Rectangle bigHand = new Rectangle(9,2,2,10);
	g2.setColor(Color.WHITE);
	g2.fill(bigHand);
	Rectangle smallHand = new Rectangle(10,10,7,3);
	g2.fill(smallHand);
	}
	public void setDY(int y)
	{
		dy = y;
	}
	public void setDX(int x)
	{
		dx = x;
	}
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
}
