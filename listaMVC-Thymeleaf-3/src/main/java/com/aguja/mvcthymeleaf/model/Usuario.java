package com.aguja.mvcthymeleaf.model;

public class Usuario {
	
	private Long id;
	private String nombreUsuario;
	private String nombreCompleto;
	
	public Usuario() {}
	
	public Usuario(Long id, String nombreUsuario, String nombreCompleto) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombreCompleto = nombreCompleto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
	
	

}
