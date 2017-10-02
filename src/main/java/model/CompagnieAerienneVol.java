package model;

import model.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(CompagnieAerienneVol_pk.class)
public class CompagnieAerienneVol {

	/******************** ATTRIBUT **************/
	private String numero;

	@Id
	private long id_Vol;

	@Id
	@Column(name = "COMPAGNIEAERIENNE_FK", nullable = false)
	private long id_CompagnieAerienne;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "VOL_FK", insertable = false, updatable = false)
	private CompagnieAerienne compagnieAerienne;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "COMPAGNIEAERIENNE_FK", insertable = false, updatable = false)
	private Vol vol;

	/******************** GETTER / SETTER **************/
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
	

	public long getId_Vol() {
		return id_Vol;
	}

	public void setId_Vol(long id_Vol) {
		this.id_Vol = id_Vol;
	}

	public long getId_CompagnieAerienne() {
		return id_CompagnieAerienne;
	}

	public void setId_CompagnieAerienne(long id_CompagnieAerienne) {
		this.id_CompagnieAerienne = id_CompagnieAerienne;
	}

	/******************** CONSTRUCTEUR **************/
	public CompagnieAerienneVol(String numero, CompagnieAerienne compagnieAerienne, Vol vol) {
		
		this.numero = numero;
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}

	public CompagnieAerienneVol() {
	}

	/******************** TOSTRING **************/
	
	public String toString() {
		return "CompagnieAerienneVol [numero=" + numero + ", compagnieAerienne=" + compagnieAerienne + ", vol=" + vol
				+ "]";
	}

}