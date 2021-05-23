package com.cyberlog.cvc.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "script")
public class Script implements Serializable {
	
	public void Script() {
		
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "script_scriptoid")
	@SequenceGenerator(name = "script_scriptoid", sequenceName = "script_id")
	@Column(name = "scriptoid")
	private Integer scriptoid;
	
	@NotNull
	@JoinColumn(name = "versaooid", referencedColumnName = "versaooid")
	@ManyToOne(fetch = FetchType.LAZY)
	private Versao versao;
	
	@NotNull
	@JoinColumn(name = "tiposcriptoid", referencedColumnName = "tiposcriptoid")
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoScript tiposcript;
	
	@NotNull
	@Column(name = "descricao", length = 100)
	private String descricao;
	
	@NotNull
	@Column(name = "codigo")
	private byte[] codigo;
	
	@NotNull
	@Column(name = "oldcodigo")
	private byte[] oldcodigo;
	
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

	public Versao getVersao() {
		return versao;
	}

	public void setVersao(Versao versao) {
		this.versao = versao;
	}

	public TipoScript getTiposcript() {
		return tiposcript;
	}

	public void setTiposcript(TipoScript tiposcript) {
		this.tiposcript = tiposcript;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getCodigo() {
		return codigo;
	}

	public void setCodigo(byte[] codigo) {
		this.codigo = codigo;
	}

	public byte[] getOldcodigo() {
		return oldcodigo;
	}

	public void setOldcodigo(byte[] oldcodigo) {
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
