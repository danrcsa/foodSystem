package br.com.system.food.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.system.food.domain.pedido.Pedido;
import br.com.system.food.repository.PedidoRepositoryCustom;

@Repository
public class PedidoRepositoryCustomImpl implements PedidoRepositoryCustom{
	
    @PersistenceContext
    private EntityManager em;

	@Override
	@SuppressWarnings("unchecked")
	public List<Pedido> findByIdStatusPedido(int idStatusPedido) {
		Query query = em.createQuery("select p from pedido p where p.idStatusPedido = :idStatusPedido");
		query.setParameter("idStatusPedido", idStatusPedido);
		return query.getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Pedido> findByIdStatusPedidoNotIn(int idStatusPedido) {
		Query query = em.createQuery("select p from pedido p where p.idStatusPedido <> 4");
		return query.getResultList();
	}
	@Transactional
	@Override
	@SuppressWarnings("unchecked")
	public	void updateIdStatusPedido(Long idPedido, int idStatusPedido ) {
		Query query = em.createQuery("update pedido p set p.idStatusPedido = :idStatusPedido where p.idPedido = :idPedido");
		query.setParameter("idPedido", idPedido);
		query.setParameter("idStatusPedido", idStatusPedido);
		query.executeUpdate();
	}


}
