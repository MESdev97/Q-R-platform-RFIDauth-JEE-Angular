package ma.fstt.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ma.fstt.entities.Enseignant;
import ma.fstt.entities.Etudiant;

public interface EnseignantRepository extends CrudRepository<Enseignant,Long> {

	@Query("select e from Enseignant e where e.rfid_ens = :rfid")
	Enseignant authentification(@Param("rfid")String rfid);
	
	@Query("select e.listEtudiant from Enseignant e where e.id_Ens = :id")
	List<Etudiant> listEtudiantSelonProf(@Param("id")Long id);
	
}
