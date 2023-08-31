package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Clientes;

public interface IClientesRepository extends CrudRepository<Clientes, Integer> {

}
