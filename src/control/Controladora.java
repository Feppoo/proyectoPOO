package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import logica.Categoria;
import logica.Item;
import logica.Prestamo;
import logica.Tipo;
import logica.Usuario;

public class Controladora {
	private static int contadorItems = 0;
	private static int contadorPrestamos = 0;
	private Map<String,Usuario> mapUsuarios = new HashMap<>();
	private Map<Integer,Item> mapItems = new HashMap<>();
	private Map<Integer,Prestamo> mapPrestamos = new HashMap<>();
	private List<Categoria> listCateg = new ArrayList<>();
	private List<Tipo> listTipos = new ArrayList<>();
	
	public void usuarioCrear(String nombre, String tel, String correo) {
		Usuario nuevo = new Usuario(nombre, tel, correo);
		mapUsuarios.put(tel, nuevo);
	}
	public Usuario usuarioConsultar(String tel) {
		return mapUsuarios.get(tel);
	}
	public void usuarioModificar(String tel, Usuario actualizado) {
		mapUsuarios.put(tel, actualizado);
	}
	public void usuarioBorrar(String tel) {
		mapUsuarios.remove(tel);
	}
	public void itemCrear(String nombre, String descripcion) {
		int codigo = ++contadorItems;
		Item nuevo = new Item(codigo, nombre, descripcion);
		mapItems.put(codigo, nuevo);
	}
	public Item itemConsultar(int codigo) {
		return mapItems.get(codigo);
	}
	public void itemModificar(int codigo, Item actualizado) {
		mapItems.put(codigo, actualizado);
	}
	public void itemBorrar(int codigo) {
		mapItems.remove(codigo);
	}
	public void categoriaCrear(String nombre) {
		Categoria nueva = new Categoria(nombre);
		listCateg.add(nueva);
	}
	
	public boolean categoriaConsultar(String nombre) {
		return listCateg.contains(new Categoria(nombre));
	}
	public void cateogriaModificar(String nombre, String nuevo) {
		categoriaBorrar(nombre);
		categoriaCrear(nuevo); 
	}
	public void categoriaBorrar(String nombre) {
		for (Categoria actual: listCateg) {
			if (actual.getNombre().equals(nombre)) {
				listCateg.remove(actual);
			}
		}	
	}
	public void tipoCrear(String nombre) {
		Tipo nuevo = new Tipo(nombre);
		listTipos.add(nuevo);
	}
	public boolean tipoConsultar(String nombre) {
		return listTipos.contains(new Tipo(nombre));
	}
	public void tipoModificar(String nombre, String nuevo) {
		tipoBorrar(nombre);
		tipoCrear(nuevo);
	}
	public void tipoBorrar(String nombre) {
		for (Tipo actual:listTipos) {
			if (actual.getNombre().equals(nombre)) {
				listTipos.remove(actual);
			}
		}
	}
	public void prestamoCrear() {
		int id = ++contadorPrestamos;
		
	}
}