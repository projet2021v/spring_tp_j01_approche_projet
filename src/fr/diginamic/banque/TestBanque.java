package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		//tp05 et tp06
		System.out.println("tp05 et tp06 :");
		Compte cpte1 = new Compte("123456789", 15000);
		System.out.println(cpte1.toString());
		
		System.out.println("---------------------------------------");
		
		//tp07
		System.out.println("tp07 :");
		Compte[] tableauComptes = new Compte[2];
		
		Compte compteNormal = new Compte("12345", 1111);
		CompteTaux compteTaux = new CompteTaux("6789", 2222, 0.2);
		
		tableauComptes[0] = compteNormal;
		tableauComptes[1] = compteTaux;
		
		for(int i=0; i<tableauComptes.length; i++) {
			System.out.println(tableauComptes[i].toString());
		}
		
	}

}
