package CN;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import dto.Proveedor;

public class CN_Proveedor_impl implements CN_Proveedor{
	
	@Override
	public void procesarListadoEnFich(List<Proveedor> listadoProv) {
		FileWriter writer = null;
		//Definimos la ruta de salida del fichero
		String path = "C:\\archivoSalida\\proveedores.txt";
		try {
			//Abrimos un nuevo escritor de fichero con un buffer de entrada
			writer = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(writer);
			StringBuilder builder = new StringBuilder();
			
			if(listadoProv != null && listadoProv.size()>0) {
				//Recorremos el listado completo agregando a un Stringbuilder los datos de cada proveedor
				listadoProv.stream().forEach(prov -> {			
					builder.append(prov.getIdProveedor()+",");
					builder.append(prov.getNombre()+",");
					builder.append(prov.getFechaAlta()+",");
					builder.append(prov.getIdCliente()+",");
					builder.append(" \n");		
				});
				
				try {
					buffer.write(builder.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
					
				buffer.close();
				System.out.println("Archivo guardado.");
			}else {
				//En caso de devolver una lista vacia notificamos un mensaje.
				System.out.println("El cliente no tiene proveedores asignados.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//Aseguramos siempre el cierre de fichero
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
