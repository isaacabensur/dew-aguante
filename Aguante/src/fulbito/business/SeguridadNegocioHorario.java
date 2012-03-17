package fulbito.business;

import fulbito.dao.HorarioDAO;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Alquiler;
import fulbito.model.Cancha;
import fulbito.model.Horario;

public class SeguridadNegocioHorario {
	
	public void isertarHorario(String fecha, String horaInicio, String horaFin, String estado, Integer numCan, Integer codAlquiler) throws DAOExcepcion {
		
		boolean flag = true; 
		Horario model = new Horario();
		Cancha cancha = new Cancha();
		Alquiler alquiler =  new Alquiler();
		model.setFecha(fecha);
		model.setHoraInicio(horaInicio);
		model.setHoraFin(horaFin);
		model.setEstado(estado);
		cancha.setNumCan(numCan);
		model.setoCancha(cancha);
		alquiler.setCodAlquiler(codAlquiler);
		model.setoAlquiler(alquiler);
		
		if(fecha == null || fecha.equals("")) {
			flag = false;
			System.out.println("Ingrese la fecha para el horario de la cancha");
		}
		if(horaInicio == null || horaInicio.equals("")) {
			flag = false;
			System.out.println("Ingrese la hora de inicio del horario");
		}
		if(horaFin == null || horaFin.equals("")) {
			flag = false;
			System.out.println("Ingrese la hora de fin del horario");
		}
		if(estado == null || estado.equals("")) {
			flag = false;
			System.out.println("Ingrese el estado del horario");
		}
		if(numCan == null || numCan.equals("")) {
			flag = false;
			System.out.println("Ingrese el número de la cancha para el horario");
		}
		if(codAlquiler == null || codAlquiler.equals("")) {
			flag = false;
			System.out.println("Ingrese el código del alquiler para el hoario");
		}
		HorarioDAO dao = new HorarioDAO();
		if(flag) {
			dao.insertar(model);
			System.out.println("El horario para la fecha "+fecha+" se ha insertado correctamente.");
		}
		
	}
	
}
