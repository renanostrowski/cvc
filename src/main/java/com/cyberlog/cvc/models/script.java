package com.cyberlog.cvc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "script")
public class script implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "scriptoid")
	private Integer scriptoid;
	
	@NotNull
	@Column(name = "versaooid")
	private Integer versaooid;
	
	@NotNull
	@Column(name = "tiposcripoid")
	private Integer tiposcriptoid;
	
	@NotNull
	@Column(name = "descricao", length = 100)
	private String descricao;
	
	@NotNull
	@Column(name = "codigo")
	private String codigo;
	
	@NotNull
	@Column(name = "oldcodigo")
	private String oldcodigo;
	
	@NotNull
	@Column(name = "skip", length = 1)
	private String skip;
	
	@NotNull
	@Column(name = "banco", length = 15)
	private String banco;
	
	@NotNull
	@Column(name = "ordem")
	private Integer ordem;

	public Integer getScriptoid() {
		return scriptoid;
	}

	public void setScriptoid(Integer scriptoid) {
		this.scriptoid = scriptoid;
	}

	public Integer getVersaooid() {
		return versaooid;
	}

	public void setVersaooid(Integer versaooid) {
		this.versaooid = versaooid;
	}

	public Integer getTiposcriptoid() {
		return tiposcriptoid;
	}

	public void setTiposcriptoid(Integer tiposcriptoid) {
		this.tiposcriptoid = tiposcriptoid;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getOldcodigo() {
		return oldcodigo;
	}

	public void setOldcodigo(String oldcodigo) {
		this.oldcodigo = oldcodigo;
	}

	public String getSkip() {
		return skip;
	}

	public void setSkip(String skip) {
		this.skip = skip;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	
	
}
