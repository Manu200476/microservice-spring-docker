package io.kebblar.petstore.api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.kebblar.petstore.api.model.domain.Gente;
import io.kebblar.petstore.api.model.exceptions.ControllerException;
import io.kebblar.petstore.api.service.GenteService;

@RestController
@RequestMapping(value="/api")
public class GenteController {
	private GenteService genteService;
	
	public GenteController(GenteService genteService) {
		this.genteService = genteService;
	}
	
	@PostMapping(path="/salvar-gente")
	public int salvaGente(@RequestParam int id, @RequestParam String correo, @RequestParam String clave) throws ControllerException {
		return genteService.salvaDatos(id, correo, clave);
	}
	
	@GetMapping(path="/dame-datos")
	public List<Gente> dame() throws ControllerException {
		return genteService.dameDatos();
	}
}
