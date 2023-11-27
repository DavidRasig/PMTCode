/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateGruppeAStudyhelpData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Studiengang(Name, MinAnzahlFachsemester) VALUES ('AI', 7)");
					statement.executeUpdate("INSERT INTO Studiengang(Name, MinAnzahlFachsemester) VALUES ('SE', 7)");
					statement.executeUpdate("INSERT INTO Studiengang(Name, MinAnzahlFachsemester) VALUES ('MI', 7)");
					statement.executeUpdate("INSERT INTO Forum(Name) VALUES ('PMTSWE AI')");
					statement.executeUpdate("INSERT INTO Veranstaltung(name, Beschreibung, Thema, Kursleiter) VALUES ('1', 'Tutorium', 'PMSTWE', '')");
					statement.executeUpdate("INSERT INTO Kurstermin(ID, Veranstaltungname, Datum, Dauer, TerminBeschreibung) VALUES ('PMSWE', '1', '23.11.2023', 120, 'Vorlesung')");
					statement.executeUpdate("INSERT INTO Lehrveranstaltung(StudiengangstudiengangId, KursName, Semester) VALUES (1, 'TSWE', 3)");
					statement.executeUpdate("INSERT INTO Lehrveranstaltung(StudiengangstudiengangId, KursName, Semester) VALUES (2, 'PMuT', 3)");
					statement.executeUpdate("INSERT INTO Lehrveranstaltung(StudiengangstudiengangId, KursName, Semester) VALUES (3, 'PROG1', 1)");
					statement.executeUpdate("INSERT INTO Benutzer(Id, StudiengangstudiengangId, Vorname, Nachname, Fachsemester, MachtMaster, Discriminator) VALUES (216071, null, 'Simon', 'Widmann', 3, 0, 'Student')");
					statement.executeUpdate("INSERT INTO Benutzer(Id, StudiengangstudiengangId, Vorname, Nachname, Fachsemester, MachtMaster, Discriminator) VALUES (12345678, null, 'Geralt', 'Permantier', 0, 0, 'Dozent')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('Bosch')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('Audi')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('Porsche')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('Siemens')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('Telekom')");
					statement.executeUpdate("INSERT INTO Firma(name) VALUES ('STACK IT')");
					statement.executeUpdate("INSERT INTO Stellenangebot(Firmaname, Titel, Beschreibung, Art, Standort, Bewerbungsfrist) VALUES ('Bosch', 'Software Engineer', 'lorem impsum', 'Praktikum', 'Heilbronn', '08.08.2024')");
					statement.executeUpdate("INSERT INTO Stellenangebot(Firmaname, Titel, Beschreibung, Art, Standort, Bewerbungsfrist) VALUES ('Audi', 'Informatik', 'Lorem Ipsum vitae', 'Werkstudent', 'Stuttgart', '01.01.2024')");
					statement.executeUpdate("INSERT INTO Stellenangebot(Firmaname, Titel, Beschreibung, Art, Standort, Bewerbungsfrist) VALUES ('Siemens', 'Wirtschaftsinformatiker', 'Lorem Ipsum', 'Aushilfe', 'München', '05.02.2024')");
					statement.executeUpdate("INSERT INTO Stellenangebot(Firmaname, Titel, Beschreibung, Art, Standort, Bewerbungsfrist) VALUES ('STACK IT', 'Werkstudent', 'Suche Werkstudent', 'Werkstudentenstelle', 'Heilbronn', '31.12.2023')");
					statement.executeUpdate("INSERT INTO Benutzer_Forum(BenutzerId, ForumID) VALUES (216071, 1)");
					statement.executeUpdate("INSERT INTO Benutzer_Veranstaltung(BenutzerId, VeranstaltungID) VALUES (216071, '1')");
					statement.executeUpdate("INSERT INTO Lernmaterial(LehrveranstaltungedvNummer, Titel, DateiFormat, DateiName, UploadPfad, DownloadPfad) VALUES (1, 'Klasssendiagramme', 'PDF', 'VorlesungsmaterialienKlassenDiagramme', 'AI3/PMTSWE', '/Downloads')");
					statement.executeUpdate("INSERT INTO Lernmaterial(LehrveranstaltungedvNummer, Titel, DateiFormat, DateiName, UploadPfad, DownloadPfad) VALUES (1, 'Zusammenfassung', 'PDF', 'ZusammenfassungPMTSWE', 'AI3/PMTSWE', '/Downloads')");
					statement.executeUpdate("INSERT INTO Benutzer_Stellenangebot(BenutzerId, StellenangebotID) VALUES (12345678, 0)");
					statement.executeUpdate("INSERT INTO Lernmaterial_Benutzer(LernmaterialienID, BenutzerId) VALUES (0, 216071)");
					statement.executeUpdate("INSERT INTO Benutzer_Lehrveranstaltung(BenutzerId, LehrveranstaltungID) VALUES (12345678, 1)");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = de.hhn.ai.pmt.studyhelp.model.GruppeAStudyhelpPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.studyhelp.model.Dozent ldehhnaipmtstudyhelpmodelDozent = de.hhn.ai.pmt.studyhelp.model.DozentDAO.createDozent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lehrveranstaltungen
			de.hhn.ai.pmt.studyhelp.model.DozentDAO.save(ldehhnaipmtstudyhelpmodelDozent);
			de.hhn.ai.pmt.studyhelp.model.Forum ldehhnaipmtstudyhelpmodelForum = de.hhn.ai.pmt.studyhelp.model.ForumDAO.createForum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : benutzer
			de.hhn.ai.pmt.studyhelp.model.ForumDAO.save(ldehhnaipmtstudyhelpmodelForum);
			de.hhn.ai.pmt.studyhelp.model.Student ldehhnaipmtstudyhelpmodelStudent = de.hhn.ai.pmt.studyhelp.model.StudentDAO.createStudent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : stellenangebote, veranstaltungen
			de.hhn.ai.pmt.studyhelp.model.StudentDAO.save(ldehhnaipmtstudyhelpmodelStudent);
			de.hhn.ai.pmt.studyhelp.model.Veranstaltung ldehhnaipmtstudyhelpmodelVeranstaltung = de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.createVeranstaltung();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : kurstermine, studenten, name
			de.hhn.ai.pmt.studyhelp.model.VeranstaltungDAO.save(ldehhnaipmtstudyhelpmodelVeranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Kurstermin ldehhnaipmtstudyhelpmodelKurstermin = de.hhn.ai.pmt.studyhelp.model.KursterminDAO.createKurstermin();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dauer, veranstaltung, titel
			de.hhn.ai.pmt.studyhelp.model.KursterminDAO.save(ldehhnaipmtstudyhelpmodelKurstermin);
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial ldehhnaipmtstudyhelpmodelLernmaterial = de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.createLernmaterial();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : benutzer, lehrveranstaltung
			de.hhn.ai.pmt.studyhelp.model.LernmaterialDAO.save(ldehhnaipmtstudyhelpmodelLernmaterial);
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung ldehhnaipmtstudyhelpmodelLehrveranstaltung = de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.createLehrveranstaltung();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lernmaterialien, dozenten, semester, studiengang
			de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungDAO.save(ldehhnaipmtstudyhelpmodelLehrveranstaltung);
			de.hhn.ai.pmt.studyhelp.model.Studiengang ldehhnaipmtstudyhelpmodelStudiengang = de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.createStudiengang();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lehrveranstaltungen, minAnzahlFachsemester
			de.hhn.ai.pmt.studyhelp.model.StudiengangDAO.save(ldehhnaipmtstudyhelpmodelStudiengang);
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot ldehhnaipmtstudyhelpmodelStellenangebot = de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.createStellenangebot();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : studenten, firma
			de.hhn.ai.pmt.studyhelp.model.StellenangebotDAO.save(ldehhnaipmtstudyhelpmodelStellenangebot);
			de.hhn.ai.pmt.studyhelp.model.Firma ldehhnaipmtstudyhelpmodelFirma = de.hhn.ai.pmt.studyhelp.model.FirmaDAO.createFirma();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : stellenangebote, name
			de.hhn.ai.pmt.studyhelp.model.FirmaDAO.save(ldehhnaipmtstudyhelpmodelFirma);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGruppeAStudyhelpData createGruppeAStudyhelpData = new CreateGruppeAStudyhelpData();
			try {
				createGruppeAStudyhelpData.createTestData();
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
