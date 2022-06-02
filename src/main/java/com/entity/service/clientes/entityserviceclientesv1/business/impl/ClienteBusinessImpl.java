package com.entity.service.clientes.entityserviceclientesv1.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.service.clientes.entityserviceclientesv1.business.ClienteBusiness;
import com.entity.service.clientes.entityserviceclientesv1.dao.ClienteDao;
import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;

@Service
public class ClienteBusinessImpl implements ClienteBusiness{
	
	
	@Autowired
	private ClienteDao dao;

	@Override
	public List<Cliente> consultarTodosClientes() {
		
		List<Cliente>list = dao.consultarTodosClientes();
		
		return list;
	}

	@Override
	public Cliente consultarClienteById(long id) {
	
		return dao.consultarClienteById(id);
	}

}
