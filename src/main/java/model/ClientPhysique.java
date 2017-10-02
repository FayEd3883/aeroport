package model;

import javax.persistence.Embeddable;

@Embeddable
public class ClientPhysique extends Client {
	private TitrePhysique titre;
	private String prenom;
	
	public ClientPhysique(long id, String nom, int numeroTel, int numeroFix, String email, TitrePhysique titre,
			String prenom) {
		super(id, nom, numeroTel, numeroFix, email);
		this.titre = titre;
		this.prenom = prenom;
	}
	public ClientPhysique() {
		
	}
	public TitrePhysique getTitre() {
		return titre;
	}
	public void setTitre(TitrePhysique titre) {
		this.titre = titre;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString() {
		return super.toString()+"ClientPhysique [titre=" + titre + ", prenom=" + prenom + "]";
	}
	
	

	
}
