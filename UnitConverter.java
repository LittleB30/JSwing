

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UnitConverter extends JFrame {
	private Panel distance;
	private Panel weight;
	private JButton resetDistance;
	private JButton resetWeight;
	private JButton calculateDistance;
	private JButton calculateWeight;
	private JTextField distance1Text;
	private JTextField distance2Text;
	private JTextField distance3Text;
	private JTextField distance4Text;
	private JTextField distance5Text;
	private JTextField distance6Text;
	private JTextField weight1Text;
	private JTextField weight2Text;
	private JTextField weight3Text;
	private JTextField weight4Text;
	private JTextField weight5Text;
	private JTextField weight6Text;
	private MyListener buttonListener = new MyListener();
	private MyMouseListener mouseListener = new MyMouseListener();
	
	/**
	 * Create the GUI and show it. 
	 */
	private void createGUI() {
		JTabbedPane tabbedPane = new JTabbedPane();
		
		distance = new Panel();
		tabbedPane.addTab("Distance", distance);
		weight = new Panel();
		tabbedPane.addTab("Weight", weight);
		
		distance.setLayout(new GridLayout(5,2));
		distance.add(new Label("English"));
		distance.add(new Label("Metric"));
		Panel distance1 = new Panel();
			distance1.setLayout(new GridLayout(2,0));
			distance1.add(new Label("Inches"));
			distance1Text = new JTextField("1");
			distance1Text.setName("distance1Text");
			distance1Text.addMouseListener(mouseListener);
			distance1.add(distance1Text);
		distance.add(distance1);
		Panel distance2 = new Panel();
			distance2.setLayout(new GridLayout(2,0));
			distance2.add(new Label("Centimeters"));
			distance2Text = new JTextField();
			distance2Text.setName("distance2Text");
			distance2Text.addMouseListener(mouseListener);
			distance2.add(distance2Text);
		distance.add(distance2);
		Panel distance3 = new Panel();
			distance3.setLayout(new GridLayout(2,0));
			distance3.add(new Label("Feet"));
			distance3Text = new JTextField();
			distance3Text.setName("distance3Text");
			distance3Text.addMouseListener(mouseListener);
			distance3.add(distance3Text);
		distance.add(distance3);
		Panel distance4 = new Panel();
			distance4.setLayout(new GridLayout(2,0));
			distance4.add(new Label("Meters"));
			distance4Text = new JTextField();
			distance4Text.setName("distance4Text");
			distance4Text.addMouseListener(mouseListener);
			distance4.add(distance4Text);
		distance.add(distance4);
		Panel distance5 = new Panel();
			distance5.setLayout(new GridLayout(2,0));
			distance5.add(new Label("Miles"));
			distance5Text = new JTextField();
			distance5Text.setName("distance5Text");
			distance5Text.addMouseListener(mouseListener);
			distance5.add(distance5Text);
		distance.add(distance5);
		Panel distance6 = new Panel();
			distance6.setLayout(new GridLayout(2,0));
			distance6.add(new Label("Kilometers"));
			distance6Text = new JTextField();
			distance6Text.setName("distance6Text");
			distance6Text.addMouseListener(mouseListener);
			distance6.add(distance6Text);
		distance.add(distance6);
		
		resetDistance = new JButton("Reset");
		resetDistance.setName("Reset Distance");
		resetDistance.addActionListener(buttonListener);
		distance.add(resetDistance);
		
		calculateDistance = new JButton("Calculate");
		calculateDistance.setName("Calculate Distance");
		calculateDistance.addActionListener(buttonListener);
		distance.add(calculateDistance);
		
/*-------------------------------------------------------------------*/		
		
		weight.setLayout(new GridLayout(5,2));
		weight.add(new Label("English"));
		weight.add(new Label("Metric"));
		Panel weight1 = new Panel();
			weight1.setLayout(new GridLayout(2,0));
			weight1.add(new Label("Ounces"));
			weight1Text = new JTextField("1");
			weight1Text.setName("weight1Text");
			weight1Text.addMouseListener(mouseListener);
			weight1.add(weight1Text);
		weight.add(weight1);
		Panel weight2 = new Panel();
			weight2.setLayout(new GridLayout(2,0));
			weight2.add(new Label("Milligrams"));
			weight2Text = new JTextField();
			weight2Text.setName("weight2Text");
			weight2Text.addMouseListener(mouseListener);
			weight2.add(weight2Text);
		weight.add(weight2);
		Panel weight3 = new Panel();
			weight3.setLayout(new GridLayout(2,0));
			weight3.add(new Label("Pounds"));
			weight3Text = new JTextField();
			weight3Text.setName("weight3Text");
			weight3Text.addMouseListener(mouseListener);
			weight3.add(weight3Text);
		weight.add(weight3);
		Panel weight4 = new Panel();
			weight4.setLayout(new GridLayout(2,0));
			weight4.add(new Label("Grams"));
			weight4Text = new JTextField();
			weight4Text.setName("weight4Text");
			weight4Text.addMouseListener(mouseListener);
			weight4.add(weight4Text);
		weight.add(weight4);
		Panel weight5 = new Panel();
			weight5.setLayout(new GridLayout(2,0));
			weight5.add(new Label("Tons"));
			weight5Text = new JTextField();
			weight5Text.setName("weight5Text");
			weight5Text.addMouseListener(mouseListener);
			weight5.add(weight5Text);
		weight.add(weight5);
		Panel weight6 = new Panel();
			weight6.setLayout(new GridLayout(2,0));
			weight6.add(new Label("Kilograms"));
			weight6Text = new JTextField();
			weight6Text.setName("weight6Text");
			weight6Text.addMouseListener(mouseListener);
			weight6.add(weight6Text);
		weight.add(weight6);
		
		resetWeight = new JButton("Reset");
		resetWeight.setName("Reset Weight");
		resetWeight.addActionListener(buttonListener);
		weight.add(resetWeight);
		calculateWeight = new JButton("Calculate");
		calculateWeight.setName("Calculate Weight");
		calculateWeight.addActionListener(buttonListener);
		weight.add(calculateWeight);
		
		add(tabbedPane);
	}
	
	public class MyListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			String sourceName = source.getName();
			switch (sourceName) {
				case "Reset Distance":
					resetDistance();
					break;
				case "Calculate Distance":
					calculateDistance();
					break;
				case "Reset Weight":
					resetWeight();
					break;
				case "Calculate Weight":
					calculateWeight();
					break;
			}
		}
	}
	
	public class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JTextField source = (JTextField)e.getSource();
			String sourceName = source.getName();
			switch (sourceName) {
				case "distance1Text":
				case "distance2Text":
				case "distance3Text":
				case "distance4Text":
				case "distance5Text":
				case "distance6Text":
					resetDistance();
					break;
				case "weight1Text":
				case "weight2Text":
				case "weight3Text":
				case "weight4Text":
				case "weight5Text":
				case "weight6Text":
					resetWeight();
					break;
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
	}
	
	private void resetDistance() {
		distance1Text.setText("");
		distance2Text.setText("");
		distance3Text.setText("");
		distance4Text.setText("");
		distance5Text.setText("");
		distance6Text.setText("");
	}
	
	private void calculateDistance() {
		double value;
		
		//inches
		if (!(distance1Text.getText().equals(""))) {
			try {
				value = new Double(distance1Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance2Text.setText(new Double(value * 2.54).toString());
			distance3Text.setText(new Double(value / 12).toString());
			distance4Text.setText(new Double(value / 39.37).toString());
			distance5Text.setText(new Double(value / 63360).toString());
			distance6Text.setText(new Double(value / 39370.079).toString());
		
		//centimeters	
		} else if (!(distance2Text.getText().equals(""))) {
			try {
				value = new Double(distance2Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance1Text.setText(new Double(value / 2.54).toString());
			distance3Text.setText(new Double(value / 30.48).toString());
			distance4Text.setText(new Double(value / 100).toString());
			distance5Text.setText(new Double(value / 160934.4).toString());
			distance6Text.setText(new Double(value / 100000).toString());
		
		//feet	
		} else if (!(distance3Text.getText().equals(""))) {
			try {
				value = new Double(distance3Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance1Text.setText(new Double(value * 12).toString());
			distance2Text.setText(new Double(value * 30.34).toString());
			distance4Text.setText(new Double(value / 3.281).toString());
			distance5Text.setText(new Double(value / 5280).toString());
			distance6Text.setText(new Double(value / 3280.84).toString());
		
		//meters	
		} else if (!(distance4Text.getText().equals(""))) {
			try {
				value = new Double(distance4Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance1Text.setText(new Double(value * 39.37).toString());
			distance2Text.setText(new Double(value * 100).toString());
			distance3Text.setText(new Double(value * 3.281).toString());
			distance5Text.setText(new Double(value / 1609.344).toString());
			distance6Text.setText(new Double(value / 1000).toString());
		
		//miles	
		} else if (!(distance5Text.getText().equals(""))) {
			try {
				value = new Double(distance5Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance1Text.setText(new Double(value * 63360).toString());
			distance2Text.setText(new Double(value * 160934.4).toString());
			distance3Text.setText(new Double(value * 5280).toString());
			distance4Text.setText(new Double(value * 1609.344).toString());
			distance6Text.setText(new Double(value / 1.609).toString());
		
		//kilometers	
		} else if (!(distance6Text.getText().equals(""))) {
			try {
				value = new Double(distance6Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			distance1Text.setText(new Double(value * 39370.079).toString());
			distance2Text.setText(new Double(value * 100000).toString());
			distance3Text.setText(new Double(value * 3280.84).toString());
			distance4Text.setText(new Double(value * 1000).toString());
			distance5Text.setText(new Double(value / 1.609).toString());
			
		} else {
			return;
		}
	}
	
	private void resetWeight() {
		weight1Text.setText("");
		weight2Text.setText("");
		weight3Text.setText("");
		weight4Text.setText("");
		weight5Text.setText("");
		weight6Text.setText("");
	}
	
	private void calculateWeight() {
		double value;
		
		//ounces
		if (!(weight1Text.getText().equals(""))) {
			try {
				value = new Double(weight1Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight2Text.setText(new Double(value * 28349.523).toString());
			weight3Text.setText(new Double(value / 16).toString());
			weight4Text.setText(new Double(value * 28.35).toString());
			weight5Text.setText(new Double(value / 32000).toString());
			weight6Text.setText(new Double(value / 35.274).toString());
		
		//milligrams	
		} else if (!(weight2Text.getText().equals(""))) {
			try {
				value = new Double(weight2Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight1Text.setText(new Double(value / 28349.523).toString());
			weight3Text.setText(new Double(value / 453592.37).toString());
			weight4Text.setText(new Double(value / 1000).toString());
			weight5Text.setText(new Double(value / 9.072 * Math.pow(10, 8)).toString());
			weight6Text.setText(new Double(value / 1 * Math.pow(10, 6)).toString()); 
			
		//pounds	
		} else if (!(weight3Text.getText().equals(""))) {
			try {
				value = new Double(weight3Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight1Text.setText(new Double(value * 16).toString());
			weight2Text.setText(new Double(value * 453592.37).toString());
			weight4Text.setText(new Double(value * 453.592).toString());
			weight5Text.setText(new Double(value / 2000).toString());
			weight6Text.setText(new Double(value / 2.205).toString()); 
			
		//grams	
		} else if (!(weight4Text.getText().equals(""))) {
			try {
				value = new Double(weight4Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight1Text.setText(new Double(value / 28.35).toString());
			weight2Text.setText(new Double(value * 1000).toString());
			weight3Text.setText(new Double(value / 453.592).toString());
			weight5Text.setText(new Double(value / 907184.74).toString());
			weight6Text.setText(new Double(value / 1000).toString()); 
			
		//tons	
		} else if (!(weight5Text.getText().equals(""))) {
			try {
				value = new Double(weight5Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight1Text.setText(new Double(value * 32000).toString());
			weight2Text.setText(new Double(value * 9.072 * Math.pow(10, 8)).toString());
			weight3Text.setText(new Double(value * 2000).toString());
			weight4Text.setText(new Double(value * 907184.74).toString());
			weight6Text.setText(new Double(value * 907.185).toString()); 
			
		//kilograms	
		} else if (!(weight6Text.getText().equals(""))) {
			try {
				value = new Double(weight6Text.getText());
			} catch (Exception NumberFormatException) {
				JOptionPane.showMessageDialog(this, "Only digits 0-9 may be used.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				return;
			}
			weight1Text.setText(new Double(value * 35.274).toString());
			weight2Text.setText(new Double(value * 1 * Math.pow(10, 6)).toString());
			weight3Text.setText(new Double(value * 2.205).toString());
			weight4Text.setText(new Double(value * 1000).toString());
			weight5Text.setText(new Double(value / 907.185).toString()); 
			
		} else {
			return;
		}
	}
	
	private void createAndShowGUI() {
        setTitle("Unit Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        createGUI();
        calculateDistance();
        calculateWeight();
    }

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UnitConverter gui = new UnitConverter();
				
				gui.createAndShowGUI();
			}
		});
	}
}
