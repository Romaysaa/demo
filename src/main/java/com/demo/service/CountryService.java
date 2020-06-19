package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Country;
import com.demo.repository.CountryLangRepository;
import com.demo.repository.CountryRepository;
import com.demo.response.CountryResponse;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryrepo;
	@Autowired
	private CountryLangRepository countryLangRepository;

	public CountryResponse findCountryByCode(String code) {

		Country c = countryrepo.findById(code).get();
		c.setCountry_language(countryLangRepository.findByCountryCode(code).get(0).getLanguage());
		CountryResponse countryResponse = new CountryResponse(c.getName(), c.getContinent(), c.getPopulation(),
				c.getLifeexpectancy(), c.getCountry_language());

		return countryResponse;

	}

}
