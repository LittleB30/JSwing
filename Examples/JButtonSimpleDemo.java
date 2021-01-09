package Examples;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonSimpleDemo{

	private JTextField countField = null;
	private MyListener buttonListener = new MyListener();
	private JButton addOne = null;
	private JButton addTwo  = null;
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
		 *  buttonListener - is the listener which is going to accept & process 
		 *  the events generated by addOne button 
		 *  buttonListener - is of type MyListener which implements ActionListener
		 */
		addOne.addActionListener(buttonListener);
		panel.add(addOne);
		
		addTwo = new JButton("Add Two");
		// This name uniquely identifies this button
		addTwo.setName("addTwo");
		/*
		 *  buttonListener - is the listener which is going to accept & process 
		 *  the events generated by addTwo button. 
		 *  buttonListener - is of type MyListener which implements ActionListener
		 */
		addTwo.addActionListener(buttonListener);
		panel.add(addTwo);
		
		return panel;
	}
	/*
	 *  The listener class accepts and process events from two buttons - addOne & addTwo 
	 *  Implements ActionListener
	 *  https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html
	 *  https://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
	 */
	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// Get the source of the events
			JButton source = (JButton)e.getSource();
			// Get the name of the source
			String sourceName = source.getName();
			int c = new Integer(countField.getText()).intValue();
			if(sourceName.equals("addOne")){
				c++;
				countField.setText(new Integer(c).toString());
			}else if(sourceName.equals("addTwo")){
				c+=2;
				countField.setText(new Integer(c).toString());
			}
		}
		
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        frame = new JFrame("Button & Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JButtonSimpleDemo().createGUI());
        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }

	
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	
}