package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.business.SeguridadNegocioPersona;
import fulbito.exception.DAOExcepcion;

public class SeguridadNegocioPersonaTest {
	
	@Test
	public void insertarPersonaTest() {
		
		SeguridadNegocioPersona neg = new SeguridadNegocioPersona();
		try {
			neg.insertarPersona("ewrw", "Adrian", "Domingo", "Fernandez","F","DNI","132478785","132j23s@asd.com","576678","21/05/1995",45);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	
}
