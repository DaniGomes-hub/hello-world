package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")

public class HelloWorldController {
	
	@GetMapping
	public String ola () {
		return "Olá Mundo! Bom dia!";
	}
	
	@GetMapping("bsm")
	public String bsm () {
		return "• BSM na Generation Brasil: \r\n"
				+ "Mentalidades: \r\n"
				+ "- Orientação ao Futuro \r\n"
				+ "- Responsabilidade Pessoal \r\n"
				+ "- Mentalidade de Crescimento \r\n"
				+ "- Persistência \r\n"
				+ "Habilidades:\r\n"
				+ "- Trabalho em equipe\r\n"
				+ "- Atenção aos Detalhes\r\n"
				+ "- Proatividade\r\n"
				+ "- Comunicação";
	}
	
	@GetMapping("objetivos")
	public String objetivos () {
		return "Para essa semana os Objetivos de aprimoramento são:\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Atenção aos Detalhes\r\n"
				+ "- Comunicação";
	}
}
