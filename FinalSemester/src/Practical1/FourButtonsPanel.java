package Practical1;

import java.awt.*;
import javax.swing.*;

public class FourButtonsPanel extends JFrame {
	public FourButtonsPanel() {
		// set layout
		setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.add(new JButton("ONE"));
		p1.add(new JButton("TWO"));
		p2.add(new JButton("THREE"));
		p2.add(new JButton("FOUR"));
		// add panel into frame
		add(p1);
		add(p2);
		// create frame with 5 elements
		setTitle("Four Buttons");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FourButtonsPanel();

	}

}
