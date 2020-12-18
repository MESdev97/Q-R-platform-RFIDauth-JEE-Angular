package ma.fstt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ma.fstt.entities.Q_R;

public interface QRRepository extends CrudRepository<Q_R,Long> {

	@Query("select q from Q_R q where q.exam.id = :id")
	List<Q_R> ListQuestionSelonExa(@Param("id") Long id);
	
}
