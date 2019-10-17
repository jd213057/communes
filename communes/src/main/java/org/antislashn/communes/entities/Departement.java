package org.antislashn.communes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Departement {
	@Id
	private String code;
	@Column(name="name")
	private String nom;
	@ManyToOne
	@JoinColumn(name="region_code")
	private Region region;
	
	public String getNom() {
		return nom;
	}
	public Region getRegion() {
		return region;
	}

}
