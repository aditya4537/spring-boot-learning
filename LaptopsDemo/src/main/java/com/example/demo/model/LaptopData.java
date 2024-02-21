package com.example.demo.model;

public class LaptopData {
	private String name;
	private String Company;
	private int modelYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	@Override
	public String toString() {
		return "LaptopData [name=" + name + ", Company=" + Company + ", modelYear=" + modelYear + "]";
	}
}
