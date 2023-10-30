package br.com.system.food.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.system.food.configuration.NaoEncontradoException;
import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Login;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.ClienteDto;
import br.com.system.food.dto.LoginDto;
import br.com.system.food.mapper.ClienteMapper;
import br.com.system.food.repository.ClienteRepository;
import br.com.system.food.service.ClienteService;
import br.com.system.food.service.PessoaService;
@Service
@Transactional(rollbackOn = Exception.class)
public class ClienteSerciveImpl implements ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	@Autowired
	private PessoaService pessoaService;

	@Autowired
	private ClienteMapper mapper;

	@Override
	public Cliente criarCliente(ClienteDto clienteDto) {
		return repo.save(mapper.cliente(
				clienteDto, pessoaService.salvarPessoa(
						clienteDto.getPessoaDto())
						)
				);
	}

	@Override
	public Cliente atualizarCliente(ClienteDto clienteDto) {
		Cliente cliente = repo.findById(clienteDto.getIdCliente()).orElseThrow(NaoEncontradoException::new);
		clienteDto.setIdPessoa(cliente.getPessoa().getIdPessoa());
		Pessoa pessoa = pessoaService.alterarPessoa(clienteDto.getPessoaDto());
		cliente.setPessoa(pessoa);
		return repo.save(mapper.clienteUpdate(clienteDto, pessoa));
	}

	@Override
	public Cliente recuperarClinte(Long idCliente) {
		return repo.findById(idCliente).orElseThrow(NaoEncontradoException::new);
	
	}
	
	@Override
	public Login login(LoginDto login) {
		//return loginService.logar(login.getNmEmail(), login.getNmSenha());
		return null;
	}

}
