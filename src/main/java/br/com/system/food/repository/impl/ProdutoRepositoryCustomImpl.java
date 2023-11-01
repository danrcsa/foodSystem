package br.com.system.food.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import br.com.system.food.domain.produto.Produto;
import br.com.system.food.repository.ProdutoRepositoryCustom;

@Repository
public class ProdutoRepositoryCustomImpl implements ProdutoRepositoryCustom{
	
    @PersistenceContext
    private EntityManager em;

    @Override
	@SuppressWarnings("unchecked")
	public List<Produto> listarProduto(
			String nmProduto, String nmDescricaoProduto, Integer idCategoria){

		Query query = em.createQuery("select p from produto p where nmProduto like coalesce(CONCAT('%',:nomeProduto,'%'), nmProduto) "
				+ "and nmDescricaoProduto like coalesce(CONCAT('%', :nmDescricaoProduto,'%'), nmDescricaoProduto)"
				+ "and idCategoria = coalesce(:idCategoria, idCategoria) ");
		query.setParameter("nomeProduto", nmProduto);
		query.setParameter("nmDescricaoProduto", nmDescricaoProduto);
		query.setParameter("idCategoria", idCategoria);

		return query.getResultList();
	}

}
