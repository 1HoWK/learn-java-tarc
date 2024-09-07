package Practical1;

import java.awt.*;
import javax.swing.*;

public class FourButtonsPanel2 extends JFrame {
	public FourButtonsPanel2() {
//		// set layout
//		setLayout(new BorderLayout());
//		JPanel panel1 = new JPanel();
//		panel1.setLayout(new GridLayout(1, 2));
//		panel1.add(new JButton("ONE"));
//		panel1.add(new JButton("TWO"));
//		JPanel panel2 = new JPanel();
//		panel2.setLayout(new GridLayout(1, 2));
//		panel2.add(new JButton("THREE"));
//		panel2.add(new JButton("FOUR"));
//
//		// add panel into frame
//		add(panel1, BorderLayout.SOUTH);
//		add(panel2, BorderLayout.CENTER);
//
//		// create frame with 5 elements
//		setTitle("Four Buttons");
//		pack();
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);

		JPanel p1 = new Q7Panel("One", "Two");
		JPanel p2 = new Q7Panel("Three", "Four");

	}

	public static void main(String[] args) {
		new FourButtonsPanel2();

	}

}
