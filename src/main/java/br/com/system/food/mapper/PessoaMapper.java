package br.com.system.food.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import br.com.system.food.domain.pessoa.Pessoa;
import br.com.system.food.dto.PessoaDto;

@Component
public class PessoaMapper {

	public Pessoa pessoa(PessoaDto dto) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNmEmail(dto.getNmEmail());
		pessoa.setIdPessoa(dto.getIdPessoa());
		pessoa.setNmPessoa(dto.getNmPessoa());
		pessoa.setNmTelefone(dto.getNmTelefone());
		pessoa.setNrCpf(dto.getNrCpf());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		pessoa.setDtNascimento(LocalDate.parse(dto.getDtNascimento(), formatter));
		pessoa.setInAtivo(dto.getInAtivo());
		return pessoa;
	}
	
	public PessoaDto pessoa(Pessoa entidade) {
		PessoaDto dto = new PessoaDto();
		dto.setIdPessoa(entidade.getIdPessoa());
		dto.setNmEmail(entidade.getNmEmail());
		dto.setIdPessoa(entidade.getIdPessoa());
		dto.setNmPessoa(entidade.getNmPessoa());
		dto.setNmTelefone(entidade.getNmTelefone());
		dto.setNrCpf(entidade.getNrCpf());
		dto.setDtNascimento(entidade.getDtNascimento().toString());
		return dto;
	}
	
	public Pessoa pessoaUpdate(PessoaDto dto) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNmEmail(dto.getNmEmail());
		pessoa.setIdPessoa(dto.getIdPessoa());
		pessoa.setNmTelefone(dto.getNmTelefone());
		pessoa.setInAtivo(dto.getInAtivo());
		pessoa.setIdPessoa(dto.getIdPessoa());
		return pessoa;
	}


}
