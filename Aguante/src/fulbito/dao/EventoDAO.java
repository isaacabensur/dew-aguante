package fulbito.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import fulbito.exception.DAOExcepcion;
import fulbito.model.Evento;
import fulbito.util.ConexionBD;



public class EventoDAO extends BaseDAO {

	
	
public void insertar(Evento vo) throws DAOExcepcion {
		System.out.println("EventoDAO: insertar(Evento vo)");
		String query = "INSERT INTO Evento(codEvento,nombre,premio,limiteCantidad,plazoIncripcion,Local_codLoc) VALUES (?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodEvento());
			stmt.setString(2, vo.getNombre());
			stmt.setString(3, vo.getPremio());
			stmt.setLong(4, vo.getLimiteCantidad());
			stmt.setDate(5,(Date) vo.getPlazoInscripcion());
			stmt.setInt(6, vo.getoLocal().getCodLoc());
		
			
			
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	

	
	

}

