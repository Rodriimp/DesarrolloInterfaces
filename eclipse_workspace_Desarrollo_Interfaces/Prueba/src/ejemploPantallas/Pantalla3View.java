package ejemploPantallas;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla3View extends View {
	public Pantalla3View(App appController) {
		super(appController);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Pantalla 3");
		lblNewLabel.setBounds(80, 112, 79, 14);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("Ir a Pantalla 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantalla1();
			}
		});
		btnNewButton.setBounds(184, 156, 117, 23);
		add(btnNewButton);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8437911984822461892L;

}
