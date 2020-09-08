package com.example.demo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="ingrediente")
public class Ingrediente implements Serializable{
	
	@Id
	@Column(name = "id_ingrediente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_ingrediente;
	
	@Column(name = "name")
	private String nombre;
	
	@Column(name = "calorias")
	private Integer calorias;
	
	
	@ManyToMany(mappedBy = "ingrediente")
	private List<Menu>menus;

// contructor
	public Ingrediente(String nombre, Integer calorias) {
		super();
		this.nombre = nombre;
		this.calorias = calorias;
	}

// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCalorias() {
		return calorias;
	}

	public void setCalorias(Integer calorias) {
		this.calorias = calorias;
	}

	

	
}
