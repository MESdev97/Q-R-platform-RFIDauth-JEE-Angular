package ma.fstt.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.fstt.entities.Enseignant;
import ma.fstt.entities.Etudiant;
import ma.fstt.repositories.EnseignantRepository;

@Service
public class EnseignantMetier implements BaseRestMetier<Enseignant,Long> {
@Autowired
private EnseignantRepository repository;
@Autowired 
private EtudiantMetier etudiantMetier;
	@Override
	public List<Enseignant> getAll() {
		List<Enseignant> enseignants = new ArrayList<>();
		repository.findAll().forEach(enseignants::add);
		return enseignants;
	}

	@Override
	public Enseignant get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Enseignant create(Enseignant res) {
		return repository.save(res);
	}

	@Override
	public Enseignant update(Long id, Enseignant res) {
		res.setId_Ens(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	public String authentification(String rfid){
		if(this.repository.authentification(rfid)!=null){
			return "enseignant";
		} else {
			return null;
		}		 
	}
	public List<Etudiant> listEtudiantSelonProf(Long id){
		return repository.listEtudiantSelonProf(id);
	}
//**************************************************************************
	public void ajouterEtudiantToProf(Long id_et, Long id_prof){
		Enseignant enseignant = this.get(id_prof);
		Etudiant etudiant = etudiantMetier.get(id_et);
		enseignant.getListEtudiant().add(etudiant);
		etudiant.getListeEnseignant().add(enseignant);
		etudiantMetier.create(etudiant);
		this.create(enseignant);
		
	}

}
