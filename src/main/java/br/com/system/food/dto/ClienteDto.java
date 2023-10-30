package br.com.system.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
	private Long idCliente;
	private Long idPessoa;
	private Boolean inRecebeNotificacao;
	private PessoaDto pessoaDto;
	private String nmSenha;

}
