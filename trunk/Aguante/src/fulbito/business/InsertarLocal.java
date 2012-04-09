package fulbito.business;

import java.util.Collection;

import fulbito.dao.HorarioDAO;
import fulbito.dao.LocalDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Horario;
import fulbito.model.Local;
import fulbito.model.Duenio;

public class InsertarLocal {

	public void insertarLocal(String desLoc, String direccion, String distrito, String dicGoogle, Integer telefonoFijo, Integer codPer ) throws DAOExcepcion {
		
		Duenio oDuenio = new Duenio();
		
		boolean flag = true; 
		Local model = new Local();
		model.setDesLoc(desLoc);
		model.setDireccion(direccion);
		model.setDistrito(distrito);
		model.setDicGoogle(dicGoogle);
		model.setTelefonoFijo(telefonoFijo);
		oDuenio.setCodPer(codPer);
		model.setoDuenio(oDuenio);		
				
		if(desLoc == null || desLoc.equals("")) {
			flag = false;
			System.out.println("Ingrese la descripci�n del local");
			throw new DAOExcepcion("Ingrese la descripci�n del local");
		}
		if(direccion == null || direccion.equals("")) {
			flag = false;
			System.out.println("Ingrese la direci�n");
			throw new DAOExcepcion("Ingrese la direci�n");
		}
		if(distrito == null || distrito.equals("")) {
			flag = false;
			System.out.println("Ingrese el distrito");
			throw new DAOExcepcion("Ingrese el distrito");
		}
		if(dicGoogle == null || dicGoogle.equals("")) {
			flag = false;
			System.out.println("Ingrese la direcci�n en Google");
			throw new DAOExcepcion("Ingrese la direcci�n en Google");
		}
		if(telefonoFijo == null || telefonoFijo.equals("")) {
			flag = false;
			System.out.println("Ingrese el tel�fono fijo");
			throw new DAOExcepcion("Ingrese el tel�fono fijo");
		}
				
		LocalDAO dao = new LocalDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("El local con tel�fono fijo N� "+telefonoFijo+" se ha insertado correctamente.");
		}
		
	}
		
	public Collection<Local> buscarPorPersona(int codPersona) throws DAOExcepcion {
		
		boolean flag = true; 
		LocalDAO dao = new LocalDAO();
		Collection<Local> lista = dao.buscarPorPersona(codPersona);
		return lista;
	}
}