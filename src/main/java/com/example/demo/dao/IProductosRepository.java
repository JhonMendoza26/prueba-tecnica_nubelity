package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Productos;

public interface IProductosRepository extends CrudRepository<Productos, Integer> {

}
