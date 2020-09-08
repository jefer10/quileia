package com.example.demo.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "restaurante")
public class Restaurante {

	@Id
	@Column(name="id_restaurante")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_restaurante;
	
	@Column(name="razon_social")
	private String razon_social;
	
	@Column(name="nombre_comercial")
	private String nombre_comercial;
	
	@Column(name="tipo_de_restaurante")
	private Integer tipo_de_restaurante;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name = "hora_de_apertura")
	private String hora_de_apertura;
	
	@Column(name="hora_de_cierre")
	private String hora_de_cierre;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "restaurante")//si elimina un restaurante se borran los menus
	private List<Menu> menus;
	
	
// constructor
	public Restaurante(String razon_social, String nombre_comercial, Integer tipo_de_restaurante, String ciudad,
			String hora_de_apertura, String hora_de_cierre, List<Menu> menus) {
		super();
		this.razon_social = razon_social;
		this.nombre_comercial = nombre_comercial;
		this.tipo_de_restaurante = tipo_de_restaurante;
		this.ciudad = ciudad;
		this.hora_de_apertura = hora_de_apertura;
		this.hora_de_cierre = hora_de_cierre;
		this.menus = menus;
	}
	
//getters y setters

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public Integer getTipo_de_restaurante() {
		return tipo_de_restaurante;
	}

	public void setTipo_de_restaurante(Integer tipo_de_restaurante) {
		this.tipo_de_restaurante = tipo_de_restaurante;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getHora_de_apertura() {
		return hora_de_apertura;
	}

	public void setHora_de_apertura(String hora_de_apertura) {
		this.hora_de_apertura = hora_de_apertura;
	}

	public String getHora_de_cierre() {
		return hora_de_cierre;
	}

	public void setHora_de_cierre(String hora_de_cierre) {
		this.hora_de_cierre = hora_de_cierre;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
	

}
