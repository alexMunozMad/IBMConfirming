package prueba;

import java.util.ArrayList;
import java.util.List;

import CN.CN_Proveedor;
import CN.CN_Proveedor_impl;
import dao.ProveedorDao;
import dao.ProveedorDaoImpl;
import dto.Proveedor;

public class main {

	public static void main(Integer[] args) {
		
		ProveedorDao provDao = new ProveedorDaoImpl();
		List<Proveedor> listadoProv = new ArrayList<Proveedor>();
		CN_Proveedor cnProveedor = new CN_Proveedor_impl();
		
		if(args[0] != null) {
			//invocamos la busqueda de la lista de proveedores segun el parametro de entrada
			listadoProv = provDao.findListById(args[0]);
			
			//aplicamos la logica de procesamiento de datos al listado recuperado.
			cnProveedor.procesarListadoEnFich(listadoProv);
		}else{
			System.out.println("Se debe introducir un argumento para la ejecución. FIN.");
		}

	}

}
