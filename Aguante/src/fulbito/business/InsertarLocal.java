package fulbito.business;

import fulbito.dao.LocalDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Local;

public class InsertarLocal {

	public void insertarLocal(String desLoc, String direccion, String distrito, String dicGoogle, Integer telefonoFijo) throws DAOExcepcion {
		
		boolean flag = true; 
		Local model = new Local();
		model.setDesLoc(desLoc);
		model.setDireccion(direccion);
		model.setDistrito(distrito);
		model.setDicGoogle(dicGoogle);
		model.setTelefonoFijo(telefonoFijo);
				
		if(desLoc == null || desLoc.equals("")) {
			flag = false;
			System.out.println("Ingrese la descripción del local");
			throw new DAOExcepcion("Ingrese la descripción del local");
		}
		if(direccion == null || direccion.equals("")) {
			flag = false;
			System.out.println("Ingrese la direción");
			throw new DAOExcepcion("Ingrese la direción");
		}
		if(distrito == null || distrito.equals("")) {
			flag = false;
			System.out.println("Ingrese el distrito");
			throw new DAOExcepcion("Ingrese el distrito");
		}
		if(dicGoogle == null || dicGoogle.equals("")) {
			flag = false;
			System.out.println("Ingrese la dirección en Google");
			throw new DAOExcepcion("Ingrese la dirección en Google");
		}
		if(telefonoFijo == null || telefonoFijo.equals("")) {
			flag = false;
			System.out.println("Ingrese el teléfono fijo");
			throw new DAOExcepcion("Ingrese el teléfono fijo");
		}
				
		LocalDAO dao = new LocalDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("El local con teléfono fijo N° "+telefonoFijo+" se ha insertado correctamente.");
		}
		
	}
		
	
}
