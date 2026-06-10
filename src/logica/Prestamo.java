package logica;

import java.util.ArrayList;
import java.util.List;

public class Prestamo {
	private int id;
	
	private Usuario usuario = null;
	private List<Item> prestado = new ArrayList<>(); 
	private Alerta alerta = null;
	
	public Prestamo(int id, Usuario usuario, Alerta alerta) {
		this.id = id;
		this.usuario = usuario;
		this.alerta = alerta;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Alerta getAlerta() {
		return alerta;
	}
	public void setAlerta(Alerta alerta) {
		this.alerta = alerta;
	}
	public int getId() {
		return id;
	}

	/* Agrega un item a la lista de items prestado.
	 * Primero verifica que no esté actualmente en la lista y que esté disponible para 
	 * prestar.
	 * Retorna True si se agrega, False si no.
	 * */
	public boolean agregarItem(Item item) {
		if (prestado.contains(item) || item.isEnPrestamo()) {
			return false;
		}
		prestado.add(item);
		item.setEnPrestamo(true);
		return true;
		
	}
	/* Elimina un item de la lista de prestado.
	 * Retorna True si logra eliminarlo, False si no.
	 * */
	public boolean eliminarItem(Item item) {
		if (prestado.remove(item)) {
			item.setEnPrestamo(false);
			return true;
		}
		return false;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Prestamo actual)) {
			return false;
		}
		return this.id == actual.id;
	}
	@Override
	public int hashCode() {
	    return Integer.hashCode(id);
	}
}
