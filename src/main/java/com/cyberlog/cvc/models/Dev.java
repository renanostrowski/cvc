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

	public Dev() {}
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dev_devoid")
	@SequenceGenerator(name = "dev_devoid", sequenceName = "dev_id")
	@Column(name = "devoid")
	private Integer devoid;
	
	@NotNull
	@Column(name = "nome", length = 50)
	private String nome;
	
	@Column(name = "usuario", length = 20)
	private String usuario;
	
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
	public String getusuario() {
		return usuario;
	}
	public void setusuario(String usuario) {
		this.usuario = usuario;
	}
}
