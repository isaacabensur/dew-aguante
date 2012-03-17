package fulbito.business;

import fulbito.dao.ServAdicionalDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.ServAdicional;
import fulbito.model.Local;

public class InsertarServAdicional {

	public void insertarServAdicional(String tipo, String descripcion, double tarifa, int local) throws DAOExcepcion {

		ServAdicional model = new ServAdicional();
		Local oLocal = new Local();
		
		
		if(!tipo.equals("") && !descripcion.equals("") && tarifa>0 && local>0  ){
		model.setTipo(tipo);
		model.setDescripcion(descripcion);
		model.setTarifa(tarifa);
		oLocal.setCodLoc(local);
		model.setoLocal(oLocal);
		
		ServAdicionalDAO dao = new ServAdicionalDAO();
		dao.insertar(model);
		
		
		}
		
		else {
			
			throw new DAOExcepcion("Ingrese datos");
		}
		
	}

}
