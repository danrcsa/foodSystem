package br.com.system.food.service;

import java.util.List;

import br.com.system.food.domain.produto.Produto;
import br.com.system.food.dto.ProdutoDto;

public interface ProdutoService {

	Produto criarProduto(ProdutoDto produtoDto);

	List<ProdutoDto> recuperarProduto(ProdutoDto dto);

	Produto atualizar(ProdutoDto dto);

	ProdutoDto recuperarProduto(Long idProduto);

}
