package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Proveedor;

public class ProveedorDaoImpl implements ProveedorDao{

	@Override
	public void insert(Proveedor proveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Proveedor proveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proveedor read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> findListById(Integer id) {
		List<Proveedor> listado = new ArrayList<Proveedor>();
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://servidor/IBMConfirming?useServerPrepStmts=true", "usuario", "password");
			String consulta = "SELECT * FROM PROVEEDOR WHERE IDCLIENTE = ?";
			PreparedStatement query = conexion.prepareStatement(consulta,id);
			ResultSet set = query.executeQuery();
			
			while(set.next()) {
				Proveedor prov = new Proveedor();
				prov.setIdProveedor(set.getInt("IDPROVEEDOR"));
				prov.setIdCliente(set.getInt("IDCLIENTE"));
				prov.setNombre(set.getString("NOMBRE"));
				prov.setFechaAlta(set.getDate("FECHAALTA"));
				
				listado.add(prov);
			}					
		} catch (SQLException e) {
			System.err.format("Error conexion SQL", e.getSQLState(), e.getMessage());
		}
				
		return listado;
	}

}
