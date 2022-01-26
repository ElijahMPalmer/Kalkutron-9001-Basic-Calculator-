//********************************************************************************************************
// CLASS: View (View.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2020
// Project Number: 4
// 
// TEAM NAME: 22
// AUTHOR 1: Elijah Palmer, Empalme2, empalme2@asu.edu 
// AUTHOR 2: Ricardo Salazar, rasalaz5, rasalaz5@asu.edu 
// AUTHOR 3: Amber Summeralls, Asummera, Asummera@asu.edu
//********************************************************************************************************

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The View class implements the GUI.
 */
public class View extends JFrame implements ActionListener {

	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 180;

	// Declare instance variables
	private JButton mClearButton;
	private JButton mEvalButton;
	private JTextField mInputText;
	private JButton mExitButton;
	private Main mMain;
	private JLabel mResultLabel;

	/**
	 * View()
	 *
	 * The View constructor creates the GUI interface and makes the frame visible at
	 * the end.
	 */
	public View(Main pMain) {

		mMain = pMain;

		// Declared and created a JPanel named panelLabel using the default FlowLayout
		// layout manager.

		JPanel panelLabel = new JPanel(); // declare
		mResultLabel = new JLabel("");
		panelLabel.add(mResultLabel);

		// Declared and created a JPanel named panelInput using the default FlowLayout
		// layout manager.
		// Create mInputText as a JTextField initialized to 40 columns wide
		JPanel panelInput = new JPanel();

		mInputText = new JTextField(40); // Jtext to 40 pixels
		panelInput.add(mInputText);

		JPanel panelButtons = new JPanel();

		mClearButton = new JButton("Clear"); // step 1 clear button (cb)
		mClearButton.addActionListener(this); // step 2 (cb)
		panelButtons.add(mClearButton); // step 3 (cb)

		mEvalButton = new JButton("Evaluate"); // step 1 evaluate button
		mEvalButton.addActionListener(this); // step 2 (eb)
		panelButtons.add(mEvalButton); // step 3 (eb)

		mExitButton = new JButton("Exit"); // step 1 exit button
		mExitButton.addActionListener(this); // step 2 (exb)
		panelButtons.add(mExitButton); // step 3 (exb)

		// Create a JPanel named panelMain using a vertical BoxLayout.
		// Add some vertical glue to panelMain

		JPanel panelMain = new JPanel();

		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));// y is vertical
		panelMain.add(Box.createVerticalGlue());// adding space

		// Add panelLabel to panelMain.
		panelMain.add(panelLabel);

		// Add panelInput to panelMain.
		panelMain.add(panelInput);

		// Add panelButtons to panelMain.
		panelMain.add(panelButtons);

		setTitle("Kalkutron-9001");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panelMain);
		setVisible(true);
	}

	/**
	 * The actionPerformed method is called when one of the JButtons is clicked and
	 * detects which button was clicked and handles it.
	 * 
	 */

	public void actionPerformed(ActionEvent pEvent) { // for the button click
		if (pEvent.getSource() == mClearButton) {
			clear();
		} else if (pEvent.getSource() == mEvalButton) {
			evaluate();
		} else if (pEvent.getSource() == mExitButton) {
			mMain.exit();
		}

	}

	/**
	 * The clear() method is called when the Clear button is clicked and will set
	 * the text in mInputText and mResultLabel to the empty strings.
	 */

	private void clear() {

		// initiate loop
		if (mInputText == null)
			return;

		else {
			// set text to empty string
			mInputText.setText("");
		}

		// initiate next loop
		if (mResultLabel == null)
			return;

		else {
			// set label to empty string
			mResultLabel.setText("");

		}
	}

	/**
	 * This method will exit the Jframe when called.
	 */

	private void exit() {
		System.exit(0);
	}

	/**
	 * This is a method to retrieve the text string from mInputText and declares and
	 * create an Expression object named expr passing the text string to the ctor.
	 */

	public void evaluate() {

		String evaluate = mInputText.getText();
		Expression expr = new Expression(evaluate);
		Double result = expr.evaluate();
		mResultLabel.setText(result.toString());
	}

	/**
	 * This method will display a dialogue message box.
	 */

	public void messageBox(String pMessage) {
		JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
	}

}
