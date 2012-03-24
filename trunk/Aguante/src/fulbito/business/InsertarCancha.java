package fulbito.business;

import java.util.Collection;

import fulbito.dao.CanchaDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Cancha;
import fulbito.model.Local;

public class InsertarCancha {

	public void insertarCancha(String nombre, String caracteristicas, String diasAtencion, String horasAtencion, double tarifa, String promo, String foto, String disponible, int local) throws DAOExcepcion {

		Cancha model = new Cancha();
		Local oLocal = new Local();
		
		
		if(!nombre.equals("") && !caracteristicas.equals("") && !diasAtencion.equals("") && !horasAtencion.equals("") && tarifa >0 && !promo.equals("") && !foto.equals("")&& !disponible.equals("") && local > 0 ){
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
		Collection<Cancha> Canchas = dao.buscarPorNombre(nombre, local);
		
		if(Canchas.size()==0){
		dao.insertar(model);
		}else{
			
			throw new DAOExcepcion("El nombre de la cancha ya existe");
		}
		
		}
		
		else {
			
			throw new DAOExcepcion("Ingrese datos");
		}
		
	}

	
	
}