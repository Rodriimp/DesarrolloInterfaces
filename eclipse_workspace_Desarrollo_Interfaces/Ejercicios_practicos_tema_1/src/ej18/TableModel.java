package ej18;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ej01.modelo.Pelicula;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3323198289658949119L;

	private List<Pelicula> peliculas;
	private List<String> columnas;

	public TableModel() {
		peliculas = new ArrayList<Pelicula>();
		columnas = new ArrayList<>();
		columnas.add("ID");
		columnas.add("TITULO");
		columnas.add("LONGITUD");
	}

	@Override
	public int getRowCount() {
		return peliculas.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.size();
	}

	@Override
	public String getColumnName(int column) {
		return columnas.get(column);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pelicula peliculaFila = peliculas.get(rowIndex);
		String nombreColumn = columnas.get(columnIndex);
		
		if (nombreColumn.equals("ID")) {
			return peliculaFila.getId();
		}
		if (nombreColumn.equals("TITULO")) {
			return peliculaFila.getTitulo();
		}
		if (nombreColumn.equals("LONGITUD")) {
			return peliculaFila.getLongitud();
		}
		return "ERROR";
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public List<String> getColumnas() {
		return columnas;
	}

}
