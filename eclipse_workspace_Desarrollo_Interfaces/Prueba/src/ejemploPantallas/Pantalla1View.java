package ejemploPantallas;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Pantalla1View extends View {

	public Pantalla1View(App appController) {
		super(appController);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("PANTALLA 1");
		lblNewLabel.setBounds(89, 111, 78, 14);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("Ir a Pantalla 2");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantalla2();

			}
		});
		btnNewButton.setBounds(188, 190, 122, 23);
		add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(188, 108, 86, 20);
		add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String pass = new String(passwordField.getPassword());

				appController.login(user, pass);
			}
		});
		btnNewButton_1.setBounds(286, 107, 89, 23);
		add(btnNewButton_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(188, 139, 86, 20);
		add(passwordField);
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8437911984822461892L;
	private JTextField textField;
	private JPasswordField passwordField;
}
