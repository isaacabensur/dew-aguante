package fulbito.model;

import java.util.Collection;
import java.util.Date;


public class Alquiler {
	
	private int codAlquiler;
	private Date fecAlquiler;
	private Collection<Horario> horarios;
	private Cliente oCliente;
	
	public Alquiler() {
		
	}
	
	public Alquiler(int codAlquiler, Date fecAlquiler,
			Collection<Horario> horarios, Cliente oCliente) {
		super();
		this.codAlquiler = codAlquiler;
		this.fecAlquiler = fecAlquiler;
		this.horarios = horarios;
		this.oCliente = oCliente;
	}
	
	public int getCodAlquiler() {
		return codAlquiler;
	}

	public void setCodAlquiler(int codAlquiler) {
		this.codAlquiler = codAlquiler;
	}

	public Date getFecAlquiler() {
		return fecAlquiler;
	}

	public void setFecAlquiler(Date fecAlquiler) {
		this.fecAlquiler = fecAlquiler;
	}

	public Collection<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(Collection<Horario> horarios) {
		this.horarios = horarios;
	}

	public Cliente getoCliente() {
		return oCliente;
	}

	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}
	
}
