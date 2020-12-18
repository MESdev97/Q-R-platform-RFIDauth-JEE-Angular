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

import ma.fstt.entities.Examen;
import ma.fstt.entities.Q_R;
import ma.fstt.metier.ExamenMetier;
@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class ExamenService implements BaseRestService<Examen,Long> {
@Autowired
private ExamenMetier service;
@RequestMapping(value = "/exam", method = RequestMethod.GET)
	public List<Examen> getAll() {
		return service.getAll();
	}

@RequestMapping(value = "/exam/{id}", method = RequestMethod.GET)
	public Examen get(@PathVariable("id") Long id) {
	return service.get(id);
	}

@RequestMapping(value = "/exam", method = RequestMethod.POST)
	public Examen create(@RequestBody Examen res) {
	return service.create(res);
	}

@RequestMapping(value = "/exam/{id}", method = RequestMethod.PUT)
	public Examen update(@PathVariable("id") Long id,@RequestBody  Examen res) {
	return service.update(id, res);
	}

@RequestMapping(value = "/exam/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id) {
	service.delete(id);
		
	}
// ajouter question selon un examen
@RequestMapping(value = "/exams/{id}", method = RequestMethod.POST)
public void ajouterExamenQT( @PathVariable("id") Long id, @RequestBody Q_R question) {
	
	service.ajouterExamen(id, question);
	
}




}
