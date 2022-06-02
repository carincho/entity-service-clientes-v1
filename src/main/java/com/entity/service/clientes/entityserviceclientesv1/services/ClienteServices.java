package com.entity.service.clientes.entityserviceclientesv1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.service.clientes.entityserviceclientesv1.business.ClienteBusiness;
import com.entity.service.clientes.entityserviceclientesv1.modelo.Cliente;

@RestController
@RequestMapping(value = "/api/cliente/v1")


public class ClienteServices {
	
	@Autowired
	private ClienteBusiness business;
	
	
	@GetMapping(value="/clientes")
	public List<Cliente>consultarTodos() {
		
		return business.consultarTodosClientes();
		
		
	}
	
	@GetMapping(value="/cteById/{id}")
	public ResponseEntity<Cliente> consultarClientePorId(@PathVariable long id) {
		
		Cliente cliente =  business.consultarClienteById(id);
		
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	

}
