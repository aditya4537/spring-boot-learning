package com.example.cars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class CarsData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numberPlate")
	private int num;
	
	@Column(name="carModel")
	private String model;
	
	@Column(name="company")
	private String company;
	
	@Column(name="type")
	private String type;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarsData [num=" + num + ", model=" + model + ", company=" + company + ", type=" + type + "]";
	}
	
	
}
