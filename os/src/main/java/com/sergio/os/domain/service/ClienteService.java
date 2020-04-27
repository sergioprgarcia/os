package com.sergio.os.domain.service;

import org.springframework.stereotype.Service;

import com.sergio.os.domain.model.Cliente;
import com.sergio.os.domain.repository.ClienteRepository;

@Service
public class ClienteService {
	
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}

}
