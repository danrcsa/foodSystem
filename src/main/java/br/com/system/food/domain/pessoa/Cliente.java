package br.com.system.food.domain.pessoa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2412596618749829078L;
	@Id
	@GeneratedValue
	@Column(name="id_cliente")
	private Long idCliente;
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	@NotNull
	private Pessoa pessoa;	
	@NotNull
	@Column(name="in_recebe_notificacao")
	private Boolean inRecebeNotificacao;

	@Transient
	private Long idPessoa;

	
}
