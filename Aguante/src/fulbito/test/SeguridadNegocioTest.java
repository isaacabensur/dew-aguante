package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;

public class SeguridadNegocioTest {

	@Test
	public void insertarRolTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
			//SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy", Locale.getDefault());
			//String fecnac = "09/03/2012";
			//Date nacimiento;
			//nacimiento = df.parse(fecnac);
		
			neg.insertarPersona(2,"DUE", "Jorge", "Perez", "Garcia", "m", "DNI", "45124566", "abc@abc.com", "pass", "09/03/2012", 1234567);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
