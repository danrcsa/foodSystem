package br.com.system.food.domain.produto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;

import br.com.system.food.domain.enumerator.CategoriaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="produto")
@Table(name ="PRODUTO")
public class Produto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6567431104580492469L;
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Id
	@Column(name="id_produto")
	private Long idProduto;
	@NotNull
	@Column(name = "nm_produto")
	private String nmProduto;
	@NotNull
	@Column(name = "nm_descricao_produto")	
	private String nmDescricaoProduto;
	@NotNull
	@Column(name = "id_categoria")	
	private int idCategoria;
	@NotNull
	@Column(name="db_valor")
	private BigDecimal bdValor;
	@Column(name="in_ativo")
	@ColumnDefault(value = "true")
	@NotNull
	private Boolean inAtivo;
	
	@Transient
	private CategoriaEnum categoriaEnum;

}
