package Game15Puzzle;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class StopWatch extends JPanel implements ActionListener
{

	JFrame frame = new JFrame();
	JLabel timelabel = new JLabel();
	int elapsedTime = 0;
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	boolean started = false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	Timer timer = new Timer(1000, new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			elapsedTime = elapsedTime + 1000;
			hours = elapsedTime/3600000;
			minutes = (elapsedTime/60000) % 60;
			seconds = (elapsedTime/1000) % 60;
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			timelabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		}
	});
	
	StopWatch(){
		timelabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
		timelabel.setBounds(100,100,200,100);
		timelabel.setFont(new Font("Verdana", Font.PLAIN, 35));
		timelabel.setBorder(BorderFactory.createBevelBorder(1));
		timelabel.setOpaque(true);
		timelabel.setHorizontalAlignment(JTextField.CENTER);
		add(timelabel);
		setBackground(Color.white);
		
		

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	void start() {
		timer.start();

	}
	
	void stop() {
		timer.stop();
	}

}
