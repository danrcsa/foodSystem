package br.com.system.food.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.food.configuration.NaoEncontradoException;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.PessoaDto;
import br.com.system.food.mapper.PessoaMapper;
import br.com.system.food.repository.PessoaRepository;
import br.com.system.food.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	PessoaRepository repo;
	
	@Autowired
	PessoaMapper mapper;
	
	
	public Pessoa recuperarPorId(Long idPessoa) {
		return repo.findById(idPessoa).orElseThrow(NaoEncontradoException::new);
	}

	@Override
	public Pessoa alterarPessoa(PessoaDto pessoaDto) {
		repo.updatePessoa(mapper.pessoaUpdate(pessoaDto));
		return recuperarPorId(pessoaDto.getIdPessoa());
		
	}

	@Override
	public Pessoa salvarPessoa(PessoaDto pessoaDto) {
		return repo.save(mapper.pessoa(pessoaDto));
	}

	
}
