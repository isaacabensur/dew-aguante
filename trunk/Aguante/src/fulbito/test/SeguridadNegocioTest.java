package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocio;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Persona;

public class SeguridadNegocioTest {
	
	
	Persona vo = new Persona();
	public SeguridadNegocioTest() {
		vo.setTipoPer("DUE");
		vo.setNombres("Jesus");
		vo.setPaterno("");
		vo.setMaterno("Dominguez");
		vo.setSexo("M");
		vo.setTipoDoc("DNI");
		vo.setNumDoc("44546462");
		vo.setCorreo("aaaad@hotmail.com");
		vo.setPassword("gi12345");
		vo.setFecNac("18/15/1984");
		vo.setCelular(65656);
	}
	
	
	@Test
	public void insertarPersonaTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
			
			Persona persona = null;
			
			if (vo.getPaterno().equals(""))
				Assert.fail("Ingrese apellido paterno");
			
			//INGRESAR TODO LO DEMAS
			
			persona=neg.buscarCorreo(vo.getCorreo());
			if (persona!=null)
				Assert.fail("El correo ya se encuentra registrado");
			
			persona=neg.buscarNumDoc(vo.getNumDoc());
			if (persona!=null)
				Assert.fail("El DNI ya se encuentra registrado");
			
	
			
			neg.insertarPersona(1,vo.getTipoPer(), vo.getNombres(), vo.getPaterno(), vo.getMaterno(), vo.getSexo(), vo.getTipoDoc(), vo.getNumDoc(), vo.getCorreo(), vo.getPassword(), vo.getFecNac(), vo.getCelular());
			
			
			
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	
	
	/*
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
	*/
	
}
