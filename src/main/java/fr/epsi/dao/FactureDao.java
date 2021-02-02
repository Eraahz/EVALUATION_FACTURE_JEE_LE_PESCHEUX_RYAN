package fr.epsi.dao;

import java.util.List;

import fr.epsi.entite.Article;
import fr.epsi.entite.Client;
import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public interface FactureDao {
  public void create(Client client);
  public void create(Article article);
  public List<Client> getAllClients();
  public List<Article> getAllArticles();
  public List<Facture> getAllFactures();
  public Facture getFactureById(Long id);
  public List<LigneFacture> getLigneFacturesByFactureId(Long factureId);
}
