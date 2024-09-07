package Practical1;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentInfoFrame extends JFrame {

	public StudentInfoFrame() {
		setLayout(new GridLayout(4, 2));
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		add(new JLabel("Registration number"));
		add(new JTextField(10));
		add(new JLabel("Name"));
		add(new JTextField(20));
		add(new JLabel("Program Code"));
		add(new JTextField(10));
		add(new JButton("Submit"));
		// create frame with 5 elements
		setTitle("Student Information");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new StudentInfoFrame();

	}

}
