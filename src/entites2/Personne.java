package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	
	public void afficherNomMajusculePrenomMinuscule() {
		System.out.println(this.getNom().toUpperCase() + " " + this.getPrenom());
	}
	
	public void modifierNom(String nouveauNom) {
		this.setNom(nouveauNom);
	}
	
	public void modifierPrenom(String nouveauPrenom) {
		this.setPrenom(nouveauPrenom);
	}
	
	public void modifierAdressePostale(AdressePostale nouvelleAdressePostale) {
		this.setAdressePostale(nouvelleAdressePostale);
	}
	
	public String retournerNom() {
		return this.getNom();
	}
	
	public String retournerPrenom() {
		return this.getPrenom();
	}
	
	public AdressePostale retournerAdresse() {
		return this.getAdressePostale();
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", adressePostale=");
		builder.append(adressePostale);
		builder.append("]");
		return builder.toString();
	}
	
	
}
