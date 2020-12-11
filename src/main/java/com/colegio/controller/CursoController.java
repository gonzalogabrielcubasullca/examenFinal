package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.colegio.entity.Curso;
import com.colegio.service.CursoService;

@RestController
@RequestMapping("api/rest/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Curso>> listaPorNombre(@PathVariable("filtro") String fil){
		return ResponseEntity.ok(service.listarPorNombre(fil+"%"));
	}
}
