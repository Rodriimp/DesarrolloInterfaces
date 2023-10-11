package ej11;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Ventana11 {

	private static final String AMARILLO = "AMARILLO";
	private static final String AZUL = "AZUL";
	private static final String VERDE = "VERDE";
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana11 window = new Ventana11();
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
	public Ventana11() {
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
		frame.setTitle("EJ 10");

		textField1 = new JTextField();
		textField1.setBounds(131, 37, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setBounds(131, 87, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);

		textField3 = new JTextField();
		textField3.setBounds(131, 140, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);

		textField4 = new JTextField();
		textField4.setBounds(131, 193, 86, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);

		//////////////////// COMBOBOX ////////////////////////
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(289, 86, 86, 22);
		frame.getContentPane().add(comboBox);

		comboBox.addItem(VERDE);
		comboBox.addItem(AZUL);
		comboBox.addItem(AMARILLO);
		comboBox.setFocusable(false);

		//////////////////// JradioButtons ////////////////////////

		JRadioButton rdbVerde = new JRadioButton(VERDE);
		rdbVerde.setBounds(284, 140, 115, 20);
		frame.getContentPane().add(rdbVerde);
		rdbVerde.setFocusable(false);

		JRadioButton rdbAzul = new JRadioButton(AZUL);
		rdbAzul.setBounds(284, 163, 109, 23);
		frame.getContentPane().add(rdbAzul);
		rdbAzul.setFocusable(false);

		JRadioButton rdbAmarillo = new JRadioButton(AMARILLO);
		rdbAmarillo.setBounds(284, 189, 109, 23);
		frame.getContentPane().add(rdbAmarillo);
		rdbAmarillo.setFocusable(false);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbVerde);
		grupo.add(rdbAzul);
		grupo.add(rdbAmarillo);

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
				int key = e.getKeyCode();

				if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
				if (key == KeyEvent.VK_UP) {
					e.getComponent().transferFocusBackward();
				}
			}
		};

		textField1.addKeyListener(kL);
		textField2.addKeyListener(kL);
		textField3.addKeyListener(kL);
		textField4.addKeyListener(kL);

		FocusListener fcL = new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				e.getComponent().setBackground(null);

			}

			@Override
			public void focusGained(FocusEvent e) {

				JTextField origen = (JTextField) e.getSource();

				if (comboBox.getSelectedItem().equals(VERDE)) {
					origen.setBackground(Color.green);
				} else if (comboBox.getSelectedItem().equals(AZUL)) {
					origen.setBackground(Color.cyan);
				} else if (comboBox.getSelectedItem().equals(AMARILLO)) {
					origen.setBackground(Color.yellow);
				}
			}
		};

		textField1.addFocusListener(fcL);
		textField2.addFocusListener(fcL);
		textField3.addFocusListener(fcL);
		textField4.addFocusListener(fcL);

		ItemListener itL = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				rdbVerde.setSelected(comboBox.getSelectedItem().equals(VERDE));
				rdbAzul.setSelected(comboBox.getSelectedItem().equals(AZUL));
				rdbAmarillo.setSelected(comboBox.getSelectedItem().equals(AMARILLO));

			}
		};

		comboBox.addItemListener(itL);

		ActionListener acL = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JRadioButton origen = (JRadioButton) e.getSource();
				comboBox.setSelectedItem(origen.getText());
			}
		};

		rdbAmarillo.addActionListener(acL);
		rdbAzul.addActionListener(acL);
		rdbVerde.addActionListener(acL);

	}
}
