package br.com.system.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.system.food.domain.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>, ProdutoRepositoryCustom {}

