package fulbito.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fulbito.exception.DAOExcepcion;
import fulbito.business.InsertarEvento;
import fulbito.business.InsertarServAdicional;
import fulbito.business.SeguridadNegocioPersona;

/**
 * Servlet implementation class ServAdicionalServlet
 */
public class ServAdicionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServAdicionalServlet() {
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
        InsertarServAdicional negocio = new InsertarServAdicional(); 
		
		String tipo = request.getParameter("tipo");
		String descripcion = request.getParameter("descripcion");
		double tarifa = Double.parseDouble(request.getParameter("tarifa"));
		int local = Integer.parseInt(request.getParameter("local"));
		
	
		try {
			negocio.insertarServAdicional(tipo, descripcion, tarifa, local);
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} catch (DAOExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
