package com.demo.response;

public class CountryResponse {
	
	String name ;
	
	String continent;
	
	Integer population ;
	
	Float lifeexpectancy ;
	
	String country_language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Float getLifeexpectancy() {
		return lifeexpectancy;
	}

	public void setLifeexpectancy(Float lifeexpectancy) {
		this.lifeexpectancy = lifeexpectancy;
	}

	public String getCountry_language() {
		return country_language;
	}

	public void setCountry_language(String country_language) {
		this.country_language = country_language;
	}

	public CountryResponse(String name, String continent, Integer population, Float lifeexpectancy,
			String country_language) {
		this.name = name;
		this.continent = continent;
		this.population = population;
		this.lifeexpectancy = lifeexpectancy;
		this.country_language = country_language;
	}
	
	
}
