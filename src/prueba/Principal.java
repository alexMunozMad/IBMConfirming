package prueba;

import java.util.ArrayList;
import java.util.List;

import CN.CN_Proveedor;
import CN.CN_Proveedor_impl;
import dao.ProveedorDao;
import dao.ProveedorDaoImpl;
import dto.Proveedor;

public class Principal {

	public static void main(String[] args) {
		
		ProveedorDao provDao = new ProveedorDaoImpl();
		List<Proveedor> listadoProv = new ArrayList<Proveedor>();
		CN_Proveedor cnProveedor = new CN_Proveedor_impl();
		if(args != null && args[0] != "" && args[0].matches("^[0-9]+$")) {
			//invocamos la busqueda de la lista de proveedores segun el parametro de entrada
			listadoProv = provDao.findListById(Integer.parseInt(args[0]));
			
			//aplicamos la logica de procesamiento de datos al listado recuperado.
			cnProveedor.procesarListadoEnFich(listadoProv);
		}else{
			System.out.println("Se debe introducir un argumento válido para la ejecución. FIN.");
		}

	}

}
