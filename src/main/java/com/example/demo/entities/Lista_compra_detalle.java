package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_compra_detalle")
public class Lista_compra_detalle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2704456233553148869L;
	
	@EmbeddedId
	private ListaCompraDetalle_PK listaCDPK;
	
	@ManyToOne
	@JoinColumn(name = "idProducto")
	private Clientes idCodigoProducto;
	
	@ManyToOne
	@JoinColumn(name = "idLista")
	private ListaCompra idListaCompra;
	
	@Column(name = "cantidad")
	private int cantidad;

}
