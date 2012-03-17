package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.InsertarCancha;
import fulbito.exception.DAOExcepcion;

public class InsertarCanchaTest {
	
	
	
	@Test
	public void insertarCanchaTest(){
		
		InsertarCancha neg = new InsertarCancha();
		try {
		
			neg.insertarCancha(1,"Cancha Messi", "Sintetica, iluminada", "L-S", "09:00-22:00", 10.25 , "dos por uno", "/images/canchamessi.jpg", 's', 1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
