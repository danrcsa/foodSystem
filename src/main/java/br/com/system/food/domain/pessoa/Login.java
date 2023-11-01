package br.com.system.food.domain.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="LOGIN")
public class Login {
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name ="id_login")
	@Id
	private Long idLogin;
	@Column(name ="nm_email")
	private String nmEmail;
	@Column(name ="nm_senha")
	private String nmSenha;
	@Column(name ="nm_validador")
	private String nmValidador;
	@Column(name ="in_usuario")
	private boolean inUsuario;
	@Column(name ="in_ativo")
	private boolean inAtivo;
}
