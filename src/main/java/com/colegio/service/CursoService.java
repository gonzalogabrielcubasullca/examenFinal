package com.colegio.service;

import java.util.List;

import com.colegio.entity.Curso;

public interface CursoService {

	public List<Curso> listarTodos();
	public List<Curso> listarPorNombre(String filtro);
}
