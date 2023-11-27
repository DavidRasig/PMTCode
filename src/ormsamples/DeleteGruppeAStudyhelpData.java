/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteGruppeAStudyhelpData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.studyhelp.model.Dozent ldehhnaipmtstudyhelpmodelDozent = de.hhn.ai.pmt.studyhelp.model.DozentDAO.loadDozentByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.DozentDAO.delete(ldehhnaipmtstudyhelpmodelDozent);
			de.hhn.ai.pmt.studyhelp.model.Forum ldehhnaipmtstudyhelpmodelForum = de.hhn.ai.pmt.studyhelp.model.ForumDAO.loadForumByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.ForumDAO.delete(ldehhnaipmtstudyhelpmodelForum);
			de.hhn.ai.pmt.studyhelp.model.Student ldehhnaipmtstudyhelpmodelStudent = de.hhn.ai.pmt.studyhelp.model.StudentDAO.loadStudentByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.StudentDAO.delete(ldehhnaipmtstudyhelpmodelStudent);
			de.hhn.ai.pmt.studyhelp.model.Veranstaltung ldehhnaipmtstudyhelpmodelVeranstaltung = de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.loadVeranstaltungByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.delete(ldehhnaipmtstudyhelpmodelVeranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Kurstermin ldehhnaipmtstudyhelpmodelKurstermin = de.hhn.ai.pmt.studyhelp.model.KursterminDAO.loadKursterminByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.KursterminDAO.delete(ldehhnaipmtstudyhelpmodelKurstermin);
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial ldehhnaipmtstudyhelpmodelLernmaterial = de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.loadLernmaterialByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.delete(ldehhnaipmtstudyhelpmodelLernmaterial);
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung ldehhnaipmtstudyhelpmodelLehrveranstaltung = de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.loadLehrveranstaltungByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.delete(ldehhnaipmtstudyhelpmodelLehrveranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Studiengang ldehhnaipmtstudyhelpmodelStudiengang = de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.loadStudiengangByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.delete(ldehhnaipmtstudyhelpmodelStudiengang);
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot ldehhnaipmtstudyhelpmodelStellenangebot = de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.loadStellenangebotByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.delete(ldehhnaipmtstudyhelpmodelStellenangebot);
			de.hhn.ai.pmt.studyhelp.model.Firma ldehhnaipmtstudyhelpmodelFirma = de.hhn.ai.pmt.studyhelp.model.FirmaDAO.loadFirmaByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.studyhelp.model.FirmaDAO.delete(ldehhnaipmtstudyhelpmodelFirma);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGruppeAStudyhelpData deleteGruppeAStudyhelpData = new DeleteGruppeAStudyhelpData();
			try {
				deleteGruppeAStudyhelpData.deleteTestData();
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
