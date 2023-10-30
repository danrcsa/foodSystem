package br.com.system.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {
	
	private Long idPessoa;
	private String nmPessoa;
	private String nrCpf;
	private String dtNascimento;
	private String nmEmail;
	private String nmTelefone;
	private Boolean inAtivo;
}