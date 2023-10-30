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

import br.com.system.food.domain.pessoa.Funcionario;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.FuncionarioDto;
import br.com.system.food.service.FuncionarioService;

@RestController
@RequestMapping("/food/system/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioService funcionarioService;
	
	@GetMapping("")
	public ResponseEntity<Funcionario> recuperaFuncionario(
			@RequestParam final Long idFuncionario) {
		return new ResponseEntity<Funcionario>(funcionarioService.recuperarFuncionario(idFuncionario), HttpStatus.OK);

	}
	@PostMapping("/criar")
	public ResponseEntity<Funcionario> criarFuncionario(
			@RequestBody final FuncionarioDto funcionarioDto) {
		return new ResponseEntity<Funcionario>(funcionarioService.criarFuncionario(funcionarioDto), HttpStatus.CREATED);

	}
	@PostMapping("/atualizar")
	public ResponseEntity<Funcionario> atualizarFuncionario(
			@RequestBody final FuncionarioDto funcionarioDto) {
		return new ResponseEntity<Funcionario>(
				funcionarioService.atualizarFuncionario(funcionarioDto), HttpStatus.CREATED);


	}
	
	@GetMapping("/pessoa")
	public ResponseEntity<Pessoa> recuperarPessoa(
			@RequestParam final Integer idPessoa, 
			@RequestParam final String nmCpf) {
		return new ResponseEntity<Pessoa>(funcionarioService.recuperarPessoa(idPessoa, nmCpf), HttpStatus.OK);

	}
}
