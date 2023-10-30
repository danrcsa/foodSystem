package br.com.system.food.dto;

import java.math.BigDecimal;

import br.com.system.food.domain.enumerator.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {
	
	private Long idProduto;
	private String nmProduto;
	private String nmDescricaoProduto;
	private BigDecimal bdValor;
	private Boolean inAtivo;
	private Integer idCategoria;
	private CategoriaEnum categoriaEnum;

		
}
