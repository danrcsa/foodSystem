package br.com.system.food.mapper;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Login;
import br.com.system.food.dto.ClienteDto;
import br.com.system.food.dto.LoginDto;

@Component
public class LoginMapper {

	public Login mapper(LoginDto dto) {
		Login entidade = new Login();
		entidade.setInAtivo(true);
		entidade.setInUsuario(dto.isInUsuario());
		entidade.setNmEmail(dto.getNmEmail());
		entidade.setNmSenha(dto.getNmSenha());
		entidade.setIdLogin(dto.getIdLogin());
		entidade.setNmValidador(dto.getNmValidador());
		return entidade;
	}

	public LoginDto mapper(Cliente cliente, ClienteDto dto) {
		LoginDto loginDto = new LoginDto();
		loginDto.setInAtivo(true);
		loginDto.setInUsuario(true);
		loginDto.setNmEmail(cliente.getPessoa().getNmEmail());
		loginDto.setNmSenha(dto.getNmSenha());
		return loginDto;
	}

}
