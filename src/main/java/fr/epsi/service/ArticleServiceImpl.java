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

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleServiceImpl implements ArticleService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(Article article) {
		FactureDao dao = new FactureDaoImpl(em, utx);
		dao.create(article);
	}

	public List<Article> getAllArticles() {
		FactureDao dao = new FactureDaoImpl(em, utx);
		List<Article> listeArticles = dao.getAllArticles();
		return listeArticles;
	}

	
}
