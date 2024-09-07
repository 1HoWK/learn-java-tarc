package Practical2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventDriven extends JFrame {

	// Label and buttons
	private JLabel colorLabel = new JLabel("Color");
	private JButton red = new JButton("Red");
	private JButton green = new JButton("Green");
	private JButton blue = new JButton("Blue");

	public EventDriven() {
		colorLabel.setFont(new Font("Arial", Font.BOLD, 20));
		colorLabel.setHorizontalAlignment(colorLabel.CENTER);
		add(colorLabel, BorderLayout.NORTH);
		JPanel panel1 = new JPanel();
		panel1.add(red);
		panel1.add(green);
		panel1.add(blue);
		add(panel1);
		red.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				colorLabel.setForeground(Color.RED);

			}
		});
		green.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				colorLabel.setForeground(Color.GREEN);

			}
		});
		blue.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				colorLabel.setForeground(Color.BLUE);

			}
		});
		// create frame with 5 elements
		setTitle("Colors");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventDriven();
	}

//	private class colorListenerClass implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == red)
//				colorLabel.setForeground(Color.RED);
//			else if (e.getSource() == green)
//				colorLabel.setForeground(Color.GREEN);
//			else if (e.getSource() == blue)
//				colorLabel.setForeground(Color.BLUE);
//
//		}
//	}

//	private class RedListenerClass implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			colorLabel.setForeground(Color.RED);
//
//		}
//
//	}
//
//	private class GreenListenerClass implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			colorLabel.setForeground(Color.GREEN);
//
//		}
//
//	}
//
//	private class BlueListenerClass implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//			colorLabel.setForeground(Color.BLUE);
//
//		}
//
//	}

}
