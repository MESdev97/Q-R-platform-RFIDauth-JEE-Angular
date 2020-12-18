package ma.fstt.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ma.fstt.entities.Admin;
import ma.fstt.repositories.AdminRepository;

@Service
public class AdminMetier implements BaseRestMetier<Admin,Long> {
	@Autowired
	private AdminRepository repository;
	@Override
	public List<Admin> getAll() {
		List<Admin> admins = new ArrayList<>();
		repository.findAll().forEach(admins::add);
		return admins;
	}

	@Override
	public Admin get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Admin create(Admin res) {
		return repository.save(res);
	}

	@Override
	public Admin update(Long id, Admin res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	public boolean authVerification(String login, String password){
		if(repository.authentificationAdmin(login,password)!=null)return true;
		
		return false;
	}

}
