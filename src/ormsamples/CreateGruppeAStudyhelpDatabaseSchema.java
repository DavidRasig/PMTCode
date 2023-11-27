/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateGruppeAStudyhelpDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance());
			de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
