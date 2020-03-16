package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Etudiant;

public interface IEtudiantDAO {

	
	
	public int createStudent(Etudiant etudiant);
	public List<Etudiant> getStudents();
	public Etudiant getStudent(int id);
	public int removeStudent(int id);
	
	
	
}
