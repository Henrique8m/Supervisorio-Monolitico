package com.hrodriguesdev.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_grafico")
public class Grafico implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer date;
	private Integer time;
	private Double pressao;
	private Double vazao;
	
	public Grafico(Integer date, Integer time, Double pressao, Double vazao) {
		super();
		this.date = date;
		this.time = time;
		this.pressao = pressao;
		this.vazao = vazao;
	}	
	
	public Grafico() {}
	
	public Integer getDate() {
		return date;
	}
	public void setDate(Integer date) {
		this.date = date;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Double getPressao() {
		return pressao;
	}
	public void setPressao(Double pressao) {
		this.pressao = pressao;
	}
	public Double getVazao() {
		return vazao;
	}
	public void setVazao(Double vazao) {
		this.vazao = vazao;
	}
	public Long getId() {
		return id;
	}
	
}
