package CN;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import dto.Proveedor;

public class CN_Proveedor_impl implements CN_Proveedor{
	
	@Override
	public void procesarListadoEnFich(List<Proveedor> listadoProv) {		
		FileWriter writer = null;
		//Definimos la ruta de salida del fichero
		String path = "../Salida/proveedores.txt";
		try {
			File file =  new File(path);
			file.createNewFile();
			//Abrimos un nuevo escritor de fichero con un buffer de entrada
			writer = new FileWriter(file);
			StringBuilder builder = new StringBuilder();
			
			if(listadoProv != null && listadoProv.size()>0) {
				DateFormat dtf =  new SimpleDateFormat("dd/MM/yyyy");
				//Recorremos el listado completo agregando a un Stringbuilder los datos de cada proveedor
				listadoProv.stream().forEach(prov -> {			
					builder.append(prov.getIdProveedor()+",");
					builder.append(prov.getNombre()+",");
					builder.append(dtf.format(prov.getFechaAlta())+",");
					builder.append(prov.getIdCliente());
					builder.append(" \n");		
				});
				
				try {
					writer.write(builder.toString());
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
					
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
