package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ville")
public class Ville implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8068253358405245028L;

	/*** ---------- Constructor ---------- ***/
	public Ville() {}
	
	/*** ---------- Attributes ---------- ***/
	/* ---------- PK attribute ---------- */	
	@Id
	private Long id;
	
	@Column	
	private String nom;
	
	@ManyToOne(targetEntity=Aeroport.class)	
	@JoinColumn(name="aeroport_id", referencedColumnName="id", nullable=false)
	private Long aeroportId;
	
	/*** ---------- Equals & HashCode ---------- ***/		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getId() == null ? 0 : getId().hashCode());
		return hashcode;
	}	

	/*** ---------- Other constructors ---------- ***/	
	public Ville(Long id, String nom) {setId(id);this.nom = nom;}
	public Ville(int id, String nom)  {setId((long) id);this.nom = nom;}

	/*** ---------- Getters & Setters ---------- ***/		
	private void setId(Long value) 		{this.id = value;}
	public Long getId() 				{return id;}	
		
	public void setNom(String value) 	{this.nom = value;}	
	public String getNom() 				{return nom;}
		
	/*** ---------- To String ---------- ***/
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return "Ville [id=" + id+ "]";
		}
		else return "Ville [id=" + id + ", nom=" + nom + "]";
	}
}