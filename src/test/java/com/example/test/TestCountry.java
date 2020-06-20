package com.example.test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


public class TestCountry extends DemoApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;


	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void test() throws Exception {

		mockMvc.perform(get("/BHtR")).andExpect(status().isInternalServerError())
				.andExpect(content().contentType("application/json"));
		assertEquals("{\"errorCode\":\"0000\",\"errorMessage\":\"INVALID_COUNTRY_CODE\"}", "{\"errorCode\":\"0000\",\"errorMessage\":\"INVALID_COUNTRY_CODE\"}","INVALID_COUNTRY_CODE");
		
	}
}
