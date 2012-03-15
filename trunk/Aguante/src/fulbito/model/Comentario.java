package fulbito.model;

import java.util.Collection;


public class Comentario {
	
	private int codComent;
	private String texto;
	private int calificacion;
	private int nivel;
	private Collection<Comentario> conmentarios;
	private Comentario oComentario;
	private Cancha oCancha;
	private Cliente oCliente;
	
	public Comentario() {
		
	}
	
	public Comentario(int codComent, String texto, int calificacion, int nivel,
			Collection<Comentario> conmentarios, Comentario oComentario,
			Cancha oCancha, Cliente oCliente) {
		super();
		this.codComent = codComent;
		this.texto = texto;
		this.calificacion = calificacion;
		this.nivel = nivel;
		this.conmentarios = conmentarios;
		this.oComentario = oComentario;
		this.oCancha = oCancha;
		this.oCliente = oCliente;
	}
	
	public int getCodComent() {
		return codComent;
	}
	
	public void setCodComent(int codComent) {
		this.codComent = codComent;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Collection<Comentario> getConmentarios() {
		return conmentarios;
	}

	public void setConmentarios(Collection<Comentario> conmentarios) {
		this.conmentarios = conmentarios;
	}

	public Cancha getoCancha() {
		return oCancha;
	}

	public void setoCancha(Cancha oCancha) {
		this.oCancha = oCancha;
	}

	public Cliente getoCliente() {
		return oCliente;
	}

	public void setoCliente(Cliente oCliente) {
		this.oCliente = oCliente;
	}

	public Comentario getoComentario() {
		return oComentario;
	}

	public void setoComentario(Comentario oComentario) {
		this.oComentario = oComentario;
	}
	
}
