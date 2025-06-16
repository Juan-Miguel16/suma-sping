package com.ejercicio.springboot.app.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SumaController {

	// Método para sumar tres números
	@GetMapping("/sumar")
	public Map<String, Integer> sumar(
			@RequestParam(name = "x") int x,
			@RequestParam(name = "y") int y,
			@RequestParam(name = "z") int z) {

		int resultado = x + y + z;
		return Map.of("resultado", resultado);
	}

	// Nuevo método para dividir dos números
	@GetMapping("/dividir")
	public Map<String, Object> dividir(
			@RequestParam(name = "a") double a,
			@RequestParam(name = "b") double b) {

		if (b == 0) {
			return Map.of("error", "No se puede dividir entre cero");
		}

		double resultado = a / b;
		return Map.of("resultado", resultado);
	}
}
