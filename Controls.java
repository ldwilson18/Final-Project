import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Controls extends JPanel
{
public Controls()
{
	setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.gridx = 0;
	gbc.gridy = 0;
	JLabel title = new JLabel("Controls");
	add(title,gbc);
	gbc.gridx = 0;
	gbc.gridy = 1;
	JLabel keys = new JLabel("The left arrow key moves the character to the left");
	keys.setPreferredSize(new Dimension(300,30));
	add(keys,gbc);
	gbc.gridx = 0;
	gbc.gridy = 2;
	JLabel keys2 = new JLabel("The right arrow  key mover the chracter to the right");
	keys2.setPreferredSize(new Dimension(300,30));
	add(keys2,gbc);
	
	
}
}
