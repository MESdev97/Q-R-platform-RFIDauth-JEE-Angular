package ma.fstt.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ma.fstt.entities.Q_R;
import ma.fstt.repositories.QRRepository;



@Service
public class Q_RMetier implements BaseRestMetier<Q_R, Long> {
@Autowired
private QRRepository repository;
	@Override
	public List<Q_R> getAll() {
		List<Q_R> qrs = new ArrayList<>();
		repository.findAll().forEach(qrs::add);
		return qrs;
	}

	@Override
	public Q_R get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Q_R create(Q_R res) {
		return repository.save(res);
	}

	@Override
	public Q_R update(Long id, Q_R res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	public List<Q_R> ListQuestionSelonExa(Long id){
		return repository.ListQuestionSelonExa(id);
	}

}
