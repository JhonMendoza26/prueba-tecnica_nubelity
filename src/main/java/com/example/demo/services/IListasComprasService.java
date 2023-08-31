package com.example.demo.services;


import com.example.demo.entities.ListaCompra;


public interface IListasComprasService  {
	
	public void save(ListaCompra lista_compra);
	
	public ListaCompra findById(int idCliente);
	
}
