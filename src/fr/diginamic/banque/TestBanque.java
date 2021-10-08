package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte cpte1 = new Compte("123456789", 15000);
		
		System.out.println(cpte1.toString());
	}

}
