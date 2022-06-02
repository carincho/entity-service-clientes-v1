package com.entity.service.clientes.entityserviceclientesv1.dao;

import java.util.List;

import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;

public interface ClienteDao {
	
	public List<Cliente> consultarTodosClientes();
	public Cliente consultarClienteById(long id);
	

}
