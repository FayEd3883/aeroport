package model;

import javax.persistence.Embeddable;

@Embeddable
public class ClientMoral extends Client {
	private TitreMoral titre;
	private String siret;

	public ClientMoral() {

	}

	public ClientMoral(long id, String nom, int numeroTel, int numeroFix, String email, TitreMoral titre,
			String siret) {
		super(id, nom, numeroTel, numeroFix, email);
		this.titre = titre;
		this.siret = siret;
	}

	public TitreMoral getTitre() {
		return titre;
	}

	public void setTitre(TitreMoral titre) {
		this.titre = titre;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	
	public String toString() {
		return super.toString()+"ClientMoral [titre=" + titre + ", siret=" + siret + "]";
	}

}
