package control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import logica.Alerta;
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
	public void itemCrear(String nombre, String descripcion, Tipo tipo) {
		int codigo = ++contadorItems;
		Item nuevo = new Item(codigo, nombre, descripcion, tipo);
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
	public void prestamoCrear(Usuario usuario, Alerta alerta) {
		int id = ++contadorPrestamos;
		Prestamo nuevo = new Prestamo(id, usuario, alerta);
		mapPrestamos.put(id, nuevo);
	}
	public boolean prestamoAgregarItem(int id, Item item) {
		Prestamo p = mapPrestamos.get(id);
		return p.agregarItem(item);
	}
	public boolean prestamoEliminarItem(int id, Item item) {
		Prestamo p = mapPrestamos.get(id);
		return p.eliminarItem(item);
	}
	public boolean prestamoRetornarItem(int id, Item item) {
		Prestamo p = mapPrestamos.get(id);
		return p.eliminarItem(item);
	}
	public void prestamoFinalizar(int id) {
		Prestamo p = mapPrestamos.get(id);
		for (Item actual:p.getPrestado()) {
			prestamoRetornarItem(id, actual);
		}
		mapPrestamos.remove(id);
	}
	/* Retorna un mapa: Usuario con préstamo activo ----> La lista de items.
	 * */
	public Map<Usuario,List<Item>> reporteUsuario() {
		Map<Usuario,List<Item>> mapa = new HashMap<>();
		for (Prestamo actual:mapPrestamos.values()) {
			mapa.put(actual.getUsuario(), actual.getPrestado());
		}
		return mapa;
	}
	/* Retorna una lista ordenada alfabéticamente: Item
	 * */
	public List<Item> reporteItems() {
		List<Item> lista = new ArrayList<>();
		for (Item actual:mapItems.values()) {
			lista.add(actual);
		}
		lista.sort(Comparator.comparing(Item::getNombre));
		return lista;
	}
	/* Retorna un mapa: Categoría -----> Lista de items que pertenecen a ella.
	 * */
	public Map<Categoria,List<Item>> reporteCategoria() {
		Map<Categoria,List<Item>> mapa = new HashMap<>();
		List<Item> itemTemp = new ArrayList<Item>();
		//Primero nos encargamos de los que no tienen categoría
		Categoria sinCateg = new Categoria("Sin Categoría");
		for (Item x:mapItems.values()) {
			if(x.getCategorias().isEmpty()) {
				itemTemp.add(x);
			}
		}
		mapa.put(sinCateg, itemTemp);
		//Ahora sigue el resto:
		for (Categoria x: listCateg) {
			mapa.put(x,x.getItems());
		}
		return mapa;
	}
	public Map<Tipo, List<Item>> reporteTipo() {
		Map<Tipo,List<Item>> mapa = new HashMap<>();
		for (Tipo x: listTipos) {
			mapa.put(x,x.getItems());
		}
		return mapa;
	}
	public Map<String, Usuario> getMapUsuarios() {
		return mapUsuarios;
	}
	public Map<Integer, Item> getMapItems() {
		return mapItems;
	}
	public Map<Integer, Prestamo> getMapPrestamos() {
		return mapPrestamos;
	}
	public List<Categoria> getListCateg() {
		return listCateg;
	}
	public List<Tipo> getListTipos() {
		return listTipos;
	}
	
}