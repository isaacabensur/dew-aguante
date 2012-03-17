package fulbito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import fulbito.exception.DAOExcepcion;
import fulbito.model.Persona;
import fulbito.model.ServAdicional;
import fulbito.util.ConexionBD;



public class PersonaDAO extends BaseDAO {

	public Collection<Persona> buscarPorNombre(String nombre) throws DAOExcepcion {
		System.out.println("PersonaDAO: buscarPorNombre(String nombre)");
		String query = "SELECT Persona_nombre, descripcion FROM Persona WHERE Persona_nombre like ?";
		Collection<Persona> lista = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + nombre + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Persona vo = new Persona();
				vo.setNombres(rs.getString("Persona_nombre"));
				vo.setPaterno(rs.getString("descripcion"));
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
	
	public void insertar(Persona vo) throws DAOExcepcion {
		System.out.println("PersonaDAO: insertar(Persona vo)");
		String query = "INSERT INTO Persona(codPer,tipoPer,nombres,paterno,materno,sexo,tipoDoc,numDoc,correo,password,fecNac,celular) VALUES (?,?,?,?,?,?,?,?,?,?,STR_TO_DATE(?,'%d/%m/%Y'),?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodPer());
			stmt.setString(2, vo.getTipoPer());
			stmt.setString(3, vo.getNombres());
			stmt.setString(4, vo.getPaterno());
			stmt.setString(5, vo.getMaterno());
			stmt.setString(6, vo.getSexo());
			stmt.setString(7, vo.getTipoDoc());
			stmt.setString(8, vo.getNumDoc());
			stmt.setString(9, vo.getCorreo());
			stmt.setString(10, vo.getPassword());
			stmt.setString(11, vo.getFecNac());
			stmt.setInt(12, vo.getCelular());
			
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

	public Persona obtener(String PersonaNombre) throws DAOExcepcion {
		System.out.println("PersonaDAO: obtener(String PersonaNombre)");
		Persona vo = new Persona();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select Persona_nombre, descripcion from Persona where Persona_nombre=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, PersonaNombre);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setNombres(rs.getString(1));
				vo.setPaterno(rs.getString(2));
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

	public void eliminar(String PersonaNombre) throws DAOExcepcion {
		System.out.println("PersonaDAO: eliminar(String PersonaNombre)");
		String query = "DELETE FROM Persona WHERE Persona_nombre=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, PersonaNombre);
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo eliminar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	public void actualizar(Persona vo) throws DAOExcepcion {
		System.out.println("PersonaDAO: actualizar(Persona vo)");
		String query = "update Persona set descripcion=? where Persona_nombre=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, vo.getNombres());
			stmt.setString(2, vo.getPaterno());
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo actualizar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	
	public Collection<Persona> listar() throws DAOExcepcion {
		System.out.println("PersonaDAO: listar()");
		Collection<Persona> c = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
		con = ConexionBD.obtenerConexion();
		String query = "SELECT Persona_nombre,descripcion from Persona";
		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();
		while (rs.next()) {
		Persona vo = new Persona();
		vo.setNombres(rs.getString("Persona_nombre"));
		vo.setPaterno(rs.getString("descripcion"));
		c.add(vo);
		}
		} catch (SQLException e) {
		System.err.println(e.getMessage());
		throw new DAOExcepcion(e.getMessage());
		} finally {
		this.cerrarStatement(stmt);
		this.cerrarConexion(con);
		}
		return c;
		}

	//public void insertar(ServAdicional vo) throws DAOExcepcion {
	//	System.out.println("PersonaDAO: insertar(ServAdicional vo)");
	//	String query = "INSERT INTO servadicional(codServ,tipo,descripcion,tarifa,Local_codLoc) VALUES (?,?,?,?,?)";
	//	Connection con = null;
	//	PreparedStatement stmt = null;
	//	try {
	//		con = ConexionBD.obtenerConexion();
	//		stmt = con.prepareStatement(query);
	//		stmt.setInt(1, vo.getCodServ());
	//		stmt.setString(2, vo.getTipo());
	//		stmt.setString(3, vo.getDescripcion());
	//		stmt.setDouble(4, vo.getTarifa());
	//		stmt.setInt(5, vo.getoLocal().getCodLoc());
			
	//		int i = stmt.executeUpdate();
	//		if (i != 1) {
	//			throw new SQLException("No se pudo insertar el Servicio Adicional");
	//		}
	//	} catch (SQLException e) {
	//		System.err.println(e.getMessage());
	//		throw new DAOExcepcion(e.getMessage());
	//	} finally {
	//		this.cerrarStatement(stmt);
	//		this.cerrarConexion(con);
	//	}
	//}
}