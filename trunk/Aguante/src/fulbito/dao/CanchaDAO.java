package fulbito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import fulbito.exception.DAOExcepcion;
import fulbito.model.Cancha;
import fulbito.util.ConexionBD;



public class CanchaDAO extends BaseDAO {


	
public void insertar(Cancha vo) throws DAOExcepcion {
		System.out.println("CanchaDAO: insertar(Cancha vo)");
		String query = "INSERT INTO cancha(numCancha,nombre,caracteristicas,diasAtencion,horasAtencion,tarifa,promo,foto,disponible,Local_codLoc) VALUES (?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getNumCan());
			stmt.setString(2, vo.getNombre());
			stmt.setString(3, vo.getCaracteristicas());
			stmt.setString(4, vo.getDiasAtencion());
			stmt.setString(5, vo.getHorasAtencion());
			stmt.setLong(6, (long) vo.getTarifa());
			stmt.setString(7, vo.getPromo());
			stmt.setString(8, vo.getFoto());
			stmt.setLong(9, vo.getDisponible());
			stmt.setInt(10, vo.getoLocal().getCodLoc());
			
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

