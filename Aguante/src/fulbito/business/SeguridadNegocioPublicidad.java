package fulbito.business;

import fulbito.dao.PublicidadDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Administrador;
import fulbito.model.Publicidad;

public class SeguridadNegocioPublicidad {
	
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
			System.out.println("Ingrese el t�tulo");
			throw new DAOExcepcion("Ingrese el t�tulo");
		}
		if(contenido == null || contenido.equals("")) {
			flag = false;
			System.out.println("Ingrese el contenido");
			throw new DAOExcepcion("Ingrese el contenido");
		}
		if(fecInicio == null || fecInicio.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha de inicio");
			throw new DAOExcepcion("Ingrese la fecha de inicio");
		}
		if(fecFin == null || fecFin.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha de fin");
			throw new DAOExcepcion("Ingrese la fecha de fin");
		}
		if(tarifa == null || tarifa.equals("")) {
			flag = false;
			System.out.println("Ingrese la tarifa");
			throw new DAOExcepcion("Ingrese la tarifa");
		}
		if(clicks == null || clicks.equals("")) {
			flag = false;
			System.out.println("Ingrese un n�mero de clics");
			throw new DAOExcepcion("Ingrese un n�mero de clics");
		}
		if(seccion == null || seccion.equals("")) {
			flag = false;
			System.out.println("Ingrese la seccion");
			throw new DAOExcepcion("Ingrese la seccion");
		}
		if(codPersona == null || codPersona.equals("")) {
			flag = false;
			System.out.println("Ingrese la el c�digo del Administrador");
			throw new DAOExcepcion("Ingrese la el c�digo del Administrador");
		}
		PublicidadDAO dao = new PublicidadDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("La publicidad con t�tulo "+titulo+" se ha insertado correctamente.");
			throw new DAOExcepcion("La publicidad con t�tulo "+titulo+" se ha insertado correctamente.");
		}
		
	}
	
}
