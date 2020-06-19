package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.City;


@Repository
public interface CityRepository extends CrudRepository<City, Integer> {
	
}
