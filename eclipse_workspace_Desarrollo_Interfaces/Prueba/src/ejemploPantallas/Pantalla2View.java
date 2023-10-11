package ejemploPantallas;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla2View extends View {
	public Pantalla2View(App appController) {
		super(appController);

		setLayout(null);

		JLabel lblNewLabel = new JLabel("Pantalla 2");
		lblNewLabel.setBounds(59, 99, 81, 14);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("Ir a Pantalla 3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantalla3();
			}
		});
		btnNewButton.setBounds(160, 139, 112, 23);
		add(btnNewButton);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8437911984822461892L;

}
