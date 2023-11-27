/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListGruppeAStudyhelpData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Dozent...");
		de.hhn.ai.pmt.studyhelp.model.Dozent[] dehhnaipmtstudyhelpmodelDozents = de.hhn.ai.pmt.studyhelp.model.DozentDAO.listDozentByQuery(null, null);
		int length = Math.min(dehhnaipmtstudyhelpmodelDozents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelDozents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Forum...");
		de.hhn.ai.pmt.studyhelp.model.Forum[] dehhnaipmtstudyhelpmodelForums = de.hhn.ai.pmt.studyhelp.model.ForumDAO.listForumByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelForums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelForums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Student...");
		de.hhn.ai.pmt.studyhelp.model.Student[] dehhnaipmtstudyhelpmodelStudents = de.hhn.ai.pmt.studyhelp.model.StudentDAO.listStudentByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelStudents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelStudents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Veranstaltung...");
		de.hhn.ai.pmt.studyhelp.model.Veranstaltung[] dehhnaipmtstudyhelpmodelVeranstaltungs = de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.listVeranstaltungByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelVeranstaltungs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelVeranstaltungs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Kurstermin...");
		de.hhn.ai.pmt.studyhelp.model.Kurstermin[] dehhnaipmtstudyhelpmodelKurstermins = de.hhn.ai.pmt.studyhelp.model.KursterminDAO.listKursterminByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelKurstermins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelKurstermins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lernmaterial...");
		de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] dehhnaipmtstudyhelpmodelLernmaterials = de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.listLernmaterialByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelLernmaterials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelLernmaterials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lehrveranstaltung...");
		de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] dehhnaipmtstudyhelpmodelLehrveranstaltungs = de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.listLehrveranstaltungByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelLehrveranstaltungs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelLehrveranstaltungs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Studiengang...");
		de.hhn.ai.pmt.studyhelp.model.Studiengang[] dehhnaipmtstudyhelpmodelStudiengangs = de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.listStudiengangByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelStudiengangs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelStudiengangs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Stellenangebot...");
		de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] dehhnaipmtstudyhelpmodelStellenangebots = de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.listStellenangebotByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelStellenangebots.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelStellenangebots[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Firma...");
		de.hhn.ai.pmt.studyhelp.model.Firma[] dehhnaipmtstudyhelpmodelFirmas = de.hhn.ai.pmt.studyhelp.model.FirmaDAO.listFirmaByQuery(null, null);
		length = Math.min(dehhnaipmtstudyhelpmodelFirmas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtstudyhelpmodelFirmas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Dozent by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.DozentCriteria ldehhnaipmtstudyhelpmodelDozentCriteria = new de.hhn.ai.pmt.studyhelp.model.DozentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelDozentCriteria.id.eq();
		ldehhnaipmtstudyhelpmodelDozentCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Dozent[] dehhnaipmtstudyhelpmodelDozents = ldehhnaipmtstudyhelpmodelDozentCriteria.listDozent();
		int length =dehhnaipmtstudyhelpmodelDozents== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelDozents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelDozents[i]);
		}
		System.out.println(length + " Dozent record(s) retrieved."); 
		
		System.out.println("Listing Forum by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.ForumCriteria ldehhnaipmtstudyhelpmodelForumCriteria = new de.hhn.ai.pmt.studyhelp.model.ForumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelForumCriteria.forumId.eq();
		ldehhnaipmtstudyhelpmodelForumCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Forum[] dehhnaipmtstudyhelpmodelForums = ldehhnaipmtstudyhelpmodelForumCriteria.listForum();
		length =dehhnaipmtstudyhelpmodelForums== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelForums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelForums[i]);
		}
		System.out.println(length + " Forum record(s) retrieved."); 
		
		System.out.println("Listing Student by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.StudentCriteria ldehhnaipmtstudyhelpmodelStudentCriteria = new de.hhn.ai.pmt.studyhelp.model.StudentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelStudentCriteria.id.eq();
		ldehhnaipmtstudyhelpmodelStudentCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Student[] dehhnaipmtstudyhelpmodelStudents = ldehhnaipmtstudyhelpmodelStudentCriteria.listStudent();
		length =dehhnaipmtstudyhelpmodelStudents== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelStudents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelStudents[i]);
		}
		System.out.println(length + " Student record(s) retrieved."); 
		
		System.out.println("Listing Veranstaltung by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria ldehhnaipmtstudyhelpmodelVeranstaltungCriteria = new de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelVeranstaltungCriteria.name.eq();
		ldehhnaipmtstudyhelpmodelVeranstaltungCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Veranstaltung[] dehhnaipmtstudyhelpmodelVeranstaltungs = ldehhnaipmtstudyhelpmodelVeranstaltungCriteria.listVeranstaltung();
		length =dehhnaipmtstudyhelpmodelVeranstaltungs== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelVeranstaltungs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelVeranstaltungs[i]);
		}
		System.out.println(length + " Veranstaltung record(s) retrieved."); 
		
		System.out.println("Listing Kurstermin by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.KursterminCriteria ldehhnaipmtstudyhelpmodelKursterminCriteria = new de.hhn.ai.pmt.studyhelp.model.KursterminCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelKursterminCriteria.titel.eq();
		ldehhnaipmtstudyhelpmodelKursterminCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Kurstermin[] dehhnaipmtstudyhelpmodelKurstermins = ldehhnaipmtstudyhelpmodelKursterminCriteria.listKurstermin();
		length =dehhnaipmtstudyhelpmodelKurstermins== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelKurstermins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelKurstermins[i]);
		}
		System.out.println(length + " Kurstermin record(s) retrieved."); 
		
		System.out.println("Listing Lernmaterial by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria ldehhnaipmtstudyhelpmodelLernmaterialCriteria = new de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelLernmaterialCriteria.materialID.eq();
		ldehhnaipmtstudyhelpmodelLernmaterialCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] dehhnaipmtstudyhelpmodelLernmaterials = ldehhnaipmtstudyhelpmodelLernmaterialCriteria.listLernmaterial();
		length =dehhnaipmtstudyhelpmodelLernmaterials== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelLernmaterials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelLernmaterials[i]);
		}
		System.out.println(length + " Lernmaterial record(s) retrieved."); 
		
		System.out.println("Listing Lehrveranstaltung by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria = new de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria.edvNummer.eq();
		ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] dehhnaipmtstudyhelpmodelLehrveranstaltungs = ldehhnaipmtstudyhelpmodelLehrveranstaltungCriteria.listLehrveranstaltung();
		length =dehhnaipmtstudyhelpmodelLehrveranstaltungs== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelLehrveranstaltungs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelLehrveranstaltungs[i]);
		}
		System.out.println(length + " Lehrveranstaltung record(s) retrieved."); 
		
		System.out.println("Listing Studiengang by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria ldehhnaipmtstudyhelpmodelStudiengangCriteria = new de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelStudiengangCriteria.studiengangId.eq();
		ldehhnaipmtstudyhelpmodelStudiengangCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Studiengang[] dehhnaipmtstudyhelpmodelStudiengangs = ldehhnaipmtstudyhelpmodelStudiengangCriteria.listStudiengang();
		length =dehhnaipmtstudyhelpmodelStudiengangs== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelStudiengangs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelStudiengangs[i]);
		}
		System.out.println(length + " Studiengang record(s) retrieved."); 
		
		System.out.println("Listing Stellenangebot by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria ldehhnaipmtstudyhelpmodelStellenangebotCriteria = new de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelStellenangebotCriteria.stellenId.eq();
		ldehhnaipmtstudyhelpmodelStellenangebotCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] dehhnaipmtstudyhelpmodelStellenangebots = ldehhnaipmtstudyhelpmodelStellenangebotCriteria.listStellenangebot();
		length =dehhnaipmtstudyhelpmodelStellenangebots== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelStellenangebots.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelStellenangebots[i]);
		}
		System.out.println(length + " Stellenangebot record(s) retrieved."); 
		
		System.out.println("Listing Firma by Criteria...");
		de.hhn.ai.pmt.studyhelp.model.FirmaCriteria ldehhnaipmtstudyhelpmodelFirmaCriteria = new de.hhn.ai.pmt.studyhelp.model.FirmaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtstudyhelpmodelFirmaCriteria.name.eq();
		ldehhnaipmtstudyhelpmodelFirmaCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.studyhelp.model.Firma[] dehhnaipmtstudyhelpmodelFirmas = ldehhnaipmtstudyhelpmodelFirmaCriteria.listFirma();
		length =dehhnaipmtstudyhelpmodelFirmas== null ? 0 : Math.min(dehhnaipmtstudyhelpmodelFirmas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtstudyhelpmodelFirmas[i]);
		}
		System.out.println(length + " Firma record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGruppeAStudyhelpData listGruppeAStudyhelpData = new ListGruppeAStudyhelpData();
			try {
				listGruppeAStudyhelpData.listTestData();
				//listGruppeAStudyhelpData.listByCriteria();
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
