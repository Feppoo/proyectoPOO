package logica;

import java.util.ArrayList;
import java.util.List;

public class Tipo {
	private String nombre;
	private List<Item> items = new ArrayList<>();
	
	public Tipo(String nombre) {
		this.nombre = nombre;
	}
	/* Agrega el item a una lista unica por tipo. El objetivo es que sea fácil de
	 * tener dicha lista.
	 * */
	public void agregarItem(Item item) {
		if (!(items.contains(item))) {
			items.add(item);
		}
	}
	/* Borra un item de la lista única por tipo.
	 * */
	public void borrarItem(Item item) {
		items.remove(item);
	}
	public List<Item> getItems() {
		return items;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
