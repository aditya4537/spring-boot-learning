package com.example.demo.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mobile")
public class MobileData {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imei")
	private int imei;
	
	@Column(name="model")
	private String name;
	
	@Column(name="company")
	private String company;
	
	@Column(name="CameraMegaPixel")
	private int campix;
	
	@Column(name="ram")
	private int ram;
	
	@Column(name="rom")
	private int rom;
	
	@Column(name="processor")
	private String processor;
	
	@Column(name="display")
	private String display;

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

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

	public int getCampix() {
		return campix;
	}

	public void setCampix(int campix) {
		this.campix = campix;
	}

	@Override
	public String toString() {
		return "MobileData [imei=" + imei + ", name=" + name + ", company=" + company + ", campix=" + campix + ", ram="
				+ ram + ", rom=" + rom + ", processor=" + processor + ", display=" + display + "]";
	}
	
	
}
