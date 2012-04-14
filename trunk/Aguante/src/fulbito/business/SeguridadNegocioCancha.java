package fulbito.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import fulbito.dao.CanchaDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Cancha;


public class SeguridadNegocioCancha {
	
	public Collection<Cancha> BuscarCanchaFulbito(String distrito, String diasAtencion, String horasAtencion) throws DAOExcepcion {
						
		Collection<Cancha> cancha = new ArrayList<Cancha>();
		CanchaDAO dao = new CanchaDAO();
		cancha = dao.buscarcanchafulbito(distrito, diasAtencion, horasAtencion);
		
		for(Iterator<Cancha> i = cancha.iterator();
				i.hasNext();){
			Cancha vo = (Cancha)i.next();
			System.out.println("NumCan :" +  vo.getNumCan() +"  Nombre :" + vo.getNombre() + "  Caracteristicas :"+ vo.getCaracteristicas() + "  DiasAtencion :" + vo.getDiasAtencion() + "  HorasAtencion :" + vo.getHorasAtencion() + "  TarifaDiurna :" + vo.getTarifaDiurna() + "  TarifaNocturna :" + vo.getTarifaNocturna() + "  Promo :" + vo.getPromo() + "  Foto :" + vo.getFoto() + "  CodLoc :" + vo.getoLocal().getCodLoc());
			//throw new DAOExcepcion( "NumCan :" + vo.getNumCan() + "Nombre :" + vo.getNombre() + "Caracteristicas :" + vo.getCaracteristicas() + "DiasAtencion :" + vo.getDiasAtencion() + "HorasAtencion :"+ vo.getHorasAtencion() + "TarifaDiurna :" + vo.getTarifaDiurna() + "  TarifaNocturna :" + vo.getTarifaNocturna()  + "Promo :" + vo.getPromo() + "Foto :" + vo.getFoto() + "CodLoc :" + vo.getoLocal().getCodLoc());
		}
		return cancha;
	}
	
}
