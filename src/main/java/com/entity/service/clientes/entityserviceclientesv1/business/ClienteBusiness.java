package com.entity.service.clientes.entityserviceclientesv1.business;

import java.util.List;

import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;

public interface ClienteBusiness {
	
	public List<Cliente>consultarTodosClientes();

	public Cliente consultarClienteById(long id);
}
