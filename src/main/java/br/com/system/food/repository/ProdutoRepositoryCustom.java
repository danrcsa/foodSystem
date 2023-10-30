package br.com.system.food.repository;

import java.util.List;

import br.com.system.food.domain.produto.Produto;

public interface ProdutoRepositoryCustom {
	public List<Produto> listarProduto(String nmProduto,
			String nmDescricaoProduto, int idCategoria);


}
