package com.example.demo;

import java.awt.PageAttributes.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.security.servlet.SecurityRequestMatchersManagementContextConfiguration.MvcRequestMatcherConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=DemoApplicationTests.class)

@WebMvcTest
public class DemoApplicationTests {
	
	@Autowired
    private MockMvc mvc;
 
 
	
	@Test
	public void contextLoads() throws Exception {
		MvcResult myResult= mvc.perform(MockMvcRequestBuilders.get("/v").accept(org.springframework.http.MediaType.APPLICATION_JSON)).andReturn();
			System.out.print(myResult.getResponse());
	}
		 
	}


