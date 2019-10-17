package org.antislashn.communes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="regions")
@NamedQuery(name="Region.all", query = "SELECT r.nom FROM Region r")
public class Region {
	@Id
	private String code;
	@Column(name="name")
	private String nom;

	public String getNom() {
		return nom;
	}
	public String getCode() {
		return code;
	}

}
