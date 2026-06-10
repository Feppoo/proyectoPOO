package logica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String tel;
	private String correo;
	
	private List<Prestamo> prestamos = new ArrayList<>();
	
	public Usuario(String nombre, String tel, String correo) {
		this.nombre = nombre;
		this.tel = tel;
		this.correo = correo;
	}
	/* Agrega un préstamo a la lista de préstamos. Verifica primero que no exista en dicha
	 * lista.
	 * Retorna True si logra incluirlo, False si no puede.
	 * */
	public boolean agregarPrestamo(Prestamo prestamo) {
		if (prestamos.contains(prestamo)) {
			return false;
		}
		return prestamos.add(prestamo);
	}
	/* Borra un préstamo de la lista de préstamos. Verifica primero que exista en la lista.
	 * Retorna True si puede borrarlo, False si no puede.
	 * */
	public boolean borrarPrestamo(Prestamo prestamo) {
		return prestamos.remove(prestamo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
