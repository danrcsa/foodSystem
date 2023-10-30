package br.com.system.food.domain.enumerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.SQLInsert;

import lombok.Getter;

@Getter
@Entity
@Table(name="status_pedido")
@SQLInsert(sql ="status_pedido.sql")
public enum StatusPedidoEnum {
	
	PEDIDO(1, "Pedido"),
	AGUARDANDO_PREPARACAO(2, "Aguardando preparação"),
	PREPARANDO(3, "Preparando"),
	FINALIZADO(4, "Finalizado"),
	ENTREGUE(5, "Entregue");
	
	@Column(name="id_status_pedido")
	@Id
	private int codigo;
	@Column(name="nm_status_pedido")
	@NotEmpty
	private String nome;
	
	private StatusPedidoEnum(final int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public static boolean getById(int id) {
	    for(StatusPedidoEnum e : values()) {
	        if(e.codigo == id)
	        	return true;
	    }
	    return false;
	}
	
	public static StatusPedidoEnum getByIdPedidoEnum(int id) {
	    for(StatusPedidoEnum e : values()) {
	        if(e.codigo == id)
	        	return e;
	    }
	    return null;
	}

}
