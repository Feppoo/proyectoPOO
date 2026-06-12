package logica;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private int codigo;
	private String nombre;
	private String descripcion;
	private boolean enPrestamo;
	
	private List<Categoria> categorias = new ArrayList<>();
	private Prestamo prestamo = null;
	private Tipo tipo = null;
	
	public Item(int codigo, String nombre, String descripcion, Tipo tipo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		enPrestamo = false;
	}
	/* Agrega una categoría a la lista de categorías. Veifica primero si existe en la lista.
	 * Retorna True si la incluye, False si no logra incluirla.
	 * */
	public boolean agregarCategoria(Categoria categoria) {
		if (categorias.contains(categoria)) {
			return false;
		}
		return categorias.add(categoria);
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	/* Borra una categoría existente de la lista de categorías. Primero verifica que
	 * exista para poder borrarla.
	 * Retorna True si logra borrarla, False si no puede.
	 * */
	public boolean borrarCategoria(Categoria categoria) {
		return categorias.remove(categoria);
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
	public boolean isEnPrestamo() {
		return enPrestamo;
	}
	public void setEnPrestamo(boolean enPrestamo) {
		this.enPrestamo = enPrestamo;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item actual)) {
			return false;
		}
		return this.codigo == actual.codigo;
	}
	@Override
	public int hashCode() {
	    return Integer.hashCode(codigo);
	}
}
