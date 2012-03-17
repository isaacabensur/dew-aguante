package fulbito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fulbito.exception.DAOExcepcion;
import fulbito.model.ServAdicional;
import fulbito.util.ConexionBD;


public class ServAdicionalDAO extends BaseDAO {

	public void insertar(ServAdicional vo) throws DAOExcepcion {
		System.out.println("ServAdicionalDAO: insertar(ServAdicional vo)");
		String query = "INSERT INTO servadicional(codServ,tipo,descripcion,tarifa,Local_codLoc) VALUES (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodServ());
			stmt.setString(2, vo.getTipo());
			stmt.setString(3, vo.getDescripcion());
			stmt.setDouble(4, vo.getTarifa());
			stmt.setInt(5, vo.getoLocal().getCodLoc());
			
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar el Servicio Adicional");
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
