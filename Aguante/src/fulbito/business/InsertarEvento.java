package fulbito.business;

import java.util.Collection;

import fulbito.dao.EventoDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Cancha;
import fulbito.model.Evento;
import fulbito.model.Local;


public class InsertarEvento {

	public void insertarEvento( String nombre,String premio,int limiteCantidad, String plazoInscripcion,int Local_codLoc    ) throws DAOExcepcion {

		Evento model = new Evento();
		Local oLocal=new Local();
		
		
		if(!nombre.equals("")  ){
		model.setNombre(nombre);
		model.setPremio(premio);
		model.setLimiteCantidad(limiteCantidad);
		model.setPlazoInscripcion(plazoInscripcion);
		oLocal.setCodLoc(Local_codLoc);
		model.setoLocal(oLocal);
		EventoDAO dao = new EventoDAO();
		
		
Collection<Evento> Eventos = dao.buscarPorNombre(nombre);
		
		if(Eventos.size()==0){
		dao.insertar(model);
		}else{
			
			throw new DAOExcepcion("El nombre del Evento ya existe");
		}
		
		
		
		}
		
		else {
			
			throw new DAOExcepcion("Ingrese datos");
		}
		
	}

}
