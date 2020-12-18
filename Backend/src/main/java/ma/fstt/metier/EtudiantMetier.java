package ma.fstt.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.entities.Etudiant;

import ma.fstt.repositories.EtudiantRepository;

@Service
public class EtudiantMetier implements BaseRestMetier<Etudiant,Long> {
	@Autowired
	private EtudiantRepository repository;
	@Override
	public List<Etudiant> getAll() {
		
			List<Etudiant> etudiants = new ArrayList<>();
			repository.findAll().forEach(etudiants::add);
			return etudiants;
	}

	@Override
	public Etudiant get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Etudiant create(Etudiant res) {
		return repository.save(res);
	}

	@Override
	public Etudiant update(Long id, Etudiant res) {
		res.setId_Et(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	public String authentification(String rfid){
		if(this.repository.authentification(rfid)!=null){
			return "etudiant";
		} else {
			return null;
		}		 
	}
	

	
}
