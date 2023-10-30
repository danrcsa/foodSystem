package br.com.system.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

	private Long idLogin;
	private String nmEmail;
	private String nmSenha;
	private String nmValidador;
	private boolean inUsuario;
	private boolean inAtivo;
}
