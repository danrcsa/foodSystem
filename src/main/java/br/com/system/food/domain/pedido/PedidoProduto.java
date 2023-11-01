package br.com.system.food.domain.pedido;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EnableJpaRepositories 
@Entity
@Table(name ="PEDIDO_PRODUTO")
public class PedidoProduto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8472470360647470953L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "id_pedido_produto")
	private Long idPedidoProduto;
	@Column(name = "id_pedido")
	@NotNull
	private Long idPedido;
	@Column(name = "id_produto")
	@NotNull
	private Long idProduto;
	@Column(name = "nm_anotacao_pedido")
	private String nmAnotacaoPedido;
	
}
