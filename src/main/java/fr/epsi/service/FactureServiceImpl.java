package fr.epsi.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import fr.epsi.dao.FactureDao;
import fr.epsi.dao.FactureDaoImpl;
import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class FactureServiceImpl implements FactureService {
	
	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public List<Facture> getAllFactures() {
		FactureDao dao = new FactureDaoImpl(em, utx);
		List<Facture> listeFactures = dao.getAllFactures();
		return listeFactures;
	}
	
	public Facture getFactureById(Long id) {
		FactureDao dao = new FactureDaoImpl(em, utx);
		Facture facture = dao.getFactureById(id);
		return facture;
	}
	
	public List<LigneFacture> getLigneFacturesByFactureId(Long factureId) {
		FactureDao dao = new FactureDaoImpl(em, utx);
		List<LigneFacture> ligneFactures = dao.getLigneFacturesByFactureId(factureId);
		return ligneFactures;
	}
		
	
}
