package ma.fstt.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ma.fstt.entities.Examen;
import ma.fstt.entities.Q_R;
import ma.fstt.repositories.ExamenRepository;
import ma.fstt.repositories.QRRepository;
@Service
public class ExamenMetier implements BaseRestMetier<Examen, Long> {
@Autowired
private ExamenRepository repository;
@Autowired
private QRRepository qrRepository; 
	@Override
	public List<Examen> getAll() {
		List<Examen> exams = new ArrayList<>();
		repository.findAll().forEach(exams::add);
		return exams;
	}

	@Override
	public Examen get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Examen create(Examen res) {
		return repository.save(res);
	}

	@Override
	public Examen update(Long id, Examen res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	public void ajouterExamen(Long id, Q_R question){
		Examen examen = get(id);
		question.setExam(examen);
		qrRepository.save(question);
		
	}

}
