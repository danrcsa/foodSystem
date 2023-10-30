package br.com.system.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoProdutoDto {
	
	private Long idPedidoProduto;
	private Long idPedido;
	private Long idProduto;
	private String nmAnotacaoPedido;
	
}
