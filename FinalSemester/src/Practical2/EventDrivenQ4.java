package Practical2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventDrivenQ4 extends JFrame {

	// Label and buttons
	private JLabel label1 = new JLabel("First Number");
	private JLabel label2 = new JLabel("Second Number");
	private JLabel label3 = new JLabel("Result");
	private JTextField firstnumfield = new JTextField(10);
	private JTextField secondnumfield = new JTextField(10);
	private JTextField answerfield = new JTextField(10);
	private JButton addbtn = new JButton("Add");
	private JButton subtractbtn = new JButton("Subtract");
	private JButton multiplybtn = new JButton("Multiply");
	private JButton dividebtn = new JButton("Divide");

	public EventDrivenQ4() {
		// validation
		answerfield.setEditable(false);
		// first panel
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 2));
		panel1.add(label1);
		panel1.add(firstnumfield);
		panel1.add(label2);
		panel1.add(secondnumfield);
		panel1.add(label3);
		panel1.add(answerfield);
		// second panel
		JPanel panel2 = new JPanel();
		panel2.add(addbtn);
		panel2.add(subtractbtn);
		panel2.add(multiplybtn);
		panel2.add(dividebtn);
		// add panels into frame
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		// mnemonics for each buttons
		addbtn.setMnemonic('A');
		subtractbtn.setMnemonic('S');
		multiplybtn.setMnemonic('M');
		dividebtn.setMnemonic('D');
		// button listener
		btnListener buttonListener = new btnListener();
		addbtn.addActionListener(buttonListener);
		subtractbtn.addActionListener(buttonListener);
		multiplybtn.addActionListener(buttonListener);
		dividebtn.addActionListener(buttonListener);
		// create frame with 5 elements
		setTitle("Simple Calculator");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventDrivenQ4();
	}

	private class btnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				double firstNum = Double.parseDouble(firstnumfield.getText());
				double secondNum = Double.parseDouble(secondnumfield.getText());
				double result = 0;
				if (e.getSource() == addbtn)
					result = firstNum + secondNum;
				else if (e.getSource() == subtractbtn)
					result = firstNum - secondNum;
				else if (e.getSource() == multiplybtn)
					result = firstNum * secondNum;
				else if (e.getSource() == dividebtn)
					result = firstNum / secondNum;
				answerfield.setText(result + "");
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Please enter numbers only");
				firstnumfield.setText("");
				secondnumfield.setText("");
				answerfield.setText("");
				firstnumfield.requestFocus();

			}
		}
	}
}
