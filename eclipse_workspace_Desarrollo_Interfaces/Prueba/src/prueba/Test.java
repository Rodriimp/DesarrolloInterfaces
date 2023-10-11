package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Persona> listaPersonas = new ArrayList<Persona>();

		for (int i = 0; i < 3; i++) {
			Persona p = new Persona();

			System.out.println("Introduce el dni");
			String dni = scanner.nextLine();
			p.setDni(dni);
			System.out.println("Introduce el nombre");
			String nombre = scanner.nextLine();
			p.setNombre(nombre);

			listaPersonas.add(p);
		}

		for (Persona persona : listaPersonas) {
			System.out.println("DNI : " + persona.getDni() + "/ NOMBRE : " + persona.getNombre());

		}

		scanner.close();

	}
}
