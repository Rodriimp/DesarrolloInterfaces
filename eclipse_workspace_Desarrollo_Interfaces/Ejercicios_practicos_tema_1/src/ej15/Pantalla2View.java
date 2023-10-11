package ej15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Pantalla2View extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7193821096493394688L;
	private JTextField textField;
	
	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public Pantalla2View(App appControler) {
		super(appControler);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(164, 37, 99, 20);
		add(textField);
		textField.setColumns(10);

		JButton btnIrP1 = new JButton("Ir a P1");
		btnIrP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appControler.irAPantalla1(textField.getText());
			}
		});
		btnIrP1.setBounds(31, 105, 99, 23);
		add(btnIrP1);

		JButton btnIrP2 = new JButton("Ir a P2");
		btnIrP2.setBounds(164, 105, 99, 23);
		add(btnIrP2);
		btnIrP2.setEnabled(false);

		JButton btnIrP3 = new JButton("Ir a P3");
		btnIrP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appControler.irAPantalla3(textField.getText());
			}

		});
		btnIrP3.setBounds(297, 105, 99, 23);
		add(btnIrP3);

		JLabel lblNewLabel = new JLabel("Pantalla 2");
		lblNewLabel.setBounds(31, 40, 66, 14);
		add(lblNewLabel);
		
	}
	public void cambiarTexto(String t) {
		textField.setText(t);
	}
	
}




