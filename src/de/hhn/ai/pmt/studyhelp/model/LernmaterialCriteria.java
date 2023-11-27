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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LernmaterialCriteria extends AbstractORMCriteria {
	public final IntegerExpression materialID;
	public final IntegerExpression lehrveranstaltungId;
	public final AssociationExpression lehrveranstaltung;
	public final StringExpression titel;
	public final StringExpression dateiFormat;
	public final StringExpression dateiName;
	public final StringExpression uploadPfad;
	public final StringExpression downloadPfad;
	public final CollectionExpression benutzer;
	
	public LernmaterialCriteria(Criteria criteria) {
		super(criteria);
		materialID = new IntegerExpression("materialID", this);
		lehrveranstaltungId = new IntegerExpression("lehrveranstaltung.edvNummer", this);
		lehrveranstaltung = new AssociationExpression("lehrveranstaltung", this);
		titel = new StringExpression("titel", this);
		dateiFormat = new StringExpression("dateiFormat", this);
		dateiName = new StringExpression("dateiName", this);
		uploadPfad = new StringExpression("uploadPfad", this);
		downloadPfad = new StringExpression("downloadPfad", this);
		benutzer = new CollectionExpression("ORM_benutzer", this);
	}
	
	public LernmaterialCriteria(PersistentSession session) {
		this(session.createCriteria(Lernmaterial.class));
	}
	
	public LernmaterialCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public LehrveranstaltungCriteria createLehrveranstaltungCriteria() {
		return new LehrveranstaltungCriteria(createCriteria("lehrveranstaltung"));
	}
	
	public BenutzerCriteria createBenutzerCriteria() {
		return new BenutzerCriteria(createCriteria("ORM_benutzer"));
	}
	
	public Lernmaterial uniqueLernmaterial() {
		return (Lernmaterial) super.uniqueResult();
	}
	
	public Lernmaterial[] listLernmaterial() {
		java.util.List list = super.list();
		return (Lernmaterial[]) list.toArray(new Lernmaterial[list.size()]);
	}
}

