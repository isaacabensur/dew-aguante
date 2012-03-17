package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;

public class SeguridadNegocioTest {
	
	
	
	//@Test
	public void insertarPersonaTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
		
			neg.insertarPersona(1,"DUE", "Jorge", "Perez", "Garcia", "m", "DNI", "45124566", "abc@abc.com", "pass", "09/03/2012", 1234567);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	
	
	
	
	
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

