package fulbito.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;

public class prueba {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void insertarPersonaTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
		
			neg.insertarPersona(1,"DUE", "Jorge", "Perez", "Garcia", "m", "DNI", "45124566", "abc@abc.com", "pass", "09/03/2012", 3);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
			System.out.println(e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
