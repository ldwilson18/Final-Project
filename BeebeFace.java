import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class BeebeFace extends JComponent
{
	private BufferedImage regularBeebe;
	private int dx = 0, dy = 0;
	
	public BeebeFace(int x, int y)
	{
		try 
		{
			regularBeebe = ImageIO.read(new File("mouth closed.png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		setSize(regularBeebe.getWidth(),regularBeebe.getHeight());
		setLocation(x,y);
	}
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(regularBeebe,0,0,this);
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
		setLocation(getX() + dx, getY() +  dy);
	}
}
