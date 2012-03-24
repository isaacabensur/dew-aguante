package fulbito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import fulbito.exception.DAOExcepcion;
import fulbito.model.Local;
import fulbito.util.ConexionBD;


public class LocalDAO extends BaseDAO {

	public Collection<Local> buscarPorNombre(String desLoc) throws DAOExcepcion {
		System.out.println("LocalDAO: buscarPorNombre(String desLoc)");
		String query = "SELECT desLoc, direccion FROM Local WHERE desLoc like ?";
		Collection<Local> lista = new ArrayList<Local>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + desLoc + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Local vo = new Local();
				vo.setDescripcion(rs.getString("desLoc"));
				vo.setDireccion(rs.getString("direccion"));
				lista.add(vo);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
	
	public void insertar(Local vo) throws DAOExcepcion {
		System.out.println("LocalDAO: insertar(Local vo)");
		String query = "INSERT INTO Local(desLoc,direccion,distrito,dicGoogle,telefonoFijo) VALUES (?,?,?,?,STR_TO_DATE(?,'%d/%m/%Y'))";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodLoc());
			stmt.setString(1, vo.getDescripcion());
			stmt.setString(2, vo.getDireccion());
			stmt.setString(3, vo.getDistrito());
			stmt.setString(4, vo.getDicGoogle());
			stmt.setInt(5, vo.getTelefonoFijo());
			
			Local localBusca = null;
		
			localBusca=buscarDesLoc(vo.getDescripcion());
			if (localBusca!=null)
				throw new SQLException("El local ya existe");
			
			
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
			else
			{
				System.out.println("El registro fue ingresado correctamente");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	public Local buscarDescripcion(String desLoc) throws DAOExcepcion {
		System.out.println("LocalDAO: buscarDesLoc(String desLoc)");
		Local vo = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select desLoc, direccion from Local where desLoc=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, desLoc);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo = new Local();
				vo.setDescripcion(rs.getString(1));
				vo.setDireccion(rs.getString(2));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}
	
	
}
