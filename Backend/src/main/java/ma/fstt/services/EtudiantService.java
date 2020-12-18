	package ma.fstt.services;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	
	import ma.fstt.entities.Etudiant;
	import ma.fstt.metier.EtudiantMetier;
	
	@RestController
	@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
	public class EtudiantService implements BaseRestService<Etudiant,Long>{
	@Autowired
	private EtudiantMetier service;
	
	@RequestMapping(value = "/etudiant", method = RequestMethod.GET)
		public List<Etudiant> getAll() {
		return service.getAll();
		}
	
	@RequestMapping(value = "/etudiant/{id}", method = RequestMethod.GET)
		public Etudiant get(@PathVariable("id") Long id) {
		return service.get(id);
		}
	
	@RequestMapping(value = "/etudiant", method = RequestMethod.POST)
	
		public Etudiant create(@RequestBody Etudiant res) {
		return service.create(res);
		}
	
	@RequestMapping(value = "/etudiant/{id}", method = RequestMethod.PUT)
		public Etudiant update(@PathVariable("id") Long id,@RequestBody  Etudiant resource) {
			// TODO Auto-generated method stub
			return null;
		}
	
	@RequestMapping(value = "/etudiant/{id}", method = RequestMethod.DELETE)
		public void delete(@PathVariable("id") Long id) {
			// TODO Auto-generated method stub
			
		}

	
	}
