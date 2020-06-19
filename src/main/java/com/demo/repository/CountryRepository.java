package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {

}
