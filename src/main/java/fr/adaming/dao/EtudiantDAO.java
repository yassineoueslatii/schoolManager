package fr.adaming.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Etudiant;

public class EtudiantDAO implements IEtudiantDAO{
	
	
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();

	@Override
	public int createStudent(Etudiant etudiant) {
		try {
			
			Session session = factory.openSession();
			session.beginTransaction();
			session.save(etudiant);
			session.getTransaction().commit();
			return 1;
			
			
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
			System.out.println("Erreur dans la méthode create student");
			return 0;
			
		}
		
		
	
	}

	@Override
	public List<Etudiant> getStudents() {
	
	try {
			
			Session session = factory.openSession();
			session.beginTransaction();
			
			return session.createQuery("from Etudiant").list();
			
			
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
			System.out.println("Erreur dans la méthode get students");
			return null;
			
		}
		
	}

	@Override
	public Etudiant getStudent(int id) {
		
	try {
			
			Session session = factory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("from Etudiant where id = :x");
			query.setParameter("x", id);
			return (Etudiant) query.uniqueResult();
			
			
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
			System.out.println("Erreur dans la méthode  get student");
			return null;
			
		}
		
	}

	@Override
	public int removeStudent(int id) {
		
	try {
			
			Session session = factory.openSession();
			session.beginTransaction();
			
			Etudiant etu = new Etudiant();
			etu.setIdEtudiant(id);
			session.delete(etu);
			session.getTransaction().commit();
			return 1; 
			
			
		}
		catch (HibernateException e) {
			
			e.printStackTrace();
			System.out.println("Erreur dans la méthode create student");
			return 0;
			
		}
		
	}

}
