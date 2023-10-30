package br.com.system.food.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.system.food.domain.pessoa.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long>{

	Login findAllByNmEmailAndNmSenha(String nmEmail, String nmSenha);

}
