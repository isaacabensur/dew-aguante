package fulbito.model;

import java.util.Collection;

public class Cancha {
	
	private int numCan;
	private String nombre;
	private String caracteristicas;
	private String diasAtencion;
	private String horasAtencion;
	private double tarifa;
	private String promo;
	private String foto;
	private char disponible;
	private Collection<Horario> horarios;
	private Collection<Comentario> comentarios;
	private Local oLocal;
	
	public Cancha() {
		
	}

	public Cancha(int numCan, String nombre, String caracteristicas,
			String diasAtencion, String horasAtencion, double tarifa,
			String promo, String foto, char disponible,
			Collection<Horario> horarios, Collection<Comentario> comentarios,
			Local oLocal) {
		super();
		this.numCan = numCan;
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.diasAtencion = diasAtencion;
		this.horasAtencion = horasAtencion;
		this.tarifa = tarifa;
		this.promo = promo;
		this.foto = foto;
		this.disponible = disponible;
		this.horarios = horarios;
		this.comentarios = comentarios;
		this.oLocal = oLocal;
	}

	public int getNumCan() {
		return numCan;
	}

	public void setNumCan(int numCan) {
		this.numCan = numCan;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getDiasAtencion() {
		return diasAtencion;
	}

	public void setDiasAtencion(String diasAtencion) {
		this.diasAtencion = diasAtencion;
	}

	public String getHorasAtencion() {
		return horasAtencion;
	}

	public void setHorasAtencion(String horasAtencion) {
		this.horasAtencion = horasAtencion;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public char getDisponible() {
		return disponible;
	}

	public void setDisponible(char disponible) {
		this.disponible = disponible;
	}

	public Collection<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Collection<Horario> horarios) {
		this.horarios = horarios;
	}

	public Collection<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Collection<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Local getoLocal() {
		return oLocal;
	}

	public void setoLocal(Local oLocal) {
		this.oLocal = oLocal;
	}

}
