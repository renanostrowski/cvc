package com.cyberlog.cvc.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table( name = "versao")
public class Versao implements Serializable{
	public void Versao() {
		
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "versao_versaooid")
	@SequenceGenerator(name = "versao_versaooid", sequenceName = "versao_id")
	private Integer versaooid;
	
	@NotNull
	@Column(name = "major")
	private Integer major;
	
	@NotNull
	@Column(name = "minor")
	private Integer minor;
	
	@NotNull
	@Column(name = "banco")
	private Integer banco;
	
	@NotNull
	@Column(name = "data")
	private Timestamp data;
	
	@NotNull
	@Column(name = "desenvolvimento", length = 1)
	private String desenvolvimento;
	
	@NotNull
	@Column(name = "producao", length = 1)
	private String producao;
	
	@NotNull
	@Column(name = "habilitada", length = 1)
	private String habilitada;

	public Integer getVersaooid() {
		return versaooid;
	}

	public void setVersaooid(Integer versaooid) {
		this.versaooid = versaooid;
	}

	public Integer getMajor() {
		return major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getMinor() {
		return minor;
	}

	public void setMinor(Integer minor) {
		this.minor = minor;
	}

	public Integer getBanco() {
		return banco;
	}

	public void setBanco(Integer banco) {
		this.banco = banco;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getDesenvolvimento() {
		return desenvolvimento;
	}

	public void setDesenvolvimento(String desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}

	public String getProducao() {
		return producao;
	}

	public void setProducao(String producao) {
		this.producao = producao;
	}

	public String getHabilitada() {
		return habilitada;
	}

	public void setHabilitada(String habilitada) {
		this.habilitada = habilitada;
	}
		
}
