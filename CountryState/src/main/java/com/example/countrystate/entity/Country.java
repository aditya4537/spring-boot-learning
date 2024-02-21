package com.example.countrystate.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private int countryId;
	
	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "country_continent")
	private String countryContinent;
	
	@Column(name = "country_population")
	private String countryPopulation;
	
	@OneToMany(targetEntity = State.class)
	private List<State> countryState;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryContinent() {
		return countryContinent;
	}

	public void setCountryContinent(String countryContinent) {
		this.countryContinent = countryContinent;
	}

	public String getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(String countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	public List<State> getCountryState() {
		return countryState;
	}

	public void setCountryState(List<State> countryState) {
		this.countryState = countryState;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryContinent="
				+ countryContinent + ", countryPopulation=" + countryPopulation + ", countryState=" + countryState
				+ "]";
	}
	
	
}
