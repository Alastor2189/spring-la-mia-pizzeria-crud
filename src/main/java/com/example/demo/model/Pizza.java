package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="pizze")

public class Pizza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nomePizza;
	private String descrizionePizza;
	private String foto;
	private float Prezzo;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomePizza() {
		return nomePizza;
	}
	public void setNomePizza(String nomePizza) {
		this.nomePizza = nomePizza;
	}
	public String getDescrizionePizza() {
		return descrizionePizza;
	}
	public void setDescrizionePizza(String descrizionePizza) {
		this.descrizionePizza = descrizionePizza;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public float getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
	
	
	
}
