package ma.fstt.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


@Entity
public class Examen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre;
	
	@ManyToMany(mappedBy = "listeExamen")
	List<Etudiant> listEtudiant;
	
	@ManyToOne
	@JoinColumn(name="id_ens")
	private Enseignant ens;
	
	@OneToMany(mappedBy="exam")
	List <Q_R> Lq_r;
	@JsonIgnore
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	@JsonSetter
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	public Enseignant getEns() {
		return ens;
	}
	public void setEns(Enseignant ens) {
		this.ens = ens;
	}
	@JsonIgnore
	public List<Q_R> getLq_r() {
		return Lq_r;
	}
	@JsonSetter
	public void setLq_r(List<Q_R> lq_r) {
		Lq_r = lq_r;
	}
	public Examen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examen(Long id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
}
