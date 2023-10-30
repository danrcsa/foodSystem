package br.com.system.food.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.system.food.domain.pedido.PedidoProduto;

public interface PedidoProdutoRepository extends CrudRepository<PedidoProduto, Long>{


	List<PedidoProduto> findByIdPedido(Long idPedido);

}
