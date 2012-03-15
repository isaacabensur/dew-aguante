package fulbito.model;

import java.util.Date;


public class Evento {
	
	private int codEvento;
	private String nombre;
	private String premio;
	private int limiteCantidad;
	private Date plazoInscripcion;
	private Local oLocal;
	
	public Evento() {
		
	}
	
	public Evento(int codEvento, String nombre, String premio,
			int limiteCantidad, Date plazoInscripcion, Local oLocal) {
		super();
		this.codEvento = codEvento;
		this.nombre = nombre;
		this.premio = premio;
		this.limiteCantidad = limiteCantidad;
		this.plazoInscripcion = plazoInscripcion;
		this.oLocal = oLocal;
	}

	public int getCodEvento() {
		return codEvento;
	}

	public void setCodEvento(int codEvento) {
		this.codEvento = codEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}

	public int getLimiteCantidad() {
		return limiteCantidad;
	}

	public void setLimiteCantidad(int limiteCantidad) {
		this.limiteCantidad = limiteCantidad;
	}

	public Date getPlazoInscripcion() {
		return plazoInscripcion;
	}

	public void setPlazoInscripcion(Date plazoInscripcion) {
		this.plazoInscripcion = plazoInscripcion;
	}

	public Local getoLocal() {
		return oLocal;
	}

	public void setoLocal(Local oLocal) {
		this.oLocal = oLocal;
	}
	
}
