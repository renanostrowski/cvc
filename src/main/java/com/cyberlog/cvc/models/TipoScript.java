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
@Table(name = "tiposcript")
public class TipoScript implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tiposcript_tiposcriptoid")
	@SequenceGenerator(name = "tiposcript_tiposcriptoid", sequenceName = "tiposcript_id")
	private Integer tiposcriptoid;
	
	@NotNull
	@Column(name = "ordem")
	private Integer ordem;
	
	@NotNull
	@Column(name = "descricao", length = 50)
	private String descricao;

	public Integer getTiposcriptoid() {
		return tiposcriptoid;
	}

	public void setTiposcriptoid(Integer tiposcriptoid) {
		this.tiposcriptoid = tiposcriptoid;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
