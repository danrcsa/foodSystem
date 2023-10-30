package br.com.system.food.service;

import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Login;
import br.com.system.food.dto.ClienteDto;
import br.com.system.food.dto.LoginDto;

public interface ClienteService {


	Cliente criarCliente(ClienteDto clienteDto);

	Cliente atualizarCliente(ClienteDto clienteDto);

	Cliente recuperarClinte(Long idCliente);

	Login login(LoginDto login);

}
