package com.formation.parking.models;

public class Parking {
	private int identifiant;

	private String nom;
	private int nbPlaceDispo;
	private int nbPlaceTotal;
	private String statut;
	private String heureMaj;
	
	public int getIdentifiant() {
		return identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbPlaceDispo() {
		return nbPlaceDispo;
	}
	public void setNbPlaceDispo(int nbPlaceDispo) {
		this.nbPlaceDispo = nbPlaceDispo;
	}
	public int getNbPlaceTotal() {
		return nbPlaceTotal;
	}
	public void setNbPlaceTotal(int nbPlaceTotal) {
		this.nbPlaceTotal = nbPlaceTotal;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getHeureMaj() {
		return heureMaj;
	}
	public void setHeureMaj(String heureMaj) {
		this.heureMaj = heureMaj;
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	
}
