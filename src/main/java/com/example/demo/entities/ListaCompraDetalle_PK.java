package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;


@Embeddable
public class ListaCompraDetalle_PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4355802717030149154L;
	
	private int idListaCompra;
	
	private int codigoProducto;

	public int getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(int idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	
	
	
	
	
	

}
