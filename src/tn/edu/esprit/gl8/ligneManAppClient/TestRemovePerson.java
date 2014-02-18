package tn.edu.esprit.gl8.ligneManAppClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.ligneMan.domain.Person;
import tn.edu.esprit.gl8.ligneMan.services.interfaces.LigneManServicesRemote;

public class TestRemovePerson {

	public static void main(String[] args) {
		Context context;
		try {
			context = new InitialContext();
			LigneManServicesRemote ligneManServicesRemote = (LigneManServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.gl8.ligneMan/LigneManServices!tn.edu.esprit.gl8.ligneMan.services.interfaces.LigneManServicesRemote");
			Person person = new Person();
			person.setId(1);
			ligneManServicesRemote.removePersonWithManylignes(person);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
