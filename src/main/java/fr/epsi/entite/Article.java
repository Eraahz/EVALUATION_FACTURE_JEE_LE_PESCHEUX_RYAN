package fr.epsi.entite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private double prix;
	
	@OneToMany
	private List<LigneFacture> listeLigneFactures;
	
	public Long getId() {
		return id;
	}
	
	public List<LigneFacture> getListeLigneFactures() {
		return listeLigneFactures;
	}

	public void setListeLigneFactures(List<LigneFacture> listeLigneFactures) {
		this.listeLigneFactures = listeLigneFactures;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
