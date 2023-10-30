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

import br.com.system.food.domain.enumerator.SetorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="funcionario")
@Table(name="FUNCIONARIO")
public class Funcionario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9212248770701036925L;
	@Id
	@GeneratedValue
	@Column(name="id_funcionario")
	private Long idFuncionario;
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	@NotNull
	private Pessoa pessoa;
	@NotNull
	@Column(name="id_setor_enum")
	private int idSetorEnum;
	@NotNull
	@Column(name="in_movimenta_pedido")
	private Boolean inMovimentaPedido;
	
	@Transient
	private Long idPessoa;
	@Transient
	private SetorEnum setorEnum;
}
