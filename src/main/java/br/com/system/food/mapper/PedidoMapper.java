package br.com.system.food.mapper;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.pedido.Pedido;
import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.dto.PedidoDto;

@Component
public class PedidoMapper {
	
	public Pedido pedido(PedidoDto dto, Cliente cliente) {
		Pedido entidade = new Pedido();
		entidade.setIdPedido(dto.getIdPedido());
		entidade.setNmAnotacaoPedido(dto.getNmAnotacaoPedido());
		entidade.setCliente(cliente);
		entidade.setBdValorPedido(dto.getBdValorPedido());
		entidade.setIdStatusPedido(dto.getIdStatusPedido());
		return entidade;
	}
}
