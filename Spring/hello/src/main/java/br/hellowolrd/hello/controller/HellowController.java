package br.hellowolrd.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellow")
public class HellowController {
	
	@GetMapping
	public String hellow() {
		return "Hellow Generation!!!";
	}
	//PENSEM SOBRE O MELHOR MOMENTO DE SUAS VIDAS
	public String melhormomento() {
		return "Viagem com a familia para praia";
	}
	//E PENSEM SOBRE A PESSOA QUE MAIS MOLDOU SUAS VIDAS
	public String moldouvida() {
		return "Acredito que foram minha familia no geral";
	}
	//O MELHOR LUGAR QUE JÁ	VISITARAM, OU UM LUGAR QUE GOSTARIAM MUITO DE VISITAR
	public String visita() {
		return "Gostaria de conhecer belize, um pais incrivel com belas paisagens";
	}
	
	
}
