package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Login {
	@Id
	private int id;	
	private String login;
	private String motDePasse;
	private  boolean admin;
	
	
	public Login() {
		
	}
	public Login(int id, String login, String motDePasse, boolean admin) {
	
		this.id = id;
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String toString() {
		return "Login [id=" + id + ", login=" + login + ", motDePasse=" + motDePasse + ", admin=" + admin + "]";
	}

	

	
}
