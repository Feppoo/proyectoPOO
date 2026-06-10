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
	
	
	
}
