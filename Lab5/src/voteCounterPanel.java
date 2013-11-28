// ************************************************************
// VoteCounterPanel.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
// ************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class voteCounterPanel extends JPanel{
	private int votesForJoe;
	private JButton joe;
	private JLabel labelJoe;
	private int votesForMoe;
	private JButton Moe;
	private JLabel labelMoe;
	// ------------------------------------------------
	// Constructor: Sets up the GUI.
	// ------------------------------------------------
	public voteCounterPanel(){
		votesForJoe = 0;
		joe = new JButton("Vote for Joe");
		joe.addActionListener(new JoeButtonListener());
		labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
		add(joe);
		add(labelJoe);
		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.cyan);
		
		votesForMoe = 0;
		Moe = new JButton("Vote for Moe");
		Moe.addActionListener(new MoeButtonListener());
		labelMoe = new JLabel("Votes for Moe: " + votesForMoe);
		add(Moe);
		add(labelMoe);
		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.green);
	}
	// **************************************************
	// Represents a listener for button push (action) events
	// **************************************************
	private class JoeButtonListener implements ActionListener{
		//---------------------------------------------
		// Updates the counter and label when Vote for Joe
		// button is pushed
		//---------------------------------------------
		public void actionPerformed(ActionEvent event){
			votesForJoe++;
			labelJoe.setText("Votes for Joe: " + votesForJoe);
		}
	}
	
	private class MoeButtonListener implements ActionListener{
		//---------------------------------------------
		// Updates the counter and label when Vote for Moe
		// button is pushed
		//---------------------------------------------
		public void actionPerformed(ActionEvent event){
			votesForMoe++;
			labelMoe.setText("Votes for Moe: " + votesForMoe);
		}
	}
}