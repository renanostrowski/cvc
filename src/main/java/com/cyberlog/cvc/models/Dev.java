package com.cyberlog.cvc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table( name = "Dev")
public class Dev implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "devoid")
	private Integer devoid;
	
	@NotNull
	@Column(name = "nome", length = 50)
	private String nome;
	
	@Column(name = "id", length = 20)
	private String id;
	
	@NotNull
	@Column(name = "senha", length = 20)
	private String senha;
	
	@Column(name = "habilitado", length = 1)
	private String habilitado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	public Integer getDevoid() {
		return devoid;
	}
	public void setDevoid(Integer devoid) {
		this.devoid = devoid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
