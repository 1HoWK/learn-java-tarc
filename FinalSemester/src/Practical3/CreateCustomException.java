package Practical3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CreateCustomException extends JFrame {

	private JLabel label = new JLabel("Enter your password");
	private JLabel errorMsgLabel = new JLabel();
	private JTextField txtField = new JTextField(10);
	private JButton submitBtn = new JButton("Submit");

	public CreateCustomException() throws InvalidPasswordException {
		JPanel panel1 = new JPanel(new GridLayout(2, 2));
		panel1.add(label);
		panel1.add(txtField);
		panel1.add(new JLabel());
		panel1.add(submitBtn);
		JPanel panel2 = new JPanel(new GridLayout(2, 2));
		errorMsgLabel.setVerticalAlignment(JLabel.TOP);
		panel2.add(errorMsgLabel);
		panel2.setPreferredSize(new Dimension(400, 100));
		panel2.setBackground(Color.white);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		//submitBtn.addActionListener(new Password());
		// create frame with 5 elements
		setTitle("Set Password");
		pack();
		setVisible(true);
		setSize(500, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class Password{
		String password;
		boolean flagletter = false, flagdigit = false;
		int flagstr = 0;

		public Password(String password) throws InvalidPasswordException {
			super();
			this.password = password;
			if (!password.isEmpty()) {
				flagstr++;
				if (password.length() == 7) {
					flagstr++;
				}
				for (int i = 0; i < password.length(); i++) {
					if (Character.isDigit(password.charAt(i))) {
						flagdigit = true;
					}
					if (Character.isLetter(password.charAt(i))) {
						flagletter = true;
					}
				}
			}
			try {
				// all of the possible errors
				if (flagstr == 0 && flagletter == false && flagdigit == false) {
					throw new InvalidPasswordException(
							"Invalid password : password cannot be null or an empty string.");

				} else if (flagstr == 1 && flagletter == true && flagdigit == true) {
					throw new InvalidPasswordException(
							"Your password should have at least 7 alpha-numeric characters.");

				} else if (flagstr == 1 && flagletter == false && flagdigit == true) {
					throw new InvalidPasswordException(
							"<html>Your password should have at least 1 letter.<br/>Your password should have at least 7 alpha-numeric characters.</html>");

				} else if (flagstr == 1 && flagletter == true && flagdigit == false) {
					throw new InvalidPasswordException(
							"<html>Your password should have at least 1 digit.<br/>Your password should have at least 7 alpha-numeric characters.</html>");

				} else if (flagstr == 2 && flagletter == false && flagdigit == false) {
					throw new InvalidPasswordException(
							"<html>Your password should have at least 1 letter.<br/>Your password should have at least 1 digit.</html>");

				} else if (flagstr == 2 && flagletter == false && flagdigit == true) {
					throw new InvalidPasswordException("Your password should have at least 1 letter.");

				} else if (flagstr == 2 && flagletter == true && flagdigit == false) {
					throw new InvalidPasswordException("Your password should have at least 1 digit.");

				} else {
					errorMsgLabel.setText("Congratulations! Your password is valid.");
					errorMsgLabel.setForeground(Color.BLUE);
				}
			} catch (InvalidPasswordException ex) {
				// what should you do when errors occurs
				errorMsgLabel.setText(ex.getMessage());
				errorMsgLabel.setForeground(Color.RED);
			}
		}
	}

	public class InvalidPasswordException extends Exception {

		public InvalidPasswordException(String errmessage) {
			super(errmessage);
		}
	}

	public static void main(String[] args) throws InvalidPasswordException {
		new CreateCustomException();
	}

}
