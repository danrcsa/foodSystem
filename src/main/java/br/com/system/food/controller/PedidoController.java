package br.com.system.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.system.food.domain.pedido.Pedido;
import br.com.system.food.dto.PedidoDto;
import br.com.system.food.service.PedidoService;

@RestController
@RequestMapping("/food/system/pedido")
public class PedidoController {
	
	@Autowired
	PedidoService service;
	
	@GetMapping("")
	public ResponseEntity<Pedido> recuperaPedido(
			@RequestParam(required = true) final Long idPedido) {
		return new ResponseEntity<>(service.recuperarPedido(idPedido), HttpStatus.OK);

	}
	
	@PostMapping("/criar")
	public ResponseEntity<Pedido> criaPedido(
			@RequestBody final PedidoDto dto) {
		return new ResponseEntity<>(service.criarPedido(dto), HttpStatus.OK);

	}

	@PutMapping("/atualizar")
	public ResponseEntity<Pedido> atualizaPedido(
			@RequestParam final int idPedido,
			@RequestParam final Long idStatus) {
		return new ResponseEntity<Pedido>(service.atualizarPedido(idPedido, idStatus), HttpStatus.OK);
	}
	
	@PostMapping("/encerrar")
	public ResponseEntity<Void> encerraPedido(
			@RequestHeader final HttpHeaders headers,
			@RequestParam(required = true) final Integer idPedido) {
				return null;

	}

	@PostMapping("/notificar")
	public ResponseEntity<Void> notificarPedido(
			@RequestParam(required = true) final Integer idPedido) {
		service.notificarCliente();
		return null;

	}
	
	@PutMapping("/movimenta/pedido")
	public ResponseEntity<Void> movimentaPedido(
			@RequestParam final Long idPedido,
			@RequestParam final int idStatusPedido){
		service.movimentaPedido(idPedido, idStatusPedido);
		return null;
		
	}
	@GetMapping("/aberto/lista")
	public ResponseEntity<List<Pedido>> recuperarPedidoAberto(){
		return new ResponseEntity<List<Pedido>>(service.recuperarPedidoAberto(), HttpStatus.OK);
	}

	@GetMapping("/status/lista")
	public ResponseEntity<List<Pedido>> recuperarPedidoPorStatus(
			@RequestParam final int idStatusPedido){
		return new ResponseEntity<List<Pedido>>(service.recuperarPedidoPorStatus(idStatusPedido), HttpStatus.OK);

		
	}

	
	
}

