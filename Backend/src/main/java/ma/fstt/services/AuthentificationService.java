package ma.fstt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.metier.EnseignantMetier;
import ma.fstt.metier.EtudiantMetier;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class AuthentificationService {
	
	@Autowired
	private EnseignantMetier enseignantMetier;
	@Autowired
	private EtudiantMetier etudiantMetier;

//@RequestMapping(value = "auth/{rfId}", method = RequestMethod.GET)
//	public String authentification(@PathVariable("rfId") String rfId){
//		if(etudiantMetier.authentification(rfId).equals(null) && enseignantMetier.authentification(rfId).equals(null)){
//			return "notfound";
//		} else {
//			return true;
//		}
//		
//		
//	}
	
	

}
