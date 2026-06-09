package logica;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int codigo;
	private String nombre;
	private String descripcion;
	private List<Categoria> categorias = new ArrayList<>();
	private Prestamo prestamo = null;
	private Tipo tipo = null;
	
	public Item(int codigo, String nombre, String descripcion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public boolean agregarCategoria(Categoria categoria) {
		for (Categoria actual:categorias) {
			if (actual.equals(categoria)) {
				return false;
			}
		}
		return categorias.add(categoria);
	}
	public boolean borrarCaategoria(Categoria categoria) {
		for (Categoria actual:categorias) {
			if (actual.equals(categoria)) {
				return categorias.remove(categoria);
			}
		}
		return false;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
