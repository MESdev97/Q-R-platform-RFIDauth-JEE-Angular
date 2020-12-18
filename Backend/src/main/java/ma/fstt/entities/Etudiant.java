package ma.fstt.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_Et;
	private String nom;
	private String prenom;
	private String email;
	private String rfid_et;
	
	@ManyToMany
	@JoinTable(name="Etudiant_Enseignant")
	List <Enseignant> listeEnseignant;
	
	@ManyToMany
	@JoinTable(name="Etudiant_Examen")
	List <Examen> listeExamen;
	
	@JsonIgnore
	public List<Enseignant> getListeEnseignant() {
		return listeEnseignant;
	}
	@JsonSetter
	public void setListeEnseignant(List<Enseignant> listeEnseignant) {
		this.listeEnseignant = listeEnseignant;
	}
	@JsonIgnore
	public List<Examen> getListeExamen() {
		return listeExamen;
	}
	@JsonSetter
	public void setListeExamen(List<Examen> listeExamen) {
		this.listeExamen = listeExamen;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(Long id_Et,String nom, String prenom, String email, String rfid_et) {
		super();
		this.id_Et=id_Et;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.rfid_et = rfid_et;
	}
	
	public Long getId_Et() {
		return id_Et;
	}
	public void setId_Et(Long id_Et) {
		this.id_Et = id_Et;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRfid_et() {
		return rfid_et;
	}
	public void setRfid_et(String rfid_et) {
		this.rfid_et = rfid_et;
	}
	
	

}
