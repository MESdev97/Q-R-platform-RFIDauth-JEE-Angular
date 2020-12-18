package ma.fstt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ma.fstt.entities.Enseignant;
import ma.fstt.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant,Long>{

	@Query("select e from Etudiant e where e.rfid_et = :rfid")
	Etudiant authentification(@Param("rfid")String rfid);
	

}
