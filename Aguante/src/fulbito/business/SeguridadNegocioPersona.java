package fulbito.business;

import fulbito.dao.PersonaDAO;
import fulbito.exception.DAOExcepcion;
//import fulbito.model.Administrador;
import fulbito.model.Persona;

public class SeguridadNegocioPersona {
	
	public void insertarPersona(String tipoPer, String nombres, String paterno, String materno, String sexo, String tipoDoc, String numDoc, String correo, String password, String fecNac, Integer celular) throws DAOExcepcion {
		
		boolean flag = true; 
		Persona model = new Persona();
		model.setTipoPer(tipoPer);
		model.setNombres(nombres);
		model.setPaterno(paterno);
		model.setMaterno(materno);
		model.setSexo(sexo);
		model.setTipoDoc(tipoDoc);
		model.setNumDoc(numDoc);
		model.setCorreo(correo);
		model.setPassword(password);
		model.setFecNac(fecNac);
		model.setCelular(celular);
		
		if(tipoPer == null || tipoPer.equals("")) {
			flag = false;
			System.out.println("Ingrese el tipo de persona");
		}
		if(nombres == null || nombres.equals("")) {
			flag = false;
			System.out.println("Ingrese los nombres");
		}
		if(paterno == null || paterno.equals("")) {
			flag = false;
			System.out.println("Ingrese el apellido paterno");
		}
		if(materno == null || materno.equals("")) {
			flag = false;
			System.out.println("Ingrese el apellido materno");
		}
		if(sexo == null || sexo.equals("")) {
			flag = false;
			System.out.println("Ingrese el sexo");
		}
		if(tipoDoc == null || tipoDoc.equals("")) {
			flag = false;
			System.out.println("Ingrese el tipo de documento");
		}
		if(numDoc == null || numDoc.equals("")) {
			flag = false;
			System.out.println("Ingrese el número de documento");
		}
		if(correo == null || correo.equals("")) {
			flag = false;
			System.out.println("Ingrese el correo");
		}
		if(password == null || password.equals("")) {
			flag = false;
			System.out.println("Ingrese el password");
		}
		if(fecNac == null || fecNac.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha de nacimiento");
		}
		if(celular == null || celular.equals("")) {
			flag = false;
			System.out.println("Ingrese el celular");
		}
		
		PersonaDAO dao = new PersonaDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("El usuario "+nombres+" "+paterno+" "+materno+" se ha insertado correctamente.");
		}
		
	}
	
}
