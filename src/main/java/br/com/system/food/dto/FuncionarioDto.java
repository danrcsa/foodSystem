package br.com.system.food.dto;

import br.com.system.food.domain.enumerator.SetorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDto {
	private Long idFuncionario;
	private Long idPessoa;
	private int idSetorEnum;
	private Boolean inMovimentaPedido;
	private PessoaDto pessoaDto;
	private SetorEnum setorEnum;
	private String nmSenha;

}
