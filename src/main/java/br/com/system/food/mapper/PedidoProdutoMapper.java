package br.com.system.food.mapper;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.pedido.PedidoProduto;
import br.com.system.food.dto.PedidoProdutoDto;

@Component
public class PedidoProdutoMapper {

	public PedidoProduto pedidoProduto(PedidoProdutoDto dto) {
		PedidoProduto entidade = new PedidoProduto();
		entidade.setIdPedidoProduto(dto.getIdPedidoProduto());
		entidade.setIdPedido(dto.getIdPedido());
		entidade.setIdProduto(dto.getIdProduto());
		entidade.setNmAnotacaoPedido(dto.getNmAnotacaoPedido());
		return entidade;
	}

	public List<PedidoProduto> lsPedidoProduto(List<PedidoProdutoDto> lsPedidoProdutoDto, Long idPedido) {
		lsPedidoProdutoDto.forEach(pedidoProduto -> pedidoProduto.setIdPedido(idPedido));
		return lsPedidoProdutoDto.stream().map(this::pedidoProduto).collect(toList());
	}
	
}
