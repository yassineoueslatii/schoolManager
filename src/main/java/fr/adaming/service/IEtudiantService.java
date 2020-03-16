package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Etudiant;

public interface IEtudiantService {
	
	
	public int createStudent(Etudiant etudiant);
	public List<Etudiant> getStudents();
	public Etudiant getStudent(int id);
	public int removeStudent(int id);

}
