package org.antislashn.communes.services;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.antislashn.communes.dao.CommuneDAO;
import org.antislashn.communes.entities.Commune;

public class CommuneServices {
	
	private CommuneDAO dao;
	
	public CommuneServices(EntityManagerFactory emf) {
		dao = new CommuneDAO(emf);
	}
	
	public List<Commune> getCommunesByCodePostal(String codePostal) {
		return dao.getCommunesByCodePostal(codePostal);
	}

	public List<Commune> getCommunesByDepartement(String departement) {
		return dao.getCommunesByDepartement(departement);
	}
	

}
