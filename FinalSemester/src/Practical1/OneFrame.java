package Practical1;

import javax.swing.*;

public class OneFrame extends JFrame {

	public OneFrame() {
		add(new JButton("Hello"));
		// create frame with 5 elements
		setTitle("One Frame");
		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new OneFrame();

	}

}
