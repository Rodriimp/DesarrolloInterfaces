package prueba1;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	public static void main(String[] args) {
		JFrame ventana = new JFrame();

		ventana.setTitle(null);
		ventana.setSize(600, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
}
