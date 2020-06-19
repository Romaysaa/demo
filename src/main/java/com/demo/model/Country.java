package com.demo.model;


import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@JsonView
@Table(name = "country")
public class Country implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	String name ;
	
	@Column(name = "continent")
	String continent ;
	
	@Column(name = "region")
	String region ;
	
	@Column(name = "surface_area ")
	Float surfacearea ;
	
	@Column(name = "indep_year")
	Integer indepyear ;
	
	@Column(name = "population")
	Integer population ;
	
	@Column(name = "life_expectancy")
	Float lifeexpectancy;
	
	@Column(name = "gnp")
	Long gnp ;
	
	@Column(name = "gnp_old")
	Long gnpold ;
	
	@Column(name = "local_name")
	String localname ;
	
	@Column(name = "government_form")
	String governmentform ;
	
	@Column(name = "head_of_state")
	String headofstate ;
	
	@Column(name = "capital")
	Integer capital;

	@Id
	@Column(name = "code")
	String code ;
	
	@Column(name = "code2")
	String code2 ;

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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Float getSurfacearea() {
		return surfacearea;
	}

	public void setSurfacearea(Float surfacearea) {
		this.surfacearea = surfacearea;
	}

	public Integer getIndepyear() {
		return indepyear;
	}

	public void setIndepyear(Integer indepyear) {
		this.indepyear = indepyear;
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

	public Long getGnp() {
		return gnp;
	}

	public void setGnp(Long gnp) {
		this.gnp = gnp;
	}

	public Long getGnpold() {
		return gnpold;
	}

	public void setGnpold(Long gnpold) {
		this.gnpold = gnpold;
	}

	public String getLocalname() {
		return localname;
	}

	public void setLocalname(String localname) {
		this.localname = localname;
	}

	public String getGovernmentform() {
		return governmentform;
	}

	public void setGovernmentform(String governmentform) {
		this.governmentform = governmentform;
	}

	public String getHeadofstate() {
		return headofstate;
	}

	public void setHeadofstate(String headofstate) {
		this.headofstate = headofstate;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	@Transient
	String country_language;

	public String getCountry_language() {
		return country_language;
	}

	public void setCountry_language(String country_language) {
		this.country_language = country_language;
	}
	

	

}
