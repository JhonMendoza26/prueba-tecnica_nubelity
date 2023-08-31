package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "lista_compra")
public class ListaCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 599007316919866724L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLista;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Clientes customer_id;
	
	@Column(length = 50, name = "nombre")
	private String nombre;
	
	@Column(name = "fechaRegistro")
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@NotNull
	private Date fechaRegistro;
	
	@Column(name = "activo")
	private boolean activo;

	public int getIdLista() {
		return idLista;
	}

	public void setIdLista(int idLista) {
		this.idLista = idLista;
	}

	public Clientes getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Clientes customer_id) {
		this.customer_id = customer_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	//cacortesc@truper.com
	//arendonb@truper.com
		
	

}
