package ma.fstt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.fstt.entities.Q_R;
import ma.fstt.metier.Q_RMetier;
@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class QRService implements BaseRestService<Q_R,Long> {
@Autowired 
private Q_RMetier service;
@RequestMapping(value = "/qr", method = RequestMethod.GET)
	public List<Q_R> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/qr/{id}", method = RequestMethod.GET)
	public Q_R get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/qr", method = RequestMethod.POST)
	public Q_R create(@RequestBody Q_R res) {
		return service.create(res);
	}

	@RequestMapping(value = "/qr/{id}", method = RequestMethod.PUT)
	public Q_R update(@PathVariable("id") Long id,@RequestBody  Q_R res) {
		return service.update(id, res);
	}

	@RequestMapping(value = "/qr/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}
	@RequestMapping(value = "/questionSelonExa/{id}", method = RequestMethod.GET)
	public List<Q_R> ListQuestionSelonExa(@PathVariable("id") Long id) {
		return service.ListQuestionSelonExa(id);
		
	}
	

}
