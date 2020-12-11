package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Curso;
import com.colegio.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public List<Curso> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Curso> listarPorNombre(String filtro) {
		return repository.listaPorNombre(filtro);
	}

}
