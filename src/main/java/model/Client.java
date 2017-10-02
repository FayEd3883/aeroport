package model;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "CLIENT_DISCR", discriminatorType = DiscriminatorType.STRING)
public abstract class Client {
	@Id
	private long id;
	private String nom;
	private int numeroTel;
	private int numeroFix;
	private String email;
	@Embedded
	private Adresse adresse;
	
	@OneToMany(mappedBy = "client",fetch=FetchType.LAZY,targetEntity=Reservation.class)
//	@JoinColumn(name="reservation", referencedColumnName="id")
	private Collection<Reservation> reservation;
	
	@OneToOne
	@JoinColumn(name="login_id")
	private Login login;
	@Version
	private int version;


	public Client(long id, String nom, int numeroTel, int numeroFix, String email) {
	
		this.id = id;
		this.nom = nom;
		this.numeroTel = numeroTel;
		this.numeroFix = numeroFix;
		this.email = email;
	}

	public Client() {
	}

	// revenir sur les classe filles dans les tests pour voir 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	public int getNumeroFix() {
		return numeroFix;
	}

	public void setNumeroFix(int numeroFix) {
		this.numeroFix = numeroFix;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	
	public int getVersion() {
		return version;
	}
	

	public void setVersion(int version) {
		this.version = version;
	}


	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", numeroTel=" + numeroTel + ", numeroFix=" + numeroFix
				+ ", email=" + email + ", version=" + version + "]";
	}

	

}
