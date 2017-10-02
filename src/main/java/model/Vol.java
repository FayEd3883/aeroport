package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Vol implements Serializable {

	/******************** ATTRIBUT **************/

	@Id
	private int id;
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrivee;

	@OneToMany(mappedBy = "vol", cascade = CascadeType.PERSIST)
	private Collection<CompagnieAerienneVol> listCompagnieAerienne;

	private Aeroport arrivee;
	private Aeroport depart;
	private Collection<Escale> listEscale;
	@Version
	private int version;

	/******************** GETTER / SETTER **************/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Aeroport getArrivee() {
		return arrivee;
	}

	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}

	public Aeroport getDepart() {
		return depart;
	}

	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}

	
	public Collection<CompagnieAerienneVol> getListCompagnieAerienne() {
		return listCompagnieAerienne;
	}

	public void setListCompagnieAerienne(Collection<CompagnieAerienneVol> listCompagnieAerienne) {
		this.listCompagnieAerienne = listCompagnieAerienne;
	}

	public Collection<Escale> getListEscale() {
		return listEscale;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void setListEscale(Collection<Escale> listEscale) {
		this.listEscale = listEscale;
	}

	/******************** CONSTRUCTEUR **************/
	public Vol() {
	}

	public Vol(int id, Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee, Aeroport arrivee,
			Aeroport depart) {
		
		this.id = id;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.arrivee = arrivee;
		this.depart = depart;
		this.listEscale = listEscale;
	}

	/******************** TOSTRING **************/

	
	public String toString() {
		return "Vol [id=" + id + ", dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", heureDepart="
				+ heureDepart + ", heureArrivee=" + heureArrivee + "]";
	}

}
