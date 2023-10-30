package br.com.system.food.service;

import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.PessoaDto;

public interface PessoaService {

	Pessoa recuperarPorId(Long idPessoa);
	
	Pessoa alterarPessoa(PessoaDto pessoaDto);
	
	Pessoa salvarPessoa(PessoaDto pessoaDto);
}
