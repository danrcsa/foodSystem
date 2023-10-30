package br.com.system.food.mapper;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.enumerator.SetorEnum;
import br.com.system.food.domain.pessoa.Funcionario;
import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.FuncionarioDto;

@Component
public class FuncionarioMapper {


	public Funcionario funcionario(FuncionarioDto dto) {
		Funcionario funcionario = new Funcionario();
		funcionario.setIdFuncionario(dto.getIdFuncionario());
		funcionario.setIdPessoa(dto.getIdPessoa());
		funcionario.setInMovimentaPedido(dto.getInMovimentaPedido());
		funcionario.setIdSetorEnum(dto.getIdSetorEnum());
		return funcionario;
	}
	
	public Funcionario funcionario(FuncionarioDto funcionarioDto, Pessoa pessoa) {
		Funcionario funcionario = funcionario(funcionarioDto);
		funcionario.setPessoa(pessoa);
		funcionario.setIdPessoa(pessoa.getIdPessoa());
		return funcionario;
	}
	

	public Funcionario funcionarioUpdate(FuncionarioDto funcionarioDto, Pessoa pessoa) {
		Funcionario funcionario = funcionario(funcionarioDto, pessoa);
		funcionario.setIdSetorEnum(funcionarioDto.getIdSetorEnum());
		funcionario.setIdFuncionario(funcionarioDto.getIdFuncionario());
		funcionario.setInMovimentaPedido(funcionarioDto.getInMovimentaPedido());
		return funcionario;
	}

	
}
