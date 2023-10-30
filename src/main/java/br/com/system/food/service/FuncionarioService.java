package br.com.system.food.service;

import br.com.system.food.domain.pessoa.Funcionario;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.FuncionarioDto;

public interface FuncionarioService {

	Funcionario atualizarFuncionario(FuncionarioDto funcionarioDto);

	Pessoa recuperarPessoa(Integer idPessoa, String nmCpf);

	Funcionario criarFuncionario(FuncionarioDto funcionarioDto);

	Funcionario recuperarFuncionario(Long idFuncionario);

}
