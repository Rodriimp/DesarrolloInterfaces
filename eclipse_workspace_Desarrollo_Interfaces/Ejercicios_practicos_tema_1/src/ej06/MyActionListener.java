package ej06;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyActionListener implements ActionListener {

	private JTextField textField;
	private JFrame frame;

	public MyActionListener(JTextField tf, JFrame fr) {
		this.textField = tf;
		this.frame = fr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			if (textField.getText().isEmpty()) {
				textField.setText("1");
			} else {
				int i = Integer.parseInt(textField.getText()) + 1;
				textField.setText(String.valueOf(i));
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(frame, "No se pueden sumar cadenas!", "ERROR", JOptionPane.ERROR_MESSAGE);
			textField.setText("");
		}
	}

}
