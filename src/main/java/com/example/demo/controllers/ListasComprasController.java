package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ListaCompra;
import com.example.demo.services.IListasComprasService;

@RestController
public class ListasComprasController {
	
	private IListasComprasService lcService;
	
	public ListasComprasController(IListasComprasService lcService) {
		this.lcService = lcService;
	}
	
	@PostMapping("listascompras")
	public int guardar(@RequestParam ListaCompra listaCompra ) {
		
		ListaCompra lcompra = new ListaCompra();
		lcompra.setCustomer_id(listaCompra.getCustomer_id());
		lcompra.setNombre(listaCompra.getNombre());
		
		lcService.save(lcompra);
		
		return lcompra.getIdLista();
	}
	
	@GetMapping("listascompras/{id}")
	public int buscarPorId(@PathVariable(name = "id") int id) {
		return lcService.findById(id).getCustomer_id().getIdCliente();
	}
	
	

}
