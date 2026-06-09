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
	public boolean agregarPrestamo(Prestamo prestamo) {
		for (Prestamo actual:prestamos) {
			if (actual.equals(prestamo)) {
				return false;
			}
		}
		return prestamos.add(prestamo);
	}
	public boolean borrarPrestamo(Prestamo prestamo) {
		for (Prestamo actual:prestamos) {
			if (actual.equals(prestamo)) {
				return prestamos.remove(prestamo);
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
