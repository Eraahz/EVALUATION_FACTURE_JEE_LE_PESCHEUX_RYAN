package fr.epsi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public class FactureDaoImpl implements FactureDao{
	
	EntityManager em;
	UserTransaction utx;

	public FactureDaoImpl(EntityManager em, UserTransaction utx) {
		this.em=em;
		this.utx=utx;
	}
	
	public void create(Article article) {
		try {
			utx.begin();
			em.persist(article);
			
			utx.commit();
		} catch (NotSupportedException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (RollbackException e) {
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			e.printStackTrace();
		}
	}

	public void create(Client client) {
		try {
			utx.begin();
			em.persist(client);
			
			utx.commit();
		} catch (NotSupportedException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (RollbackException e) {
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			e.printStackTrace();
		}
	}
	
	public List<Client> getAllClients() {
		List<Client> listeClients = em.createQuery("SELECT c from Client c order by c.nom", Client.class).getResultList();
		return listeClients;
	}
	
	public List<Article> getAllArticles() {
		List<Article> listeArticles = em.createQuery("SELECT a from Article a order by a.nom", Article.class).getResultList();
		return listeArticles;
	}
	
	public List<Facture> getAllFactures() {
		List<Facture> listeFactures = em.createQuery("SELECT f from Facture f order by f.numero", Facture.class).getResultList();
		return listeFactures;
	}
	
	public Facture getFactureById(Long id) {
		Facture facture = em.createQuery("select f from Facture f where f.id = :id", Facture.class)
							.setParameter("id", id)
							.getSingleResult();
		
		return facture;
	}

	public List<LigneFacture> getLigneFacturesByFactureId(Long factureId) {
		List<LigneFacture> ligneFactures = em.createQuery("select l from LigneFacture l where l.facture.id = :factureId", LigneFacture.class)
							   				 .setParameter("factureId", factureId)
							   				 .getResultList();
		return ligneFactures;
	}

}
