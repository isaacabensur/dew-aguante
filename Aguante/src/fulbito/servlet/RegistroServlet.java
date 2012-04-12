package fulbito.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fulbito.exception.DAOExcepcion;
import fulbito.business.SeguridadNegocioPersona;

/**
 * Servlet implementation class SerRegCliente
 */
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SeguridadNegocioPersona negocio = new SeguridadNegocioPersona();
		
		String tipoPer = request.getParameter("tipoPer");
		String nombres = request.getParameter("nombres");
		String paterno = request.getParameter("paterno");
		String materno = request.getParameter("materno");
		String sexo = request.getParameter("sexo");
		String tipoDoc = request.getParameter("tipoDoc");
		String numDoc = request.getParameter("numDoc");
		String correo = request.getParameter("correo");
		String correoconf = request.getParameter("correoconf");
		String password = request.getParameter("password");
		String passwordconf = request.getParameter("passwordconf");
		String dia = request.getParameter("dia");
		String mes = request.getParameter("mes");
		String anio = request.getParameter("anio");
		int celular = Integer.parseInt(request.getParameter("celular"));
		String fecNac = dia+"/"+mes+"/"+anio;
		try {
			if(correo.equals(correoconf)) {
				if(password.equals(passwordconf)) {
					negocio.insertarPersona(tipoPer, nombres, paterno, materno, sexo, tipoDoc, numDoc, correo, password, fecNac, celular);
					response.sendRedirect(request.getContextPath() + "/index-duenio.jsp");
				} else {
					
				}
			} else {
				
			}
		} catch (DAOExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
