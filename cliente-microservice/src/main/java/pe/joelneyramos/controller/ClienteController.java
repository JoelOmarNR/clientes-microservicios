package pe.joelneyramos.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.joelneyramos.entity.Cliente;
import pe.joelneyramos.repository.ClienteRepository;

import javax.ws.rs.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> listclientes() {
		return clienteRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void creacliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
		
	}



}











