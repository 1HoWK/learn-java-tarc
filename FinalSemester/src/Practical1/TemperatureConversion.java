package Practical1;

import javax.swing.JOptionPane;

public class TemperatureConversion {
	public static void main(String[] args) {
		int option = JOptionPane.YES_OPTION;
		do {
			// input dialog
			String inputDialog = JOptionPane.showInputDialog(null, "Enter a Fahrenheit temperature");
			// variables
			double fahrenheit = Double.parseDouble(inputDialog);
			// formula for conversion
			double celsius = 5.0 / 9.0 * (fahrenheit - 32);
			// output dialog
			JOptionPane.showMessageDialog(null, " Temperature converted to Celcius : " + celsius);
			option = JOptionPane.showConfirmDialog(null, "Do you like to enter another temperature?");
		} while (option == JOptionPane.YES_OPTION);
	}
}
