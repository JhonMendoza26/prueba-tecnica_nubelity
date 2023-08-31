package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes implements Serializable {

	private static final long serialVersionUID = -1592261152606521606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(length = 50, name = "nombre")
	private String nombre;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
