import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Arrow extends JComponent 
{
	int dx = 0;
	int dy = 0;
	public Arrow(int x, int y)
	{
		setLocation(x,y);
		setSize(20,40);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Polygon head = new Polygon(new int[] {0,10,5}, new int [] {20,20,0}, 3) ;
		g2.setColor(Color.GREEN);
		g2.fill(head);
		Rectangle body = new Rectangle(4,20,3,15);
		g2.fill(body);
	}
	public void setDY(int y)
	{
		dy = y;
	}
	public  void setDX(int x)
	{
		dx = x;
	}
	public void update()
	{
		setLocation(getX() + dx, getY() + dy);
	}
}
