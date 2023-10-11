package ejRepaso03;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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

		JLabel lblNewLabel = new JLabel("FORMULARIO");
		lblNewLabel.setBounds(176, 39, 76, 14);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(135, 94, 162, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JCheckBox checkBox = new JCheckBox("Acepto la política de privacidad");
		checkBox.setSelected(true);
		checkBox.setBounds(135, 182, 184, 23);
		frame.getContentPane().add(checkBox);

		JButton bClean = new JButton("CLEAN");
		bClean.setBounds(321, 105, 89, 23);
		frame.getContentPane().add(bClean);

		KeyListener kL = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				Character c = e.getKeyChar();

				if (!Character.isDigit(c)) {
					e.consume();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {

				String a = "1";

				if (e.getKeyCode() == KeyEvent.VK_UP) {

					if (textField.getText().isEmpty()) {

						textField.setText(a);
					}

					Integer x = Integer.parseInt(textField.getText());
					x++;
					String texto = x.toString();
					textField.setText(texto);
				}

				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					if (textField.getText().isEmpty()) {

						textField.setText(a);
					}

					if (Integer.parseInt(textField.getText()) < 2) {
						textField.setText("1");
					}

					else {

						Integer x = Integer.parseInt(textField.getText());
						x--;
						String texto = x.toString();
						textField.setText(texto);
					}

				}

			}
		};

		ActionListener acL = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!checkBox.isSelected()) {
					textField.setEnabled(false);
				}

			}
		};

		MouseListener mL = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		};

		checkBox.addActionListener(acL);
		textField.addKeyListener(kL);
		bClean.addMouseListener(mL);

	}
}
