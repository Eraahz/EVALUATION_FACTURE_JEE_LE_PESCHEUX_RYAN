package fr.epsi.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;
import fr.epsi.service.FactureService;


public class DetailsFactureServlet extends HttpServlet {
	
	@EJB
	FactureService factureService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Long factureId = Long.parseLong(req.getParameter("id"));  
		Facture facture = factureService.getFactureById(factureId);
		List<LigneFacture> listeLignesFacture = factureService.getLigneFacturesByFactureId(factureId);
		req.setAttribute("facture", facture);
		req.setAttribute("listeLignesFacture", listeLignesFacture);
		req.setCharacterEncoding("UTF-8");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/detailsFacture.jsp").forward(req, resp);
	}
	

}
