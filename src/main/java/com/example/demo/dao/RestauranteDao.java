package com.example.demo.dao;

import java.util.List;

import com.example.demo.modelo.Restaurante;

public interface RestauranteDao {
	
	void crearRestaurante(Restaurante restaurante);
	void eliminarRestauranteById(Integer id_restaurante);
	void updateRestaurante(Restaurante restaurante);
	Restaurante findById(Integer id_restaurante);
	Restaurante findByNombre(String nombre);
	List<Restaurante> todosLosRestaurantes();

}
