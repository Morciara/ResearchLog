package com.genealogy.researchlog;

import com.genealogy.researchlog.controller.MainController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class MainControllerTest {

	private MockMvc mockMvc;

	private MainController mainController;

	@BeforeEach
	public void setup(){
		mainController = new MainController();
		mockMvc = MockMvcBuilders.standaloneSetup(mainController).build();
	}

	@Test
	public void testIndex() throws Exception{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("home"));
	}
}