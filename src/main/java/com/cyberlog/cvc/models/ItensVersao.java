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
@Table(name = "itensversao")
public class ItensVersao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itensversao_itensversaooid")
	@SequenceGenerator(name = "itensversao_itensversaooid", sequenceName = "itensversao_id")
	private Integer itensversaooid;
	
	@NotNull
	private Integer devoid;
	
	@NotNull
	@Column(name = "ticketoid", length = 50)
	private String ticketoid;
	
	@NotNull
	@Column(name = "projectoid", length = 50)
	private String projectoid;
	
	@NotNull
	@Column(name = "modulo", length = 30)
	private String modulo;
	
	@NotNull
	@Column(name = "aplicacao", length = 30)
	private String aplicacao;
	
	@NotNull
	@Column(name = "release")
	private Integer release;
	
	@Column(name = "descricao", length = 1000)
	private String descricacao;
	
	@Column(name = "teste", length = 1000)
	private String teste;
	
	@NotNull
	@Column(name = "data")
	private Timestamp data;

	public Integer getItensversaooid() {
		return itensversaooid;
	}

	public void setItensversaooid(Integer itensversaooid) {
		this.itensversaooid = itensversaooid;
	}

	public Integer getDevoid() {
		return devoid;
	}

	public void setDevoid(Integer devoid) {
		this.devoid = devoid;
	}

	public String getTicketoid() {
		return ticketoid;
	}

	public void setTicketoid(String ticketoid) {
		this.ticketoid = ticketoid;
	}

	public String getProjectoid() {
		return projectoid;
	}

	public void setProjectoid(String projectoid) {
		this.projectoid = projectoid;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public String getAplicacao() {
		return aplicacao;
	}

	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	public Integer getRelease() {
		return release;
	}

	public void setRelease(Integer release) {
		this.release = release;
	}

	public String getDescricacao() {
		return descricacao;
	}

	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}
	
	
	
}
