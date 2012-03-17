package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocioAlquiler;
import fulbito.exception.DAOExcepcion;

public class SeguridadNegocioAlquilerTest {
	
	@Test
	public void insertarAlquilerTest() {
		
		SeguridadNegocioAlquiler neg = new SeguridadNegocioAlquiler();
		try {
			neg.isertarAlquiler("17/03/2012", 1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	
}
