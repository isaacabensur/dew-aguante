package fulbito.business;

import fulbito.dao.CanchaDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Cancha;
import fulbito.model.Local;

public class InsertarCancha {

	public void insertarCancha(String nombre, String caracteristicas, String diasAtencion, String horasAtencion, double tarifa, String promo, String foto, String disponible, int local) throws DAOExcepcion {

		Cancha model = new Cancha();
		Local oLocal = new Local();
		
		
		if(!nombre.equals("")  ){
		model.setNombre(nombre);
		model.setCaracteristicas(caracteristicas);
		model.setDiasAtencion(diasAtencion);
		model.setHorasAtencion(horasAtencion);
		model.setTarifa(tarifa);
		model.setPromo(promo);
		model.setFoto(foto);
		model.setDisponible(disponible);
		oLocal.setCodLoc(local);
		model.setoLocal(oLocal);
		
		CanchaDAO dao = new CanchaDAO();
		dao.insertar(model);
		
		
		}
		
		else {
			
			throw new DAOExcepcion("Ingrese datos");
		}
		
	}

}
