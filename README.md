# JSwing
Design a UI using Swing as show in the figure. This figure is only provided to provide you a baseline on what I am expecting the UI to look like. You can design your own layout, but make sure that the UI is clean and readable. Start looking into Tabbed Pane (https://docs.oracle.com/javase/tutorial/uiswing/components/tabbedpane.html), a very good starting pointing for the application layout.
1. Title is the name of the GUI application. You can name it as Converter or any other meaningful name you like. Also, you can place is anywhere on the frame.
2. Each metric is the tab that will allow users to a convert one unit to other. For this assignment you will use Distance and Weight. Select any 6 units. For example, Distance – Mile, Foot, Meters, Kilometers, Centimeters and Light Years. Similarly, select any 6 of Weight
3. You can use Google Converter and its notes at https://support.google.com/websearch/answer/3284611?hl=en#unitconverter

The unit values are editable input boxes. When the user changes a value (say Meter), all the other units must change their values (Kilometer, Centimeter, etc.). The change can be automatic, i.e. the values change as you change a unit or the changes occur on hitting enter or you can have a submit button.
1. Any expectation or errors in the application must be displayed as a Dialog to the user. Note: Check Java Swing JOptionPane. For example, a user enter a character instead of number into the value textfield.
2. If the values are too small, you should display the values in exponential format (e.g., 1.23E-10).

By default, i.e. when the user selects the metric system, a unit (of your chose, say 1 meter) as default and display the respective values in the editable box of the other units w.r.t to the selected unit. 
