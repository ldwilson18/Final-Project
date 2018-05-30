import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Speed extends JComponent
{
	int dx = 0;
	int dy = 0;
	public Speed(int x, int y)
	{
		setLocation(x,y);
		setSize(20,40);
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.YELLOW);
		Rectangle top = new Rectangle(0,13, 13,3);
		g2.fill(top);
		Rectangle left = new Rectangle(0,13,3,15);
		g2.fill(left);
		Rectangle mid = new Rectangle(0,25,10,3);
		g2.fill(mid);
		Rectangle right = new Rectangle(10,25,3,15);
		g2.fill(right);
		Rectangle bot = new Rectangle(0,37,10,3);
		g2.fill(bot);
		
		
		
		
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
