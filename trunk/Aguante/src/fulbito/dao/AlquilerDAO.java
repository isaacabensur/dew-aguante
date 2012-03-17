package fulbito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import fulbito.exception.DAOExcepcion;
import fulbito.model.Alquiler;
import fulbito.util.ConexionBD;



public class AlquilerDAO extends BaseDAO {

	public Collection<Alquiler> buscarPorFecha(String fecha) throws DAOExcepcion {
		System.out.println("AlquilerDAO: buscarPorFecha(String fecha)");
		String query = "SELECT codAlquiler FROM alquiler WHERE fecAlquiler like ?";
		Collection<Alquiler> lista = new ArrayList<Alquiler>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + titulo + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Alquiler vo = new Alquiler();
				vo.setTitulo(rs.getString("titulo"));
				vo.setContenido(rs.getString("contenido"));
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

	
public void insertar(Alquiler vo) throws DAOExcepcion {
		System.out.println("AlquilerDAO: insertar(Alquiler vo)");
		String query = "INSERT INTO alquiler(titulo,contenido,fechaInicio,fechaFin,tarifa,clicks,seccion,Persona_codPer) VALUES (?,?,STR_TO_DATE(?,'%d/%m/%Y'),STR_TO_DATE(?,'%d/%m/%Y'),?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, vo.getTitulo());
			stmt.setString(2, vo.getContenido());
			stmt.setString(3, vo.getFechaInicio());
			stmt.setString(4, vo.getFechaFin());
			stmt.setDouble(5, vo.getTarifa());
			stmt.setInt(6, vo.getClicks());
			stmt.setString(7, vo.getSeccion());
			stmt.setInt(8, vo.getoAdministrador().getCodPer());
			
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

	public Alquiler obtener(String codigoAlquiler) throws DAOExcepcion {
		System.out.println("AlquilerDAO: obtener(String codigoAlquiler)");
		Alquiler vo = new Alquiler();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select titulo, contenido from alquiler where codAlquiler=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, codigoAlquiler);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setTitulo(rs.getString(1));
				vo.setContenido(rs.getString(2));
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

	public void eliminar(String codigoAlquiler) throws DAOExcepcion {
		System.out.println("AlquilerDAO: eliminar(String codigoAlquiler)");
		String query = "DELETE FROM alquiler WHERE codAlquiler=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, codigoAlquiler);
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

	public void actualizar(Alquiler vo) throws DAOExcepcion {
		System.out.println("AlquilerDAO: actualizar(Alquiler vo)");
		String query = "update alquiler set contenido=? where codAlquiler=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, vo.getContenido());
			stmt.setInt(2, vo.getCodAlquiler());
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

	
public Collection<Alquiler> listar() throws DAOExcepcion {
		System.out.println("AlquilerDAO: listar()");
		Collection<Alquiler> c = new ArrayList<Alquiler>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			String query = "SELECT codAlquiler, titulo, contenido, fechaInicio, fechaFin, tarifa from alquiler";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Alquiler vo = new Alquiler();
				vo.setCodAlquiler(rs.getInt("codAlquiler"));
				vo.setTitulo(rs.getString("titulo"));
				vo.setContenido(rs.getString("contenido"));
				vo.setFechaInicio(rs.getString("fechaInicio"));
				vo.setFechaFin(rs.getString("fechaFin"));
				vo.setTarifa(rs.getDouble("tarifa"));
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

}

