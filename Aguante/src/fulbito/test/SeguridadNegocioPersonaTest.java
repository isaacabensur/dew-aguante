package fulbito.test;

import junit.framework.Assert;
import org.junit.Test;

import fulbito.business.SeguridadNegocioPersona;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Persona;

public class SeguridadNegocioPersonaTest {
	
	
	Persona vo = new Persona();
	public SeguridadNegocioPersonaTest() {
		vo.setTipoPer("ere");
		vo.setNombres("Jesus");
		vo.setPaterno("yo");
		vo.setMaterno("Dominguez");
		vo.setSexo("");
		vo.setTipoDoc("DNI");
		vo.setNumDoc("44546462");
		vo.setCorreo("aaaad@hotmail.com");
		vo.setPassword("2432432");
		vo.setFecNac("18/15/1984");
		vo.setCelular(45);
	}
	

	
	
	@Test
	public void insertarPersonaTest(){
		
		SeguridadNegocioPersona neg = new SeguridadNegocioPersona();
		try {
			
			Persona persona = null;
			
			if (vo.getTipoPer().equals(""))
				Assert.fail("Ingrese tipo de persona");
			
			if (vo.getNombres().equals(""))
				Assert.fail("Ingrese nombres");
			
			if (vo.getPaterno().equals(""))
				Assert.fail("Ingrese apellido paterno");
			
			if (vo.getMaterno().equals(""))
				Assert.fail("Ingrese apellido materno");
			
			if (vo.getSexo().equals(""))
				Assert.fail("Ingrese sexo");
			
			if (vo.getTipoDoc().equals(""))
				Assert.fail("Ingrese tipo de documento");
			
			if (vo.getNumDoc().equals(""))
				Assert.fail("Ingrese número de documento");
			
			if (vo.getCorreo().equals(""))
				Assert.fail("Ingrese correo");
			
			if (vo.getPassword().equals(""))
				Assert.fail("Ingrese password");
			
			if (vo.getFecNac().equals(""))
				Assert.fail("Ingrese fecha de nacimiento");
			
			if (vo.getCelular().equals(""))
				Assert.fail("Ingrese celular");
			
			persona=neg.buscarCorreo(vo.getCorreo());
			if (persona!=null)
				Assert.fail("El correo ya se encuentra registrado");
			
			persona=neg.buscarNumDoc(vo.getNumDoc());
			if (persona!=null)
				Assert.fail("El DNI ya se encuentra registrado");
			
	
			//neg.insertarPersona("DUE","Jorge","Salazar","Dominguez","M","DNI",10245896,"ade@ade.com","123456","26/08/1985",986584135);
			neg.insertarPersona(1,vo.getTipoPer(), vo.getNombres(), vo.getPaterno(), vo.getMaterno(), vo.getSexo(), vo.getTipoDoc(), vo.getNumDoc(), vo.getCorreo(), vo.getPassword(), vo.getFecNac(), vo.getCelular());
			
			
			
		} catch (DAOExcepcion e) {
			Assert.fail("Falló: " + e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
