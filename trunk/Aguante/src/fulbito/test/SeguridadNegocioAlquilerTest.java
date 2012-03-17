package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;

public class SeguridadNegocioAlquilerTest {
	
	@Test
	public void insertarPublicidadTest() {
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
			neg.isertarPublicidad("Bienvenida", "Se da una grata bienvenida a los inscritos", "15/03/2012", "18/03/2012", 1000.0, 0, "P1", 1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	
}
