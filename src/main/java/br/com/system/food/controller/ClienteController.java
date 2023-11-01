package br.com.system.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Login;
import br.com.system.food.dto.ClienteDto;
import br.com.system.food.dto.LoginDto;
import br.com.system.food.service.ClienteService;

@RestController
@RequestMapping("/food/system/cliente")
public class ClienteController {

	@Autowired
	ClienteService clinteService;

	@GetMapping("")
	public ResponseEntity<Cliente> recuperaCliente(
			@RequestParam final Long idCliente) {
		return new ResponseEntity<>(clinteService.recuperarClinte(idCliente), HttpStatus.OK);

	}
	@PostMapping("criar")
	public ResponseEntity<Cliente> criarCliente(
			@RequestBody final ClienteDto clienteDto) {
		return new ResponseEntity<>(clinteService.criarCliente(clienteDto), HttpStatus.CREATED);

	}
	@PostMapping("atualizar")
	public ResponseEntity<Cliente> atualizarCliente(
			@RequestBody(required = true) final ClienteDto clienteDto) {
		
		return new ResponseEntity<>(
				clinteService.atualizarCliente(clienteDto), HttpStatus.OK);
	}
	
	@PostMapping("logar")
	public ResponseEntity<Login> logarCliente(
			@RequestBody final LoginDto login) {
		return new ResponseEntity<>(clinteService.login(login), HttpStatus.ACCEPTED);		

	}
}
