package com.hrodriguesdev.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pirometria")
public class Pyrometry implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String time;
	private String pcoroa;
	private String ptopo;
	private String tcoroa;
	private String ttopo;
	private String vazao;
	private String secador;

	public Pyrometry(String time, String pcoroa, String ptopo, String tcoroa, String ttopo, String vazao,
			String secador) {
		this.time = time;
		this.pcoroa = pcoroa;
		this.ptopo = ptopo;
		this.tcoroa = tcoroa;
		this.ttopo = ttopo;
		this.vazao = vazao;
		this.secador = secador;
	}

	public Pyrometry() {}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPcoroa() {
		return pcoroa;
	}

	public void setPcoroa(String pcoroa) {
		this.pcoroa = pcoroa;
	}

	public String getPtopo() {
		return ptopo;
	}

	public void setPtopo(String ptopo) {
		this.ptopo = ptopo;
	}

	public String getTcoroa() {
		return tcoroa;
	}

	public void setTcoroa(String tcoroa) {
		this.tcoroa = tcoroa;
	}

	public String getTtopo() {
		return ttopo;
	}

	public void setTtopo(String ttopo) {
		this.ttopo = ttopo;
	}

	public String getVazao() {
		return vazao;
	}

	public void setVazao(String vazao) {
		this.vazao = vazao;
	}

	public String getSecador() {
		return secador;
	}

	public void setSecador(String secador) {
		this.secador = secador;
	}

	public Long getId() {
		return id;
	}

}

