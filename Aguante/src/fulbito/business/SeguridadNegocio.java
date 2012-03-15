package fulbito.business;

import fulbito.dao.PersonaDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Persona;

public class SeguridadNegocio {

	public void insertarPersona(int codPer, String tipoPer, String nombres, String paterno, String materno, String sexo, String tipoDoc, String numDoc, String correo, String password, String fecNac, int celular) throws DAOExcepcion {

		Persona model = new Persona();
		model.setCodPer(codPer);
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
		
		PersonaDAO dao = new PersonaDAO();
		dao.insertar(model);
	}

}
