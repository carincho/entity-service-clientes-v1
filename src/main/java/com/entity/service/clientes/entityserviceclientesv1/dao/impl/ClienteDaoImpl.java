package com.entity.service.clientes.entityserviceclientesv1.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import com.entity.service.clientes.entityserviceclientesv1.dao.ClienteDao;
import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;
import com.entity.service.clientes.entityserviceclientesv1.utils.Constantes;
import com.entity.service.clientes.entityserviceclientesv1.utils.Util;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ClienteDaoImpl extends ClienteDaoGeneric implements ClienteDao  {
	
	

	@Override
	public List<Cliente> consultarTodosClientes() {
		
		
		
		return obtenerListaClientes();
	}

	@Override
	public Cliente consultarClienteById(long id) {

		List<Cliente> clientes = obtenerListaClientes();
		
		
		Map<Long, Cliente>map = clientes.stream().collect(Collectors.toMap(Cliente::getId, Function.identity()));
		
		Cliente cliente = map.get(id);
		
		return cliente;
		
	}

}
