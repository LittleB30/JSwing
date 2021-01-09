package Examples;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SimpleJFrameDemo extends JFrame {

	/**
	 * Create the GUI and show it. 
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		SimpleJFrameDemo frame = new SimpleJFrameDemo();
		frame.setTitle("Simple JFrame Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	/**
	 * Best practice to create an UI using different thread	 
	 * @param args
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}