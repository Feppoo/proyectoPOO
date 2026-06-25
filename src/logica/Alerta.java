package logica;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

public class Alerta implements Serializable{
	private static final long serialVersionUID = 1L;
	private LocalDateTime inicio;
	private Duration intervalo;
	private boolean repetir;
	
	public Alerta(LocalDateTime inicio, Duration intervalo, boolean repetir) {
		this.inicio = inicio;
		this.intervalo = intervalo;
		this.repetir = repetir;
	}
	public boolean isRepetir() {
		return repetir;
	}
	public void setRepetir(boolean repetir) {
		this.repetir = repetir;
	}
}
