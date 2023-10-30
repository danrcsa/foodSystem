package br.com.system.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.system.food.domain.pessoa.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> 
{
	
	void recuperarFuncionario(Integer idFuncionario, String nmCpf);

	void criar(Object object);

	void atualizar(Object object);
	
	
}
