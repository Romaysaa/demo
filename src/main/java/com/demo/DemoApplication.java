package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.model.City;
//import com.demo.model.Country;
//import com.demo.model.CountryLanguage;
//import com.demo.repository.CityRepository;
//import com.demo.repository.CountryLangRepository;
//import com.demo.repository.CountryRepository;
//
//@SpringBootApplication
//@RestController
//public class DemoApplication {
//	
//	@Autowired
//	private CityRepository cityrepo;
//	@Autowired
//	private CountryRepository countryrepo;
//	@Autowired
//	private CountryLangRepository countryLangRepository;
////	
//
//	@GetMapping("/2")
//	public List<City> home2() {
//		
//		return (List<City>) cityrepo.findAll();
//	}
//	
//	@GetMapping("/1")
//   public List<Country> home1() {
//		return (List<Country>) countryrepo.findAll();
//		
//	}
//
//	@GetMapping("/")
//	   public Country home() {
//		
//		Country c = countryrepo.findById("BHR").get();
//				
//				c.setCountry_language(countryLangRepository.findByCountryCode("BHR").get(0).getLanguage());
//		return c;
//		}
//	
//	@GetMapping("/3")
//  public Iterable<CountryLanguage> home3() {
//		
//		return countryLangRepository.findAll();
//	}
//	
//	
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//	

}
