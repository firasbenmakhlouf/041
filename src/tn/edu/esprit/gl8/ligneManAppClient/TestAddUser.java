package tn.edu.esprit.gl8.ligneManAppClient;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestAddUser {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			PeaceAgreementServicesRemote ligneManServicesRemote = (LigneManServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.ligneMan/LigneManServices!tn.edu.esprit.gl8.ligneMan.services.interfaces.LigneManServicesRemote");
			List<Ligne> lignes = new ArrayList<>();
			Person person = new Person("iheb");

			Ligne ligne = new Ligne(555);
			Ligne ligne2 = new Ligne(666);
			lignes.add(ligne);
			lignes.add(ligne2);
			person.LinkLigneWithPerson(lignes);
			ligneManServicesRemote.addPersonWithManylignes(person);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
