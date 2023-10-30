package br.com.system.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.system.food.domain.pessoa.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	
}
