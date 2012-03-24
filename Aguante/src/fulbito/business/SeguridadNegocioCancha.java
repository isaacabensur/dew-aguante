package fulbito.business;

import fulbito.dao.CanchaDAO;
import fulbito.exception.DAOExcepcion;


public class SeguridadNegocioCancha {
	
	public void BuscarCanchaFulbito(String distrito, String diasAtencion, String horasAtencion) throws DAOExcepcion {
		
						
		
		CanchaDAO dao = new CanchaDAO();
		dao.buscarcanchafulbito(distrito, diasAtencion, horasAtencion);
			
		
	}
	
}
