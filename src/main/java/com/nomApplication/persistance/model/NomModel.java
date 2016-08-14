package com.nomApplication.persistance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NomModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String attributLivre;

	public NomModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NomModel(Long id, String attributLivre) {
		super();
		this.id = id;
		this.attributLivre = attributLivre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributLivre() {
		return attributLivre;
	}

	public void setAttributLivre(String attributLivre) {
		this.attributLivre = attributLivre;
	}
}
