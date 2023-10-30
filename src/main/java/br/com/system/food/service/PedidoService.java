package br.com.system.food.service;

import java.util.List;

import br.com.system.food.domain.pedido.Pedido;
import br.com.system.food.dto.PedidoDto;

public interface PedidoService {
	
	Pedido criarPedido(PedidoDto dto);

	void notificarCliente();

	Pedido recuperarPedido(Long idPedido);

	Pedido atualizarPedido(PedidoDto dto);

	void movimentaPedido(Long idPedido, int idStatusPedido);

	List<Pedido> recuperarPedidoPorStatus(int idStatusPedido);

	List<Pedido> recuperarPedidoAberto();

}
