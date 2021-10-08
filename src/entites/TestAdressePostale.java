package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale("45", "rue des Pinsons", "35000", "Rennes");
		AdressePostale a2 = new AdressePostale("20", "allée des Mésanges", "75020", "Paris");
		
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
