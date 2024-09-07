package Practical2;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ArrayListQ5 extends JFrame {
	private ArrayList<String> studentList = new ArrayList<String>();

	// labels and buttons
	private JButton createBtn = new JButton(("Create"));
	private JButton retrieveBtn = new JButton(("Retrieve"));
	private JButton updateBtn = new JButton(("Update"));
	private JButton deleteBtn = new JButton(("Delete"));
//	private JLabel instructionLabel = new JLabel(("Enter new student's name:"));
//	private JButton okayBtn = new JButton(("Ok"));
//	private JButton cancelBtn = new JButton(("Cancel"));
//	private JTextField nameTxtField = new JTextField((20));

	public ArrayListQ5() {
		// panel
		JPanel panel1 = new JPanel();
		panel1.add(createBtn);
		panel1.add(retrieveBtn);
		panel1.add(updateBtn);
		panel1.add(deleteBtn);
		add(panel1);

		updatedStudentList displayArrayList = new updatedStudentList();
		createBtn.addActionListener(displayArrayList);
		retrieveBtn.addActionListener(displayArrayList);
		updateBtn.addActionListener(displayArrayList);
		deleteBtn.addActionListener(displayArrayList);

		createBtn.addActionListener(new createActionListener());
		retrieveBtn.addActionListener(new retrieveActionListener());
		updateBtn.addActionListener(new updateActionListener());
		deleteBtn.addActionListener(new deleteActionListener());

		// create frame with 5 elements
		setTitle("Maintain Students");
		setSize(400, 80);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// Create button
	class createActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String promptName = JOptionPane.showInputDialog(null, "Enter new student's name:","Input", JOptionPane.QUESTION_MESSAGE);
			if (promptName != null) {
				studentList.add(promptName);
			}

		}
	}

	// Retrieve button
	class retrieveActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int retrieveNum = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Enter number from 1..." + studentList.size() + " to retrieve:", "Retrieve name", JOptionPane.QUESTION_MESSAGE));
			if(retrieveNum!= 0) {
				JOptionPane.showMessageDialog(null, "Student's name : " + studentList.get(retrieveNum - 1), "Retrieve name", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	// Update button
	class updateActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String newName = null;
			String selectedName = null;
			int updateNum = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Enter number from 1..." + studentList.size() + " to update:", "Update student's name", JOptionPane.QUESTION_MESSAGE));
			if (updateNum != 0) {
				newName = JOptionPane.showInputDialog(null,
						"Current student name is " + studentList.get(updateNum - 1) + ". Enter updated name:", "Update student's name", JOptionPane.INFORMATION_MESSAGE);
				if (newName != null) {
					studentList.set(updateNum - 1, newName);
				}
			}
		}
	}

	// Delete button
	class deleteActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int deleteNum = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Enter number from 1..." + studentList.size() + " to delete:","Delete student's name", JOptionPane.QUESTION_MESSAGE));
			if (deleteNum != 0) {
				int option = JOptionPane.showConfirmDialog(null, "Delete " + studentList.get(deleteNum - 1) + "?", "Delete student's name", JOptionPane.WARNING_MESSAGE);
				if (option == JOptionPane.OK_OPTION) {
					studentList.remove(deleteNum - 1);
				}	
			}
		}
	}

	// Update Student List
	class updatedStudentList implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, output(), "Updated Student List", JOptionPane.INFORMATION_MESSAGE);
		}

		public String output() {
			String sentence = "";
			for (int i = 0; i < studentList.size(); i++) {
				String names = studentList.get(i).toString();
				sentence += (i + 1) + ". " + names + "\n";
			}
			return sentence;
		}

	}

	public static void main(String[] args) {
		new ArrayListQ5();
	}

}
