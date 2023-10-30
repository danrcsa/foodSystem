package br.com.system.food.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.food.domain.produto.Produto;
import br.com.system.food.dto.ProdutoDto;
import br.com.system.food.mapper.ProdutoMapper;
import br.com.system.food.repository.ProdutoRepository;
import br.com.system.food.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoMapper mapper;
	
	@Autowired
	ProdutoRepository repo;
	@Override
	public ProdutoDto recuperarProduto(Long idProduto) {
		return mapper.produtoDto(repo.findById(idProduto).orElseThrow(NullPointerException::new));
	}

	@Override
	public Produto criarProduto(ProdutoDto dto) {
		return repo.save(mapper.produto(dto));
	}

	@Override
	public Produto atualizar(ProdutoDto dto) {
		return repo.save(mapper.produto(dto));
	}

	@Override
	public List<ProdutoDto> recuperarProduto(ProdutoDto dto) {
		List<Produto> lsProduto = repo.listarProduto(
				dto.getNmProduto(), dto.getNmDescricaoProduto(),  dto.getIdCategoria());
		return mapper.lsProdutoDto(lsProduto);
	}

}
