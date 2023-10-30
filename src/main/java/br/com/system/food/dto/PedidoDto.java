package br.com.system.food.dto;

import java.math.BigDecimal;
import java.util.List;

import br.com.system.food.domain.pessoa.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {
	
	private Long idPedido;
	private Long idCliente;
	private List<PedidoProdutoDto> lsPedidoProdutoDto;
	private BigDecimal bdValorPedido = new BigDecimal(0);
	private int idStatusPedido;
	private String nmAnotacaoPedido;
	private Cliente cliente;
	
}

