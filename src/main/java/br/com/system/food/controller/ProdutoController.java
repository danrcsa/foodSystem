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

import br.com.system.food.configuration.ResourceDefault;
import br.com.system.food.domain.produto.Produto;
import br.com.system.food.dto.ProdutoDto;
import br.com.system.food.service.ProdutoService;

@RestController
@RequestMapping("/food/system/produto")
public class ProdutoController extends ResourceDefault {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2875245563383192797L;
	@Autowired
	ProdutoService service;

	@GetMapping("")
	public ResponseEntity<Object> recuperaCliente(
			@RequestParam final Long idProduto) {
		
		return sucesso(service.recuperarProduto(idProduto));
	}
	
	@PostMapping("criar")
	public ResponseEntity<Produto> criarCliente(
			@RequestBody final ProdutoDto dto) {
		return new ResponseEntity<Produto>(service.criarProduto(dto), HttpStatus.OK);
	}
	@PostMapping("atualizar")
	public ResponseEntity<Produto> atualizarCliente(
			@RequestBody final ProdutoDto dto) {
		return new ResponseEntity<Produto>(service.atualizar(dto), HttpStatus.OK);

	}
	

	@PostMapping("/listar")
	public ResponseEntity<Object> recuperaCliente(
			@RequestBody final ProdutoDto dto) {
		
		return sucesso(service.recuperarProduto(dto));
	}
	
}
