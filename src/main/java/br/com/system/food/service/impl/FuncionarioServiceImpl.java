package br.com.system.food.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.food.configuration.NaoEncontradoException;
import br.com.system.food.domain.enumerator.SetorEnum;
import br.com.system.food.domain.pessoa.Funcionario;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.FuncionarioDto;
import br.com.system.food.mapper.FuncionarioMapper;
import br.com.system.food.repository.FuncionarioRepository;
import br.com.system.food.service.FuncionarioService;
import br.com.system.food.service.PessoaService;

@Service
@Transactional(rollbackOn = Exception.class)
public class FuncionarioServiceImpl implements FuncionarioService {
	@Autowired
	private FuncionarioRepository repo;
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private FuncionarioMapper mapper;

	@Override
	public Funcionario recuperarFuncionario(Long idFuncionario) {
		try {
			Funcionario funcionario = repo.findById(idFuncionario).orElseThrow(NaoEncontradoException::new);
			funcionario.setSetorEnum(SetorEnum.getById(funcionario.getIdSetorEnum()));
			return funcionario;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Funcionario criarFuncionario(FuncionarioDto funcionarioDto) {
		return repo.save(mapper.funcionario(funcionarioDto, 
				pessoaService.salvarPessoa(funcionarioDto.getPessoaDto())));
	}

	@Override
	public Funcionario atualizarFuncionario(FuncionarioDto funcionarioDto) {
		Funcionario funcionario = repo.findById(funcionarioDto.getIdFuncionario()).orElseThrow(NaoEncontradoException::new);
		funcionarioDto.getPessoaDto().setIdPessoa(funcionario.getPessoa().getIdPessoa());
		Pessoa pessoa = pessoaService.alterarPessoa(funcionarioDto.getPessoaDto());
		funcionario.setPessoa(pessoa);
		return repo.save(mapper.funcionarioUpdate(funcionarioDto, pessoa));
	}

	@Override
	public Pessoa recuperarPessoa(Integer idPessoa, String nmCpf) {
			return pessoaService.recuperarPorId(idPessoa.longValue());
	}

}
