package br.com.system.food.service;

import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Login;
import br.com.system.food.dto.ClienteDto;
import br.com.system.food.dto.LoginDto;


public interface LoginService {

	boolean gravarLogin(LoginDto dto);

	void gravarLogin(Cliente cliente, ClienteDto clienteDto);
	
	Login logar(String nmEmail, String nmSenha );

}
