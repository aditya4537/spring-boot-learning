package com.example.demo.model;

public class PhoneData {
	private String name;
	private String company;
	private int cameraMegaPixel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getCameraMegaPixel() {
		return cameraMegaPixel;
	}
	public void setCameraMegaPixel(int cameraMegaPixel) {
		this.cameraMegaPixel = cameraMegaPixel;
	}
	
	@Override
	public String toString() {
		return "\nPhonedata\nname=" + name + ", company=" + company + ", cameraMegaPixel=" + cameraMegaPixel + "]";
	}
}
