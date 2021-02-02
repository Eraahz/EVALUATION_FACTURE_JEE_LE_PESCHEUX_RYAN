package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Client;
import fr.epsi.service.ClientService;

public class ListeClientsServlet extends HttpServlet {
	
	@EJB
	ClientService clientService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Client> clients = clientService.getAllClients();
		req.setAttribute("clients", clients);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeClients.jsp").forward(req, resp);
	}

}
