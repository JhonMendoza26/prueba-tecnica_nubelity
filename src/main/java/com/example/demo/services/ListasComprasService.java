package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IListaCompraRepository;
import com.example.demo.entities.ListaCompra;

@Service
public class ListasComprasService implements IListasComprasService {
	
	@Autowired
	private IListaCompraRepository lcRepository;

	@Override
	public void save(ListaCompra lista_compra) {
		lcRepository.save(lista_compra);
		
	}

	@Override
	public ListaCompra findById(int idCliente) {
		return lcRepository.findById(idCliente).orElse(null);
	}

}
