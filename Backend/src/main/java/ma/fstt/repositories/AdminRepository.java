package ma.fstt.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ma.fstt.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin,Long>{

	@Query("select a from Admin a where a.login = :login and a.password = :password")
	Admin authentificationAdmin(@Param("login")String login, @Param("password")String password);
	
}
