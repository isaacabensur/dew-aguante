package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.InsertarLocal;
import fulbito.exception.DAOExcepcion;

public class InsertarLocalTest {
	
	@Test
	public void insertarLocalTest() {
		
		InsertarLocal neg = new InsertarLocal();
		try {
			neg.insertarLocal("a2213da afa", "sadasds", "Lince", "google",45698545,1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
		
	@Test
	public void insertarErrorLocalTest() {
		
		InsertarLocal neg = new InsertarLocal();
		try {
			neg.insertarLocal("av los safa", "av los", "Lince", "google",45698545,1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	@Test
	public void insertarErrorDuplicadoLocalTest() {
		
		InsertarLocal neg = new InsertarLocal();
		try {
			neg.insertarLocal("av los safa", "av los", "Lince", "google",45698545,1);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	
}
