package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.InsertarServAdicional;
import fulbito.exception.DAOExcepcion;

public class InsertarServAdicionalTest {
	
	
	
	@Test
	public void insertarServAdicionalTest(){
		
		InsertarServAdicional neg = new InsertarServAdicional();
		try {
		
			neg.insertarServAdicional("Camisetas", "Indumentaria del grupo en la cancha", 20.00,02);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
