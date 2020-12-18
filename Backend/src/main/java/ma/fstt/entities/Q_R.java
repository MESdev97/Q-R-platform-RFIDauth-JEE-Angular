package ma.fstt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Q_R {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String question;
	private String reponse;
	private String choix1;
	private String choix2;
	private String choix3;
	
	@ManyToOne
	@JoinColumn(name="id_exam")
	private Examen exam;
	
	public Q_R(String question, String reponse, String choix1, String choix2, String choix3) {
		super();
		this.question = question;
		this.reponse = reponse;
		this.choix1 = choix1;
		this.choix2 = choix2;
		this.choix3 = choix3;
	}
	@JsonIgnore
	public Examen getExam() {
		return exam;
	}
	public void setExam(Examen exam) {
		this.exam = exam;
	}
	public String getChoix1() {
		return choix1;
	}
	public void setChoix1(String choix1) {
		this.choix1 = choix1;
	}
	public String getChoix2() {
		return choix2;
	}
	public void setChoix2(String choix2) {
		this.choix2 = choix2;
	}
	public String getChoix3() {
		return choix3;
	}
	public void setChoix3(String choix3) {
		this.choix3 = choix3;
	}
	public Q_R() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Q_R(Long id, String question, String reponse) {
		super();
		this.id = id;
		this.question = question;
		this.reponse = reponse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	
	
}
