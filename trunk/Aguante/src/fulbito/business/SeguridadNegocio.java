package fulbito.business;

import fulbito.dao.PersonaDAO;
import fulbito.dao.PublicidadDAO;
import fulbito.dao.ServAdicionalDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Administrador;
import fulbito.model.Local;
import fulbito.model.Persona;
import fulbito.model.Publicidad;
import fulbito.model.ServAdicional;
import fulbito.util.ConexionBD;

public class SeguridadNegocio {

	public void insertarPersona(int codPer, String tipoPer, String nombres, String paterno, String materno, String sexo, String tipoDoc, String numDoc, String correo, String password, String fecNac, int celular) throws DAOExcepcion {

		Persona model = new Persona();
		//model.setCodPer(codPer);
		model.setTipoPer(tipoPer);
		model.setNombres(nombres);
		model.setPaterno(paterno);
		model.setMaterno(materno);
		model.setSexo(sexo);
		model.setTipoDoc(tipoDoc);
		model.setNumDoc(numDoc);
		model.setCorreo(correo);
		model.setPassword(password);
		model.setFecNac(fecNac);
		model.setCelular(celular);
		
		PersonaDAO dao = new PersonaDAO();
		dao.insertar(model);
	}
	
	public Persona buscarCorreo(String correo) throws DAOExcepcion {
		PersonaDAO dao = new PersonaDAO();
		return dao.buscarCorreo(correo);
	}
	public Persona buscarNumDoc(String numDoc) throws DAOExcepcion {
		PersonaDAO dao = new PersonaDAO();
		return dao.buscarNumDoc(numDoc);
	}
	
	public void isertarPublicidad(String titulo, String contenido, String fecInicio, String fecFin, Double tarifa, Integer clicks, String seccion, Integer codPersona) throws DAOExcepcion {
		
		boolean flag = true; 
		Publicidad model = new Publicidad();
		Administrador admin = new Administrador();
		model.setTitulo(titulo);
		model.setContenido(contenido);
		model.setFechaInicio(fecInicio);
		model.setFechaFin(fecFin);
		model.setTarifa(tarifa);
		model.setClicks(clicks);
		model.setSeccion(seccion);
		admin.setCodPer(codPersona);
		model.setoAdministrador(admin);
		
		if(titulo == null || titulo.equals("")) {
			flag = false;
			System.out.println("Ingrese el título");
		}
		if(contenido == null || contenido.equals("")) {
			flag = false;
			System.out.println("Ingrese el contenido");
		}
		if(fecInicio == null || fecInicio.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha de inicio");
		}
		if(fecFin == null || fecFin.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha de fin");
		}
		if(tarifa == null || tarifa.equals("")) {
			flag = false;
			System.out.println("Ingrese la tarifa");
		}
		if(clicks == null || clicks.equals("")) {
			flag = false;
			System.out.println("Ingrese la tarifa");
		}
		if(seccion == null || seccion.equals("")) {
			flag = false;
			System.out.println("Ingrese la seccion");
		}
		if(codPersona == null || codPersona.equals("")) {
			flag = false;
			System.out.println("Ingrese la el código del Administrador");
		}
		PublicidadDAO dao = new PublicidadDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("La publicidad con título "+titulo+" se ha insertado correctamente.");
		}
		
	}

	public void insertarServAdic(int codServ, String tipo, String descripcion, Double tarifa, int oLocal ) throws DAOExcepcion {

		ServAdicional model = new ServAdicional();
		model.setCodServ(codServ);
		model.setTipo(tipo);
		model.setDescripcion(descripcion);
		model.setTarifa(tarifa);
		Local x=new Local();
		x.setCodLoc(oLocal);
		model.setoLocal(x);
		
				
		ServAdicionalDAO dao = new ServAdicionalDAO();
		dao.insertar(model);
	}
	
}
