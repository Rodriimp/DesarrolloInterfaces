package ejRepaso05;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ventana {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nueva Ciudad");
		lblNewLabel.setBounds(86, 90, 84, 14);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(193, 81, 119, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(217, 179, 105, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Destinos Disponibles");
		lblNewLabel_1.setBounds(86, 183, 125, 14);
		frame.getContentPane().add(lblNewLabel_1);

		KeyListener kL = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					comboBox.addItem(textField.getText());
					textField.setText("");
					comboBox.setSelectedItem(null);
				}
			}
		};

		textField.addKeyListener(kL);
	}
}
