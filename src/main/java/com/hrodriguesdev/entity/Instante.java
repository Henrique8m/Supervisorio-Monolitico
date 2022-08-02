package com.hrodriguesdev.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_instante")
public class Instante implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double pcoroa;
	private Double ptopo;
	private Double vazao;
	private int tcoroa;	
	private int ttopo;	
	private int secador;
	
	public Instante(Double pcoroa, Double ptopo, Double vazao, int tcoroa, int ttopo, int secador) {
		super();
		this.pcoroa = pcoroa;
		this.ptopo = ptopo;
		this.vazao = vazao;
		this.tcoroa = tcoroa;
		this.ttopo = ttopo;
		this.secador = secador;
	}

	public Instante() {}
	
	public Double getPcoroa() {
		return pcoroa;
	}

	public void setPcoroa(Double pcoroa) {
		this.pcoroa = pcoroa;
	}

	public Double getPtopo() {
		return ptopo;
	}

	public void setPtopo(Double ptopo) {
		this.ptopo = ptopo;
	}

	public Double getVazao() {
		return vazao;
	}

	public void setVazao(Double vazao) {
		this.vazao = vazao;
	}

	public int getTcoroa() {
		return tcoroa;
	}

	public void setTcoroa(int tcoroa) {
		this.tcoroa = tcoroa;
	}

	public int getTtopo() {
		return ttopo;
	}

	public void setTtopo(int ttopo) {
		this.ttopo = ttopo;
	}

	public int getSecador() {
		return secador;
	}

	public void setSecador(int secador) {
		this.secador = secador;
	}

	public Long getId() {
		return id;
	}

}

