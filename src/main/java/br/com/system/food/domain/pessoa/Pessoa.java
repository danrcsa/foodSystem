package br.com.system.food.domain.pessoa;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pessoa")
@Table(name ="PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue
	@Column(name="id_pessoa")
	private Long idPessoa;
	@NotNull
	@Column(name= "nm_pessoa")
	private String nmPessoa;
	@NotNull
	@Column(name= "nm_cpf", unique=true)
	private String nrCpf;
	@NotNull
	@Column(name= "dt_nascimento")
	private LocalDate dtNascimento;
	@Column(name= "nm_email", unique=true)
	@NotNull
	private String nmEmail;
	@Column(name= "nm_telefone")
	private String nmTelefone;
	@NotNull
	@Column(name= "in_ativo")
	private Boolean inAtivo;
}
