package ma.fstt.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;



@Entity
public class Enseignant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_Ens;
	private String nom;
	private String prenom;
	private String email;
	private String rfid_ens;
	
	@ManyToMany(mappedBy = "listeEnseignant")
	List<Etudiant> listEtudiant;
	
	@OneToMany(mappedBy="ens")
	List <Examen> Lexament;
	
	@JsonIgnore
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	@JsonSetter
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	@JsonIgnore
	public List<Examen> getLexament() {
		return Lexament;
	}
	@JsonSetter
	public void setLexament(List<Examen> lexament) {
		Lexament = lexament;
	}
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(Long id_Ens, String nom, String prenom, String email, String rfid_ens) {
		super();
		this.id_Ens = id_Ens;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.rfid_ens = rfid_ens;
	}
	public Long getId_Ens() {
		return id_Ens;
	}
	public void setId_Ens(Long id_Ens) {
		this.id_Ens = id_Ens;
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
	public String getRfid_ens() {
		return rfid_ens;
	}
	public void setRfid_ens(String rfid_ens) {
		this.rfid_ens = rfid_ens;
	}
	
	
}
