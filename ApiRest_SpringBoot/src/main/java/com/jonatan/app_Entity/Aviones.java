package com.jonatan.app_Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//declaro la clase como entidad y creo la tabla

@Entity
@Table(name = "aviones")
public class Aviones {
	
	//creo las columnas y campos que va a tener  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "aeronave")
	private String tipoDeAviones;
	
	@Column(name = "capacidad de carga")
	private String capacidadCarga;
	
	@Column(name = "capacidad de asintos")
	private String capacidadAsientos;
	
	@Column(name = "velocidad maxima")
	private String velocidadMax;
	
	
	@Column(name = "año de construccion")
	private int añoDeConstruccion;
	

	// contructores
	
	public Aviones() {
		
	}


	public Aviones(int id, String tipoDeAviones, String capacidadCarga, String capacidadAsientos, String velocidadMax,
			int añoDeConstruccion) {
		super();
		this.id = id;
		this.tipoDeAviones = tipoDeAviones;
		this.capacidadCarga = capacidadCarga;
		this.capacidadAsientos = capacidadAsientos;
		this.velocidadMax = velocidadMax;
		this.añoDeConstruccion = añoDeConstruccion;
	}

	//metodos setters y getters para poder acceder a los atributos de la clase 
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoDeAviones() {
		return tipoDeAviones;
	}


	public void setTipoDeAviones(String tipoDeAviones) {
		this.tipoDeAviones = tipoDeAviones;
	}


	public String getCapacidadCarga() {
		return capacidadCarga;
	}


	public void setCapacidadCarga(String capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}


	public String getCapacidadAsientos() {
		return capacidadAsientos;
	}


	public void setCapacidadAsientos(String capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}


	public String getVelocidadMax() {
		return velocidadMax;
	}


	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}


	public int getAñoDeConstruccion() {
		return añoDeConstruccion;
	}


	public void setAñoDeConstruccion(int añoDeConstruccion) {
		this.añoDeConstruccion = añoDeConstruccion;
	}
	
	
	

}
