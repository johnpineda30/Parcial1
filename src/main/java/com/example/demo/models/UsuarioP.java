package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UsuarioP")
public class UsuarioP {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_usuario")
	private String nombre_usuario;
	
	@Column(name = "correo_electronico", unique = true)
	private String correo;
	
	@Column (name = "contraseña")
	private String contraseña ;
	
	@Column (name = "telefono")
	private String telefono;

	public UsuarioP() {
		super();
	}

	public UsuarioP(Long id, String nombre_usuario, String correo, String contraseña, String telefono) {
		super();
		this.id = id;
		this.nombre_usuario = nombre_usuario;
		this.correo = correo;
		this.contraseña = contraseña;
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
