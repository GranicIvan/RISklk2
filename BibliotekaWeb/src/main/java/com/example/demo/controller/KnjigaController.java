package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.KnjigaRepository;

import model.Knjiga;

@Controller
@RequestMapping(value="/knjige")
public class KnjigaController  {

	@Autowired
	KnjigaRepository kr;
	
	@RequestMapping(value="/saveKnjiga", method=RequestMethod.POST)
	public String saveKnjiga(Knjiga k, Model m, HttpServletRequest request) {
		kr.save(k);
		request.getSession().setAttribute("knjiga", k);
		m.addAttribute("poruka", "Knjiga je uspesno sacuvana.");
		
		return "unos/UnosPrimeraka";
	}
	
	
}

