package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.CountryLanguage;

@Repository
public interface CountryLangRepository extends CrudRepository<CountryLanguage, String>  {
	
	public List<CountryLanguage> findByCountryCode(String countryCode);

}
