package br.com.system.food.mapper;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.pessoa.Cliente;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.ClienteDto;

@Component
public class ClienteMapper {

	public Cliente cliente(ClienteDto dto, Pessoa pessoa) {
		Cliente cliente = new Cliente();
		cliente.setInRecebeNotificacao(dto.getInRecebeNotificacao());
		cliente.setIdPessoa(pessoa.getIdPessoa());
		cliente.setPessoa(pessoa);
		return cliente;
	}
	

	public ClienteDto cliente(Cliente entidade) {
		ClienteDto dto = new ClienteDto();
		dto.setInRecebeNotificacao(entidade.getInRecebeNotificacao());
		dto.setIdPessoa(entidade.getIdPessoa());
		return dto;
	}


	public Cliente clienteUpdate (ClienteDto clienteDto, Pessoa pessoa) {
		Cliente cliente = cliente(clienteDto, pessoa);
		cliente.setInRecebeNotificacao(clienteDto.getInRecebeNotificacao());
		cliente.setIdCliente(clienteDto.getIdCliente());
		return cliente;
	}

}
