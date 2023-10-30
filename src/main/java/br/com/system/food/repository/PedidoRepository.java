package br.com.system.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.system.food.domain.pedido.Pedido;

public interface PedidoRepository  extends JpaRepository<Pedido, Long>, PedidoRepositoryCustom{

}