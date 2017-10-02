package model;

import javax.persistence.Embeddable;

@Embeddable
public class ClientEI extends Client {
	private TitreMoral titre;
	private String siret;

	public ClientEI() {

	}

	public ClientEI(long id, String nom, int numeroTel, int numeroFix, String email, TitreMoral titre, String siret) {
		super(id, nom, numeroTel, numeroFix, email);
		this.titre = titre;
		this.siret = siret;
	}

	
	public String toString() {
		return "ClientEI [titre=" + titre + ", siret=" + siret + "]";
	}
	

}
