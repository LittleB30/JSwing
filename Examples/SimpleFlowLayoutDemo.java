package Examples;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimpleFlowLayoutDemo{
	
	JLabel label = null;
	JButton button = null;
	JTextField text = null;
	JTextField text2 = null;
	JTextField text3 = null;
	JFrame frame = null;
	
	public SimpleFlowLayoutDemo(String name) {
		frame = new JFrame("Simple Demo");
		label = new JLabel("Label");
		button = new JButton("Submit Button");
		text = new JTextField(10);
		text2 = new JTextField(10);
		text3 = new JTextField(10);

	}

	public void addComponents() {
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(button);
		frame.add(text);frame.add(text2);frame.add(text3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		SimpleFlowLayoutDemo demo = new SimpleFlowLayoutDemo("FlowLayoutDemo");
		demo.addComponents();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}