package com.sergio.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergio.os.domain.model.Cliente;

@RestController
public class CidadeController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() { 
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Sergio");
		cliente1.setTelefone("9999-8888");
		cliente1.setEmail("sergio@email.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Luiz");
		cliente2.setTelefone("5555-4444");
		cliente2.setEmail("luiz@email.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
 