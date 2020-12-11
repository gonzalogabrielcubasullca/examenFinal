package com.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sistemaevaluacion")
public class SistemaEvaluacion {

	@Id
	private int idSistemaEvaluacion;
	private String nombre;
	private String formula;
	private String estado;
	
	public int getIdSistemaEvaluacion() {
		return idSistemaEvaluacion;
	}
	public void setIdSistemaEvaluacion(int idSistemaEvaluacion) {
		this.idSistemaEvaluacion = idSistemaEvaluacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}
