package fr.epsi.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.service.ArticleService;
import fr.epsi.service.ClientService;

public class CreerArticleServlet extends HttpServlet {
	
	@EJB
	ArticleService articleService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireArticle.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Article article = new Article();
		article.setNom(req.getParameter("nomArticle"));
		article.setPrix(Double.parseDouble(req.getParameter("prixArticle")));
		articleService.create(article);
	}
}

