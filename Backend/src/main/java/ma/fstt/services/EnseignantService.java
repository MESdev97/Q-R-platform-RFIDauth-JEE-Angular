package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.entities.Enseignant;
import ma.fstt.entities.Etudiant;
import ma.fstt.metier.EnseignantMetier;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EnseignantService implements BaseRestService<Enseignant,Long>{
	@Autowired
	private EnseignantMetier service;

	@RequestMapping(value = "/enseignant", method = RequestMethod.GET)
	public List<Enseignant> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.GET)
	public Enseignant get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/enseignant", method = RequestMethod.POST)
	public Enseignant create(@RequestBody Enseignant res) {
		return service.create(res);
	}

	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.PUT)
	public Enseignant update(@PathVariable("id") Long id,@RequestBody  Enseignant res) {
		return service.update(id, res);
	}

	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}
	
	
	@RequestMapping(value = "/etudiantselonProf/{id}", method = RequestMethod.GET)
	public List<Etudiant> listEtudiantSelonProf(@PathVariable("id") Long id) {
		return service.listEtudiantSelonProf(id);
	}
	
	@RequestMapping(value = "/addetudiantselonProf", method = RequestMethod.PUT)
	public void ajouterEtudiantToProf(@RequestParam Long idEtudiant,@RequestParam Long idProf) {
		 service.ajouterEtudiantToProf(idEtudiant, idProf);
		 
	}

}
