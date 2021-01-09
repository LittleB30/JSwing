package Examples;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonDemoMultipleListenerClasses {

	private JTextField countField = null;
	private AddOneListener addOneButtonListener = new AddOneListener();
	private AddTwoListener addTwoButtonListener = new AddTwoListener();
	private JButton addOne = null;
	private JButton addTwo = null;
	private JPanel panel = null;
	private static JFrame frame = null;

	public JPanel createGUI() {
		/*
		 * https://docs.oracle.com/javase/tutorial/uiswing/components/panel.html
		 */
		panel = new JPanel();

		JLabel label = new JLabel("Click Count - ");
		panel.add(label);
		// Textfield
		// https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html
		// https://docs.oracle.com/javase/7/docs/api/javax/swing/JTextField.html
		countField = new JTextField();
		countField.setText("00");
		Font f = new Font("Roman", Font.BOLD, 16);
		countField.setFont(f);
		countField.setEditable(false);
		panel.add(countField);

		// Button "Add 1"
		// https://docs.oracle.com/javase/7/docs/api/javax/swing/JButton.html
		// https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
		addOne = new JButton("Add One");
		// This name uniquely identifies addOne button
		addOne.setName("addOne");
		/*
		 * addOneButtonListener - is the listener which is going to accept & process the
		 * events generated by addOne button addOneButtonListener - is of type
		 * AddOneListener which implements ActionListener
		 */
		addOne.addActionListener(addOneButtonListener);
		panel.add(addOne);

		addTwo = new JButton("Add Two");
		// This name uniquely identifies this button
		addTwo.setName("addTwo");
		/*
		 * addTwoButtonListener - is the listener which is going to accept & process the
		 * events generated by addTwo button. addTwoButtonListener - is of type
		 * AddTwoListener which implements ActionListener
		 */
		addTwo.addActionListener(addTwoButtonListener);
		panel.add(addTwo);

		return panel;
	}

	/*
	 * The listener class only process events from addOne button 
	 * Implements ActionListener
	 * https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html
	 * https://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
	 */
	public class AddOneListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int c = new Integer(countField.getText()).intValue();
			c++;
			countField.setText(new Integer(c).toString());
		}

	}

	/*
	 * The listener class only process events from addTwo button 
	 * Implements ActionListener
	 */
	public class AddTwoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int c = new Integer(countField.getText()).intValue();
			c += 2;
			countField.setText(new Integer(c).toString());
		}

	}

	private static void createAndShowGUI() {
		// Create and set up the window.
		frame = new JFrame("Button & Listener Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JButtonDemoMultipleListenerClasses().createGUI());
		// Display the window.
		frame.setSize(450, 260);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
