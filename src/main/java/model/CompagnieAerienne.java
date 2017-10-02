package model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import antlr.collections.List;

@Entity
public class CompagnieAerienne implements Serializable {

	/******************** ATTRIBUT **************/
	@Id
	private Long id;
	private String nom;
	@OneToMany(mappedBy = "compagnieAerienne", cascade =  CascadeType.PERSIST)
	private Collection<CompagnieAerienneVol> listCompagnieAerienne;
	@Version
	private int version;

	/******************** GETTER / SETTER **************/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public Collection<CompagnieAerienneVol> getListCompagnieAerienne() {
		return listCompagnieAerienne;
	}

	public void setListCompagnieAerienne(Collection<CompagnieAerienneVol> listCompagnieAerienne) {
		this.listCompagnieAerienne = listCompagnieAerienne;
	}

	/******************** CONSTRUCTEUR **************/
	public CompagnieAerienne(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public CompagnieAerienne() {
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	/******************** TOSTRING **************/
	
	public String toString() {
		return "CompagnieAerienne [id=" + id + ", nom=" + nom + "]";
	}

}