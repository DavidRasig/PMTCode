/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Eren Ekmekcioglu(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.ai.pmt.studyhelp.model;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LernmaterialDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression materialID;
	public final IntegerExpression lehrveranstaltungId;
	public final AssociationExpression lehrveranstaltung;
	public final StringExpression titel;
	public final StringExpression dateiFormat;
	public final StringExpression dateiName;
	public final StringExpression uploadPfad;
	public final StringExpression downloadPfad;
	public final CollectionExpression benutzer;
	
	public LernmaterialDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class, de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria.class);
		materialID = new IntegerExpression("materialID", this.getDetachedCriteria());
		lehrveranstaltungId = new IntegerExpression("lehrveranstaltung.edvNummer", this.getDetachedCriteria());
		lehrveranstaltung = new AssociationExpression("lehrveranstaltung", this.getDetachedCriteria());
		titel = new StringExpression("titel", this.getDetachedCriteria());
		dateiFormat = new StringExpression("dateiFormat", this.getDetachedCriteria());
		dateiName = new StringExpression("dateiName", this.getDetachedCriteria());
		uploadPfad = new StringExpression("uploadPfad", this.getDetachedCriteria());
		downloadPfad = new StringExpression("downloadPfad", this.getDetachedCriteria());
		benutzer = new CollectionExpression("ORM_benutzer", this.getDetachedCriteria());
	}
	
	public LernmaterialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.LernmaterialCriteria.class);
		materialID = new IntegerExpression("materialID", this.getDetachedCriteria());
		lehrveranstaltungId = new IntegerExpression("lehrveranstaltung.edvNummer", this.getDetachedCriteria());
		lehrveranstaltung = new AssociationExpression("lehrveranstaltung", this.getDetachedCriteria());
		titel = new StringExpression("titel", this.getDetachedCriteria());
		dateiFormat = new StringExpression("dateiFormat", this.getDetachedCriteria());
		dateiName = new StringExpression("dateiName", this.getDetachedCriteria());
		uploadPfad = new StringExpression("uploadPfad", this.getDetachedCriteria());
		downloadPfad = new StringExpression("downloadPfad", this.getDetachedCriteria());
		benutzer = new CollectionExpression("ORM_benutzer", this.getDetachedCriteria());
	}
	
	public LehrveranstaltungDetachedCriteria createLehrveranstaltungCriteria() {
		return new LehrveranstaltungDetachedCriteria(createCriteria("lehrveranstaltung"));
	}
	
	public BenutzerDetachedCriteria createBenutzerCriteria() {
		return new BenutzerDetachedCriteria(createCriteria("ORM_benutzer"));
	}
	
	public Lernmaterial uniqueLernmaterial(PersistentSession session) {
		return (Lernmaterial) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lernmaterial[] listLernmaterial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lernmaterial[]) list.toArray(new Lernmaterial[list.size()]);
	}
}

