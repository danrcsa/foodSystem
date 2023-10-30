package br.com.system.food.repository;

import java.util.List;

import br.com.system.food.domain.pedido.Pedido;

public interface PedidoRepositoryCustom {
	
	List<Pedido> findByIdStatusPedido(int idStatusPedido);

	List<Pedido> findByIdStatusPedidoNotIn(int i);

	void updateIdStatusPedido(Long idPedido, int idStatusPedido);
	

}
