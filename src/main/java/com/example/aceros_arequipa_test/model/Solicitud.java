package com.example.aceros_arequipa_test.model;

import java.time.LocalDateTime;

public class Solicitud {
	private int id;
    private String nombres;
    private String apellidos;
    private String area;
    private String nombreSolicitud;
    private String descripcion;
    private String anexo;
    private LocalDateTime createdAt;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNombreSolicitud() {
		return nombreSolicitud;
	}
	public void setNombreSolicitud(String nombreSolicitud) {
		this.nombreSolicitud = nombreSolicitud;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAnexo() {
		return anexo;
	}
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}    
}
