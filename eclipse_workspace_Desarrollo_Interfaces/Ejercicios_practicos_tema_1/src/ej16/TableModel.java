package ej16;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;


public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4980315035705029924L;

	private List<Persona> personas;

	public TableModel() {
		personas = new ArrayList<Persona>();
	}

	@Override
	public int getRowCount() {
		return personas.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int column) {
		if (column == 0) {
			return "Nombre";
		}
		return "Apellidos";
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Persona personaFila = personas.get(rowIndex);

		if (columnIndex == 0) {
			return personaFila.getNombre();
		}

		return personaFila.getApellidos();
	}

	public List<Persona> getPersonas() {
		return personas;
	}

}
