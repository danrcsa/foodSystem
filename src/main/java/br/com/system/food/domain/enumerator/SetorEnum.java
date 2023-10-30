package br.com.system.food.domain.enumerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLInsert;

import br.com.system.food.configuration.NaoEncontradoException;
import lombok.Getter;

@Getter
@Entity
@Table(name="setor")
@SQLInsert(sql ="setor.sql")
public enum SetorEnum {
	
	COZINHA(1, "Cozinha"),
	RECEPCAO(2, "Recepcao"),
	ENTREGA(3, "Entrega"),
	GERENCIA(4, "Gerencia");
	

	@Column(name="id_setor")
	@Id
	private int codigo;
	@Column(name="nm_setor")
	private String nome;
	
	private SetorEnum(final int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public static SetorEnum getById(int id) {
	    for(SetorEnum e : values()) {
	        if(e.codigo == id) return e;
	    }
	    throw new NaoEncontradoException("Não encontrado valor condizente com o enum de setor");
	}


}
