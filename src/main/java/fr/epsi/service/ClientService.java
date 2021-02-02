package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Client;

public interface ClientService {
	
	void create(Client c);
	List<Client> getAllClients();

}
