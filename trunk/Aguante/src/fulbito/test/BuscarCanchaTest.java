package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocioCancha;
import fulbito.exception.DAOExcepcion;

public class BuscarCanchaTest {
	
	
	
	@Test
	public void buscarcanchafulbito(){
		
		SeguridadNegocioCancha neg = new SeguridadNegocioCancha();
		try {
		
			neg.BuscarCanchaFulbito("Cancha Carlos", "Natural, sin iluminacion", "L-S");
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
