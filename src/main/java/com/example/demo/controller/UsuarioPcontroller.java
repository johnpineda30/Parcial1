package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.UsuarioP;
import com.example.demo.repository.IUsuarioRepository;

@Controller
@RequestMapping("/UsuarioP")

public class UsuarioPcontroller {

	@Autowired
	private IUsuarioRepository usuariopRepository;
	
	@GetMapping("/registro")
	private String saveFormulary (UsuarioP usuariop) {
		return "formulary";
		
	}
	@PostMapping ("/registro")
	private String registroPersona (UsuarioP usuariop) {
		System.out.print("si salvo");
		usuariopRepository.save(usuariop);
		
		return "formulary";
		
	}
	
	
}
