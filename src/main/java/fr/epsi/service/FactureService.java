package fr.epsi.service;

import java.util.List;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

public interface FactureService {
	public List<Facture> getAllFactures();
	public Facture getFactureById(Long id);
	public List<LigneFacture> getLigneFacturesByFactureId(Long factureId);
}
