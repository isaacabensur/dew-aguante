package fulbito.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fulbito.exception.DAOExcepcion;
import fulbito.business.InsertarLocal;
import fulbito.model.Persona;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LocalServlet
 */
public class LocalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocalServlet() {
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
		
		InsertarLocal negocio = new InsertarLocal();
		

		String desLoc = request.getParameter("desLoc");
		String direccion = request.getParameter("direccion");
		String distrito = request.getParameter("distrito");
		String dicGoogle = request.getParameter("dicGoogle");
		int telefonoFijo = Integer.parseInt(request.getParameter("telefonoFijo"));
		HttpSession sesion = request.getSession();
		Persona vo = (Persona)sesion.getAttribute("USUARIO_ACTUAL");
		int codPer = vo.getCodPer();
		
		try {
			negocio.insertarLocal(desLoc, direccion, distrito, dicGoogle, telefonoFijo, codPer);
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		} catch (DAOExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
