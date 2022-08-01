package com.hrodriguesdev.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_balancas")
public class Balancas implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String date;	
	private String time;
	
	private Double balanca01;
	private Double balanca02;
	private Double balanca03;
	private Double balanca04;
	private Double balanca05;
	private Double balanca06;
	private Double balanca07;
	private Double balanca08;
	private Double balanca09;
	private Double balanca10;
	
	public Balancas(String date, String time, Double balanca01, Double balanca02, Double balanca03, Double balanca04,
			Double balanca05, Double balanca06, Double balanca07, Double balanca08, Double balanca09,
			Double balanca10) {
		super();
		this.date = date;
		this.time = time;
		this.balanca01 = balanca01;
		this.balanca02 = balanca02;
		this.balanca03 = balanca03;
		this.balanca04 = balanca04;
		this.balanca05 = balanca05;
		this.balanca06 = balanca06;
		this.balanca07 = balanca07;
		this.balanca08 = balanca08;
		this.balanca09 = balanca09;
		this.balanca10 = balanca10;
	}

	public Balancas() {}	
	
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
	public Double getBalanca01() {
		return balanca01;
	}
	public void setBalanca01(Double balanca01) {
		this.balanca01 = balanca01;
	}
	public Double getBalanca02() {
		return balanca02;
	}
	public void setBalanca02(Double balanca02) {
		this.balanca02 = balanca02;
	}
	public Double getBalanca03() {
		return balanca03;
	}
	public void setBalanca03(Double balanca03) {
		this.balanca03 = balanca03;
	}
	public Double getBalanca04() {
		return balanca04;
	}
	public void setBalanca04(Double balanca04) {
		this.balanca04 = balanca04;
	}
	public Double getBalanca05() {
		return balanca05;
	}
	public void setBalanca05(Double balanca05) {
		this.balanca05 = balanca05;
	}
	public Double getBalanca06() {
		return balanca06;
	}
	public void setBalanca06(Double balanca06) {
		this.balanca06 = balanca06;
	}
	public Double getBalanca07() {
		return balanca07;
	}
	public void setBalanca07(Double balanca07) {
		this.balanca07 = balanca07;
	}
	public Double getBalanca08() {
		return balanca08;
	}
	public void setBalanca08(Double balanca08) {
		this.balanca08 = balanca08;
	}
	public Double getBalanca09() {
		return balanca09;
	}
	public void setBalanca09(Double balanca09) {
		this.balanca09 = balanca09;
	}
	public Double getBalanca10() {
		return balanca10;
	}
	public void setBalanca10(Double balanca10) {
		this.balanca10 = balanca10;
	}
	public Long getId() {
		return id;
	}

}
