package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "productos")
public class Productos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7307258391626159159L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	
	@Column(length = 15, name = "clave")
	private String clave;
	
	@Column(length = 150, name = "descripcion")
	private String descripcion;
	
	@Column(name = "activo")
	private boolean activo;

}
