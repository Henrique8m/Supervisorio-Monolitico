package com.hrodriguesdev.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carvao")
public class Carvao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double peso;
	private String date;
	private String time;
	private Double umidade;
	
	public Carvao(Double peso, String date, String time, Double umidade) {
		super();
		this.peso = peso;
		this.date = date;
		this.time = time;
		this.umidade = umidade;
	}
	
	public Carvao() {}
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Double getUmidade() {
		return umidade;
	}

	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		String print = date + "  " + time + "  " + peso;
		return print;
	}
	
}
