package com.dbt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbt.dao.SchemeDAO;
import com.dbt.dto.SchemeDTO;





@RestController
public class DBTController {
	
	@Autowired
	SchemeDAO schemeDAO;

	@GetMapping(path="/", produces="application/json")
	public String Test()
	{
		return "Controller Testing Branch Testing";
	}
	
	@GetMapping(path="/dbt", produces="application/xml")
	public List<SchemeDTO> Allshemes()
	{
		return schemeDAO.GetAll();
	}
}

