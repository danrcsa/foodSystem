package br.com.system.food.domain.pedido;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.system.food.domain.enumerator.StatusPedidoEnum;
import br.com.system.food.domain.pessoa.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pedido")
@Table(name="PEDIDO")
public class Pedido implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6829760369416857666L;
	@Id
	@Column(name = "id_pedido")
	@GeneratedValue
	private Long idPedido;
	@OneToOne
	@JoinColumn(name = "id_cliente")
	@JsonSerialize
	private Cliente cliente;
	@Column(name = "bd_valor_pedido")
	@NotNull
	private BigDecimal bdValorPedido;
	@Column(name="id_status_pedido")
	private int idStatusPedido;
	@Column(name ="nm_anotacao_pedido")
	private String nmAnotacaoPedido;
	
	@Transient
	private StatusPedidoEnum statusPedidoEnum;
	@Transient
	private List<PedidoProduto> lsPedidoProduto;

	
}

