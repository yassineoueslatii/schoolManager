package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.adaming.dao.IEtudiantDAO;
import fr.adaming.model.Etudiant;

public class EtudiantService implements IEtudiantService {
	
	
	
	private IEtudiantDAO dao ;

	public void setDao(IEtudiantDAO dao) {
		this.dao = dao;
	}

	@Override
	public int createStudent(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return dao.createStudent(etudiant);
	}

	@Override
	public List<Etudiant> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}

	@Override
	public Etudiant getStudent(int id) {
		// TODO Auto-generated method stub
		return dao.getStudent(id);
	}

	@Override
	public int removeStudent(int id) {
		// TODO Auto-generated method stub
		return dao.removeStudent(id);
	}

}
