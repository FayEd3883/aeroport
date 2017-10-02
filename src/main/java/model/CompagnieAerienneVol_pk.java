package model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class CompagnieAerienneVol_pk implements Serializable {

	private long id_CompagnieAerienne;
	private long id_Vol;
	

	
	public long getId_CompagnieAerienne() {
		return id_CompagnieAerienne;
	}


	public void setId_CompagnieAerienne(long id_CompagnieAerienne) {
		this.id_CompagnieAerienne = id_CompagnieAerienne;
	}


	public long getId_Vol() {
		return id_Vol;
	}


	public void setId_Vol(long id_Vol) {
		this.id_Vol = id_Vol;
	}


	public int hashCode() {
		final long prime = 31;
		int result = 1;
		result = (int) (prime * result + id_CompagnieAerienne);
		result = (int) (prime * result + id_Vol);
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompagnieAerienneVol_pk other = (CompagnieAerienneVol_pk) obj;
		if (id_CompagnieAerienne != other.id_CompagnieAerienne)
			return false;
		if (id_Vol != other.id_Vol)
			return false;
		return true;
	}
	

}