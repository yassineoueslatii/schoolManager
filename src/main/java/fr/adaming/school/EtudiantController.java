package fr.adaming.school;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.adaming.model.Etudiant;
import fr.adaming.service.IEtudiantService;

@Controller
public class EtudiantController {
	
	
	@Autowired
	private IEtudiantService service;
	
	public void setService(IEtudiantService service) {
		this.service = service;
	}

	
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String afficheListe(Model model) {
		List<Etudiant> liste = new ArrayList<Etudiant>();
		liste=service.getStudents();
		model.addAttribute("etudiants",liste);
		
	
		
		return "liste";
		
		
	
		
		
		
	}
	
	@RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
	public String afficheEtudiant(Model model,@PathVariable int id) {
		
		Etudiant etd = new Etudiant();
		etd = service.getStudent(id);
		model.addAttribute("etudiant", etd);
		
		return "etudiant";
		
	
	}

}
