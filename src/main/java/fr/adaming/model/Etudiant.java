package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etudiant {
	
	
	
	@Id
	@GeneratedValue
	private int idEtudiant;
	private String nom;
	private String prenom;
	private char groupe;
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public char getGroupe() {
		return groupe;
	}
	public void setGroupe(char groupe) {
		this.groupe = groupe;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", groupe=" + groupe
				+ "]";
	}
	public Etudiant(String nom, String prenom, char groupe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.groupe = groupe;
	}
	
	
	
	
	
	
	
	
	
	
	

}
