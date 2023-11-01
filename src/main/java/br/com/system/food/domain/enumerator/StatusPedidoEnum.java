package br.com.system.food.domain.enumerator;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.SQLInsert;

import br.com.system.food.dto.EnumDto;
import lombok.Getter;

@Getter
@Entity
@Table(name="status_pedido")
@SQLInsert(sql ="status_pedido.sql")
public enum StatusPedidoEnum {
	
	PEDIDO_CRIADO(1, "Pedido criado"),
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

	public static List<EnumDto> returnEnumValues() {
		
		List<EnumDto> lsEnumDto = new ArrayList<>();
		for(StatusPedidoEnum e : values()) {
			lsEnumDto.add(new EnumDto(e.codigo, e.nome));
	    }
	    return lsEnumDto;
	}

}
