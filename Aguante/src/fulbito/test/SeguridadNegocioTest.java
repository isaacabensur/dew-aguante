package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;
//prueba

public class SeguridadNegocioTest {
	
	// Jasen VB - Cambios realizados a las 20:45
	
	
	@Test
	public void insertarRolTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
		
			neg.insertarPersona(2,"DUE", "Jorge", "Perez", "Garcia", "m", "DNI", "45124566", "abc@abc.com", "pass", "09/03/2012", 1234567);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
