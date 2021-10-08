package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		//tp08
		System.out.println("tp08 :");
		
		Operation[] tabOperations = new Operation[4];
		
		tabOperations[0] = new Debit("01/10/2021", 10);
		tabOperations[1] = new Debit("02/10/2021", 120);
		tabOperations[2] = new Credit("03/10/2021", 30);
		tabOperations[3] = new Credit("04/10/2021", 50.6);
		
		for(Operation o : tabOperations) {
			System.out.print(o.getType() + " : ");
			System.out.println(o.toString());
		}
		
		System.out.println("Montant global des opérations : " + calculMontantGlobal(tabOperations) + " €");
		

	}
	
	public static double calculMontantGlobal(Operation[] tab) {
		final String CREDIT = "CREDIT";
		final String DEBIT = "DEBIT";
		double montantGlobal = 0;
		
		for(Operation o : tab) {
			if(CREDIT.equals(o.getType())) {
				montantGlobal += o.getMontantOperation();
			} else if (DEBIT.equals(o.getType())) {
				montantGlobal -= o.getMontantOperation();
			}
		}
		
		return montantGlobal;
	}

}
