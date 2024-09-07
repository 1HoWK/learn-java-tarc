package Practical1;
import java.awt.*;
import javax.swing.*;

public class Q7Panel extends JPanel {
	
	public Q7Panel() {
		this("","");
	}

	public Q7Panel(String strButton1, String strButton2) {
		setLayout(new GridLayout(1,2));
		add(new JButton(strButton1));
		add(new JButton(strButton1));
	}

}
