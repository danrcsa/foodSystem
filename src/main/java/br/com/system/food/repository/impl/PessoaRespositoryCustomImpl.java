package br.com.system.food.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.repository.PessoaRespositoryCustom;

public class PessoaRespositoryCustomImpl implements PessoaRespositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void updatePessoa(Pessoa pessoa) {
		
		Query query = em.createQuery("update pessoa set "
				+ "nmEmail = :nmEmail, nmTelefone =:nmTelefone "
				+ "where idPessoa = :idPessoa");
		query.setParameter("nmEmail", pessoa.getNmEmail());
		query.setParameter("nmTelefone", pessoa.getNmTelefone());
		query.setParameter("idPessoa", pessoa.getIdPessoa());
		query.executeUpdate();
	}
}
