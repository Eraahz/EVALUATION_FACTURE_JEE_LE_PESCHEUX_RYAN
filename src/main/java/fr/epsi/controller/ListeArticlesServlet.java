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

public class ListeArticlesServlet extends HttpServlet {
	
	@EJB
	ArticleService articleService;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Article> articles = articleService.getAllArticles();
		req.setAttribute("articles", articles);
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeArticles.jsp").forward(req, resp);
	}

}
