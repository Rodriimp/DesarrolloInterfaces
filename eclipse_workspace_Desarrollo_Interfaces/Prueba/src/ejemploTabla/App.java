package ejemploTabla;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

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
		frame.setBounds(700, 300, 850, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 48, 669, 533);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel model = new TableModel();
		table.setModel(model);

		JButton btnAñadirPais = new JButton("Añadir Paises");
		btnAñadirPais.setBounds(368, 605, 158, 23);
		frame.getContentPane().add(btnAñadirPais);

		btnAñadirPais.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pais p = new Pais();
				p.setCodigo("ES");
				p.setNombre("España");
				p.setPoblacion(4500000);
				model.getPaises().add(p);
				model.fireTableDataChanged();
			}
		});
	}
}
