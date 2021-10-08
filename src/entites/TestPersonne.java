package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne("Muche", "Truc", new AdressePostale("40", "Impasse des Cypr�s", "29000", "Quimper"));
		Personne p2 = new Personne("Chose", "Machin", new AdressePostale("35", "Boulevard Marronniers", "44000", "Nantes"));
		
		p1.modifierAdressePostale(new AdressePostale("27", "Chemin des Cypr�s", "29000", "Quimper"));
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
