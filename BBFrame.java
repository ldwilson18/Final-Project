import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class BBFrame extends JFrame implements ActionListener{
	private BBFace_Open closedFace;
	
	public BBFrame()
	{	ArrayList<BeebeBalls> balls = new ArrayList<BeebeBalls>();
		setBounds(100,100,600,400);
		closedFace = new BBFace_Open(600,600);
		setLayout(null);
		add(closedFace);
		addKeyListener(new KeyListener()
				{
					
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode()==e.VK_D)
						{
							closedFace.right();
							closedFace.changeFace();
						}
						if(e.getKeyCode()==e.VK_A)
						{
							closedFace.left();
							closedFace.changeFace();
						}
						
					}
					@Override
					public void keyReleased(KeyEvent e) {

						if(e.getKeyCode()==e.VK_D)
						{
							closedFace.right();
						}
						if(e.getKeyCode()==e.VK_A)
						{
							closedFace.left();
						}
		
						
					}
					@Override
					public void keyTyped(KeyEvent arg0) {
					}
				}
				
				);
		Timer track = new Timer();
		track.scheduleAtFixedRate(new TimerTask() {
		int determinant;	  @Override
			  public void run() {
			  	determinant = (int) ((Math.random()*1000) + 1);
			  	
			  	if(determinant<300)
			  	{
			  		BeebeBalls RedBall= new Ming_RedBall((int)(Math.random()*600)+1,0);
			  		balls.add(RedBall);
			  		add(RedBall);
			  	}
			  	else if(301<determinant&&determinant<700)
			  	{	
			  		BeebeBalls BlueBall = new BlueBall((int)(Math.random()*600)+1,0);
			  		balls.add(BlueBall);
			  		add(BlueBall);
			  	}
			  	
			  	else if(701<determinant&&determinant<800)
			  	{
			  		BeebeBalls clock = new Ming_ClockBall((int)(Math.random()*600+1),0);
			  		balls.add(clock);
			  		add(clock);
			  	}
			  	
			  	else if(801<determinant&&determinant<900)
			  	{
			  		BeebeBalls speed = new Ming_SpeedBall((int)(Math.random()*600+1),0);
			  		balls.add(speed);	
			  		add(speed);
			  	}
			  	else
			  	{
			  		BeebeBalls arrow= new Ming_Arrow((int)(Math.random()*600+1),0);
			  		balls.add(arrow);	
			  		add(arrow);
			  	}
			  }
		}, 0,100);
	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	
	public static void main(String[] args) throws Exception {
			ArrayList<BeebeBalls> balls = new ArrayList<BeebeBalls>();
			BBFrame frame = new BBFrame();
			
			File fis = new File("100Hz_44100Hz_16bit_05sec.wav");
	        Clip clip = AudioSystem.getClip();
	        AudioInputStream ais = AudioSystem.getAudioInputStream(fis);
	        clip.open(ais); 
			clip.loop(-1);	          
	
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
