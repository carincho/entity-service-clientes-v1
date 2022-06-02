package com.entity.service.clientes.entityserviceclientesv1.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;
import com.entity.service.clientes.entityserviceclientesv1.utils.Constantes;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClienteDaoGeneric {
	
	
  public  File leerArchivoJson() {
		
		
		
		File file = null;
			
			file = new File(obtenerRutaArchivo());
			

			return file;
		
		}

	public String obtenerRutaArchivo() {
		
		String rutaArchivoJson = getClass().getClassLoader().getResource(Constantes.NOMBRE_ARCHIVO_JSON_CLIENTES).getFile();
	
		return rutaArchivoJson;
	}
	
	public List<Cliente> obtenerListaClientes() {
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<Cliente> clientes = null;
		
		try {
			
			
			clientes = mapper.readValue(leerArchivoJson(), new TypeReference<List<Cliente>>(){});
			
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clientes;
		
	}

}
