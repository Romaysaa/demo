package com.demo.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.error.APIError;
import com.demo.error.Errors;
import com.demo.response.CountryResponse;
import com.demo.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public ResponseEntity<?> findCountryInfo(@PathVariable String code) {
		try {
			CountryResponse country = countryService.findCountryByCode(code);
			return ResponseEntity.status(HttpStatus.OK).body(country);
		} catch (NoSuchElementException e) {
			APIError error = new APIError(Errors.INVALID_COUNTRY_CODE.getCode(),
					Errors.INVALID_COUNTRY_CODE.getMessage(), e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);

		} catch (Exception e) {
			APIError error = new APIError(Errors.INTERNAL_ERROR.getCode(), Errors.INTERNAL_ERROR.getMessage(),
					e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);

		}
	}

}
