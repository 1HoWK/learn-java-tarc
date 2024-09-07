package Practical3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExceptionQ2 extends JFrame {
	private static int[] randomNumber = new int[101];
	private JLabel label1 = new JLabel("Array Index");
	private JLabel label2 = new JLabel("Array Element");
	private JTextField field1 = new JTextField(10);
	private JTextField field2 = new JTextField(10);
	private JButton button = new JButton("Show Element");

	public ExceptionQ2() {
		field2.setEditable(false);
		JPanel top = new JPanel(new GridLayout(2, 2));
		JPanel bottom = new JPanel();
		top.add(label1);
		top.add(field1);
		top.add(label2);
		top.add(field2);
		bottom.add(button);
		add(top, BorderLayout.NORTH);
		add(bottom, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					int element = Integer.parseInt(field1.getText());
					field2.setText("" + randomNumber[element]);
				} catch (NumberFormatException ex) {
					field2.setText(" " + "Type number only");
				} catch (ArrayIndexOutOfBoundsException ex) {
					field2.setText(" " + "Out of Bound");
				}

			}

		});
		// create frame with 5 elements
		setTitle("Display: Show Bounds Error");
		setSize(500, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		array();
		new ExceptionQ2();
	}

	private static void array() {
		for (int i = 0; i < 100; i++) {
			randomNumber[i] = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
		}
	}

}
