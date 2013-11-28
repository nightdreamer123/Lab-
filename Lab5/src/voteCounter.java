// ************************************************************
// VoteCounter.java
//
// Demonstrates a graphical user interface and event listeners to
// tally votes for two candidates, Joe and Sam.
// ************************************************************
import javax.swing.JFrame;
public class voteCounter{
// --------------------------------------------
// Creates the main program frame.
// --------------------------------------------
	public static void main(String[] args){
		JFrame frame = new JFrame("Vote Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new voteCounterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}