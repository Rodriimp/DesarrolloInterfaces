package ej14;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Pantalla1View extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6532324810226796712L;
	private JTextField textField;

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public Pantalla1View(App appControler) {
		super(appControler);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(164, 37, 99, 20);
		add(textField);
		textField.setColumns(10);

		JButton btnIrP1 = new JButton("Ir a P1");
		btnIrP1.setBounds(31, 105, 99, 23);
		add(btnIrP1);
		btnIrP1.setEnabled(false);

		JButton btnIrP2 = new JButton("Ir a P2");
		btnIrP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appControler.irAPantalla2(textField.getText());
			}
		});
		btnIrP2.setBounds(164, 105, 99, 23);
		add(btnIrP2);

		JButton btnIrP3 = new JButton("Ir a P3");
		btnIrP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appControler.irAPantalla3(textField.getText());
			}
		});
		btnIrP3.setBounds(297, 105, 99, 23);
		add(btnIrP3);

		JLabel lblNewLabel = new JLabel("Pantalla 1");
		lblNewLabel.setBounds(31, 40, 74, 14);
		add(lblNewLabel);

	}

	public void cambiarTexto(String t) {
		textField.setText(t);
	}
}
