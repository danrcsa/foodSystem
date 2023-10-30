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
@Table(name="categoria")
@SQLInsert(sql ="categoria.sql")
public enum CategoriaEnum {
	LANCHE(1, "Lanche"),
	BEBIDA(2, "Bebida"),
	ACOMPANHAMENTO(3, "Acompanhamento"),
	SOBREMESA(4, "Sobremesa");
	
	@Column(name="id_categoria")
	@Id
	private int codigo;
	@Column(name="nm_categoria")
	@NotEmpty
	private String nome;
	
	private CategoriaEnum(final int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public static CategoriaEnum getById(int id) {
	    for(CategoriaEnum e : values()) {
	        if(e.codigo == id) return e;
	    }
	    return null;
	}
}
