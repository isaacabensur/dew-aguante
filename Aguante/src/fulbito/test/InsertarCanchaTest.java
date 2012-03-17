package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.InsertarCancha;
import fulbito.business.InsertarServAdicional;
import fulbito.exception.DAOExcepcion;

public class InsertarCanchaTest {
	
	
	
	
	public void insertarCanchaTest(){
		
		InsertarCancha neg = new InsertarCancha();
		try {
		
			neg.insertarCancha("Cancha Francia", "Natural, sin iluminacion", "L-S", "09:00-17:00", 8.25 , "Sin oferta", "/images/canchamessi.jpg", "s", 1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
public void insertarMensajeErrorTest(){
		
		InsertarCancha neg = new InsertarCancha();
		try {
		
			neg.insertarCancha("", "", "", "", 0.0 , "", "", "", 0);
		} catch (DAOExcepcion e) {
			System.out.print(e.getMessage());
			Assert.fail("Falló: " + e.getMessage());
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

public void MensajeErrorNombreDuplicadoTest(){
	
	InsertarCancha neg = new InsertarCancha();
	try {
	
		neg.insertarCancha("Cancha Francia", "Natural, sin iluminacion", "L-S", "09:00-17:00", 8.25 , "Sin oferta", "/images/canchamessi.jpg", "s", 1);
	} catch (DAOExcepcion e) {
		Assert.fail("Falló: " + e.getMessage());
	} catch (Exception ex) {
		System.out.println(ex);
	}
}



}
