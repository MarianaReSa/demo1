package com.eam.megainventario.inventario.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.megainventario.inventario.entity.Cliente;
import com.eam.megainventario.inventario.repository.ClienteRepository;
import com.eam.megainventario.inventario.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Cliente buscarClientePorId(Integer id) {
		Cliente cliente = null;
		try {
			cliente = clienteRepository.findById(id).get();
		} catch (Exception e) {
			throw new EntityNotFoundException("Entidad cliente no encontrado");
		}
		return cliente;
	}

	@Override
	public int crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
