package model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Escale")
public class Escale implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5144874838289631787L;

	/*** ---------- Constructor ---------- ***/	
	public Escale() {}	

	/*** ---------- Attributes ---------- ***/
	/* ---------- PK attribute ---------- */		
	@Id	
	private Long id;
	
	@Column	
	private Date heureArrivee;

	@Column	
	private Date heureDepart;		
	
	@ManyToOne(targetEntity=Aeroport.class)	
	@JoinColumn(name="aeroport_id", referencedColumnName="id", nullable=false)	
	private Long aeroportId;
		
	@ManyToOne(targetEntity=Vol.class)	
	@JoinColumn(name="vol_Id", referencedColumnName="id", nullable=false)
	private Long volId;
	
	/*** ---------- Equals & HashCode ---------- ***/		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escale other = (Escale) obj;
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
	
	/*** ----------Other Constructors ---------- ***/	
	public Escale(Long id, Date heureArrivee, Date heureDepart, Long volId, Long aeroportId) {
		setId(id);
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
		this.volId=volId;
		this.aeroportId = aeroportId;
	}

	public Escale(int id, Date heureArrivee, Date heureDepart, Long volId, Long aeroportId) {
		setId((long) id);
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
		this.volId=volId;
		this.aeroportId = aeroportId;
	}

	/*** ---------- Getters & Setters ---------- ***/	
	private void setId(Long value) 					{this.id = value;}	
	public Long getId() 							{return id;}
		
	public void setHeureArrivee(Date value) 		{this.heureArrivee = value;}
	public Date getHeureArrivee() 					{return heureArrivee;}
	
	public void setHeureDepart(Date value)			{this.heureDepart = value;}
	public Date getHeureDepart() 					{return heureDepart;}
	
	public void setAeroportId(Long value) 			{this.aeroportId = value;}
	public Long getAeroportId() 					{return aeroportId;}

	public void setVolId(Long value) 				{this.volId = value;}
	public Long getVolId() 							{return volId;}

	/*** ---------- To String ---------- ***/
	public String toString() {
		return toString(false);
	}
	
	public String toString(boolean idOnly) {
		if (idOnly) {
			return "Escale [id=" + id+ "]";
		}
		else {
			return "Vol [id=" + id 
					+ ", heureArrivee=" + heureArrivee + ", heureDepart=" + heureDepart 
					+ ", AeroportEscaleId=" + aeroportId + ", OriginVolId=" + volId + "]";
		}
	}	
}