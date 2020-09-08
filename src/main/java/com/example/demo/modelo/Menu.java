package com.example.demo.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="menu")
public class Menu implements Serializable {
	
	@Id
	@Column(name = "id_menu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_menu;
	
	@Column(name="tipo_menu")
	private Integer tipo_menu;
	
	@Column(name="nombre_menu")
	private String nombre_menu;
	
	@Column(name = "precio")
	private Double precio;
	
	@ManyToOne(optional = true)//para que exista menu sin restaurantes
	@JoinColumn(name = "id_restaurante")//el nombre de la llave foranea en la tabla
	private Restaurante restaurante;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ingrediente_menu",//tabla de llaves
	joinColumns = @JoinColumn(name="id_menu"),// FK tabla padre
	inverseJoinColumns = @JoinColumn(name="id_ingrediente"))//FK tabla hijo
	private List<Ingrediente>ingredientes;

// constructor
	
	public Menu(Integer tipo_menu, String nombre_menu, Double precio, Restaurante restaurante) {
		super();
		this.tipo_menu = tipo_menu;
		this.nombre_menu = nombre_menu;
		this.precio = precio;
		this.restaurante = restaurante;
	}
	
	
// getter y setter
	public Integer getTipo_menu() {
		return tipo_menu;
	}

	public void setTipo_menu(Integer tipo_menu) {
		this.tipo_menu = tipo_menu;
	}

	public String getNombre_menu() {
		return nombre_menu;
	}

	public void setNombre_menu(String nombre_menu) {
		this.nombre_menu = nombre_menu;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	

}
