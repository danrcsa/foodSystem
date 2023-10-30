package br.com.system.food.mapper;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.enumerator.CategoriaEnum;
import br.com.system.food.domain.produto.Produto;
import br.com.system.food.dto.ProdutoDto;

@Component
public class ProdutoMapper {
	
	public Produto produto(ProdutoDto dto) {
		Produto entidade = new Produto();
		entidade.setIdProduto(dto.getIdProduto());
		entidade.setNmDescricaoProduto(dto.getNmDescricaoProduto());
		entidade.setNmProduto(dto.getNmProduto());
		entidade.setInAtivo(dto.getInAtivo());
		entidade.setBdValor(dto.getBdValor());
		entidade.setIdCategoria(dto.getIdCategoria());
		return entidade;
	}

	public ProdutoDto produtoDto(Produto entidade) {
		ProdutoDto dto = new ProdutoDto();
		dto.setIdProduto(entidade.getIdProduto());
		dto.setNmDescricaoProduto(entidade.getNmDescricaoProduto());
		dto.setNmProduto(entidade.getNmProduto());
		dto.setInAtivo(entidade.getInAtivo());
		dto.setBdValor(entidade.getBdValor());
		dto.setIdCategoria(entidade.getIdCategoria());
		dto.setCategoriaEnum(CategoriaEnum.getById(entidade.getIdCategoria()));
		return dto;
	}
	public List<ProdutoDto> lsProdutoDto(List<Produto> lsEntidade){
		return lsEntidade.stream().map(this::produtoDto).collect(toList());
	}
}