/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGruppeAStudyhelpData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.studyhelp.model.Dozent ldehhnaipmtstudyhelpmodelDozent = de.hhn.ai.pmt.studyhelp.model.DozentDAO.loadDozentByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.DozentDAO.save(ldehhnaipmtstudyhelpmodelDozent);
			de.hhn.ai.pmt.studyhelp.model.Forum ldehhnaipmtstudyhelpmodelForum = de.hhn.ai.pmt.studyhelp.model.ForumDAO.loadForumByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.ForumDAO.save(ldehhnaipmtstudyhelpmodelForum);
			de.hhn.ai.pmt.studyhelp.model.Student ldehhnaipmtstudyhelpmodelStudent = de.hhn.ai.pmt.studyhelp.model.StudentDAO.loadStudentByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.StudentDAO.save(ldehhnaipmtstudyhelpmodelStudent);
			de.hhn.ai.pmt.studyhelp.model.Veranstaltung ldehhnaipmtstudyhelpmodelVeranstaltung = de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.loadVeranstaltungByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.save(ldehhnaipmtstudyhelpmodelVeranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Kurstermin ldehhnaipmtstudyhelpmodelKurstermin = de.hhn.ai.pmt.studyhelp.model.KursterminDAO.loadKursterminByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.KursterminDAO.save(ldehhnaipmtstudyhelpmodelKurstermin);
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial ldehhnaipmtstudyhelpmodelLernmaterial = de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.loadLernmaterialByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.save(ldehhnaipmtstudyhelpmodelLernmaterial);
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung ldehhnaipmtstudyhelpmodelLehrveranstaltung = de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.loadLehrveranstaltungByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.save(ldehhnaipmtstudyhelpmodelLehrveranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Studiengang ldehhnaipmtstudyhelpmodelStudiengang = de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.loadStudiengangByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.save(ldehhnaipmtstudyhelpmodelStudiengang);
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot ldehhnaipmtstudyhelpmodelStellenangebot = de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.loadStellenangebotByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.save(ldehhnaipmtstudyhelpmodelStellenangebot);
			de.hhn.ai.pmt.studyhelp.model.Firma ldehhnaipmtstudyhelpmodelFirma = de.hhn.ai.pmt.studyhelp.model.FirmaDAO.loadFirmaByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.studyhelp.model.FirmaDAO.save(ldehhnaipmtstudyhelpmodelFirma);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Dozent by DozentCriteria");
		de.hhn.ai.pmt.studyhelp.model.DozentCriteria ldehhnaipmtstudyhelpmodelDozentCriteria = new de.hhn.ai.pmt.studyhelp.model.DozentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelDozentCriteria.id.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelDozentCriteria.uniqueDozent());
		
		System.out.println("Retrieving Forum by ForumCriteria");
		de.hhn.ai.pmt.studyhelp.model.ForumCriteria ldehhnaipmtstudyhelpmodelForumCriteria = new de.hhn.ai.pmt.studyhelp.model.ForumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelForumCriteria.forumId.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelForumCriteria.uniqueForum());
		
		System.out.println("Retrieving Student by StudentCriteria");
		de.hhn.ai.pmt.studyhelp.model.StudentCriteria ldehhnaipmtstudyhelpmodelStudentCriteria = new de.hhn.ai.pmt.studyhelp.model.StudentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelStudentCriteria.id.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelStudentCriteria.uniqueStudent());
		
		System.out.println("Retrieving Veranstaltung by VeranstaltungCriteria");
		de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria ldehhnaipmtstudyhelpmodelVeranstaltungCriteria = new de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelVeranstaltungCriteria.name.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelVeranstaltungCriteria.uniqueVeranstaltung());
		
		System.out.println("Retrieving Kurstermin by KursterminCriteria");
		de.hhn.ai.pmt.studyhelp.model.KursterminCriteria ldehhnaipmtstudyhelpmodelKursterminCriteria = new de.hhn.ai.pmt.studyhelp.model.KursterminCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelKursterminCriteria.titel.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelKursterminCriteria.uniqueKurstermin());
		
		System.out.println("Retrieving Lernmaterial by LernmaterialCriteria");
		de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria ldehhnaipmtstudyhelpmodelLernmaterialCriteria = new de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelLernmaterialCriteria.materialID.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelLernmaterialCriteria.uniqueLernmaterial());
		
		System.out.println("Retrieving Lehrveranstaltung by LehrveranstaltungCriteria");
		de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria = new de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria.edvNummer.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria.uniqueLehrveranstaltung());
		
		System.out.println("Retrieving Studiengang by StudiengangCriteria");
		de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria ldehhnaipmtstudyhelpmodelStudiengangCriteria = new de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelStudiengangCriteria.studiengangId.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelStudiengangCriteria.uniqueStudiengang());
		
		System.out.println("Retrieving Stellenangebot by StellenangebotCriteria");
		de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria ldehhnaipmtstudyhelpmodelStellenangebotCriteria = new de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelStellenangebotCriteria.stellenId.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelStellenangebotCriteria.uniqueStellenangebot());
		
		System.out.println("Retrieving Firma by FirmaCriteria");
		de.hhn.ai.pmt.studyhelp.model.FirmaCriteria ldehhnaipmtstudyhelpmodelFirmaCriteria = new de.hhn.ai.pmt.studyhelp.model.FirmaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtstudyhelpmodelFirmaCriteria.name.eq();
		System.out.println(ldehhnaipmtstudyhelpmodelFirmaCriteria.uniqueFirma());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGruppeAStudyhelpData retrieveAndUpdateGruppeAStudyhelpData = new RetrieveAndUpdateGruppeAStudyhelpData();
			try {
				retrieveAndUpdateGruppeAStudyhelpData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGruppeAStudyhelpData.retrieveByCriteria();
			}
			finally {
				de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
