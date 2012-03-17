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
		vo.setPaterno("Paivca");
		vo.setMaterno("domingez");
		vo.setSexo("M");
		vo.setTipoDoc("DNI");
		vo.setNumDoc("427708462");
		vo.setCorreo("jpaiva2d@hotmail.com");
		vo.setPassword("gi12345");
		vo.setFecNac("18/12/1984");
		vo.setCelular(65656);
	}

	@Test
	public void insertarPersonaTest(){
		
		SeguridadNegocio neg = new SeguridadNegocio();
		try {
			
			Persona persona = null;
			persona=neg.buscarCorreo(vo.getCorreo());
			if (persona!=null)
				Assert.fail("correo se encuentra registrado junit!!!");
			
			persona=neg.buscarNumDoc(vo.getNumDoc());
			if (persona!=null)
				Assert.fail("La persona se encuetra registrada");
			
			
			neg.insertarPersona(1,vo.getTipoPer(), vo.getNombres(), vo.getPaterno(), vo.getMaterno(), vo.getSexo(), vo.getTipoDoc(), vo.getNumDoc(), vo.getCorreo(), vo.getPassword(), vo.getFecNac(), vo.getCelular());
			
			
			
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}

