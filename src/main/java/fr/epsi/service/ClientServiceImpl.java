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
import fr.epsi.entite.Client;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientServiceImpl implements ClientService {

	@PersistenceContext
	EntityManager em;
	
	@Resource
	UserTransaction utx;
	
	public void create(Client c)  {
		FactureDao dao = new FactureDaoImpl(em, utx);
		dao.create(c);
	}
	
	public List<Client> getAllClients() {
		FactureDao dao = new FactureDaoImpl(em, utx);
		List<Client> listeClients = dao.getAllClients();
		return listeClients;
	}

}
