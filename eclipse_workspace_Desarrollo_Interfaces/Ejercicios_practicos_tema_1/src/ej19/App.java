package ej19;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

import ej01.services.PeliculasServiceException;
import ej01.services.PeliculasServices;
import javax.swing.JCheckBox;

public class App {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 300, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 60, 603, 448);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);

		JButton btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(315, 26, 108, 23);
		frame.getContentPane().add(btnConsultar);

		JCheckBox chckbxID = new JCheckBox("ID");
		chckbxID.setSelected(true);
		chckbxID.setBounds(74, 515, 97, 23);
		frame.getContentPane().add(chckbxID);

		JCheckBox chckbxTitulo = new JCheckBox("TITULO");
		chckbxTitulo.setSelected(true);
		chckbxTitulo.setBounds(284, 515, 97, 23);
		frame.getContentPane().add(chckbxTitulo);

		JCheckBox chckbxLongitud = new JCheckBox("LONGITUD");
		chckbxLongitud.setSelected(true);
		chckbxLongitud.setBounds(488, 515, 97, 23);
		frame.getContentPane().add(chckbxLongitud);

		btnConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PeliculasServices pService = new PeliculasServices();
				try {
					model.setPeliculas(pService.getPeliculasMenor100min());
					model.getColumnas().clear();

					if (chckbxID.isSelected()) {
						model.getColumnas().add("ID");
					}
					if (chckbxTitulo.isSelected()) {
						model.getColumnas().add("TITULO");
					}
					if (chckbxLongitud.isSelected()) {
						model.getColumnas().add("LONGITUD");
					}
					model.fireTableStructureChanged();
					model.fireTableDataChanged();

				} catch (PeliculasServiceException e1) {
					JOptionPane.showMessageDialog(null, "Error", e1.getMessage(), 0);
				}
			}
		});

		MouseListener mL = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Integer column = table.columnAtPoint(e.getPoint());
				model.ordenar(column);
			}
		};
		
		table.getTableHeader().addMouseListener(mL);

	}
}
