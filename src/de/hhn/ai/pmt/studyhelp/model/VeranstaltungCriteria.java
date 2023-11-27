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

public class VeranstaltungCriteria extends AbstractORMCriteria {
	public final StringExpression name;
	public final StringExpression beschreibung;
	public final StringExpression thema;
	public final StringExpression kursleiter;
	public final CollectionExpression studenten;
	public final CollectionExpression kurstermine;
	
	public VeranstaltungCriteria(Criteria criteria) {
		super(criteria);
		name = new StringExpression("name", this);
		beschreibung = new StringExpression("beschreibung", this);
		thema = new StringExpression("thema", this);
		kursleiter = new StringExpression("kursleiter", this);
		studenten = new CollectionExpression("ORM_studenten", this);
		kurstermine = new CollectionExpression("ORM_kurstermine", this);
	}
	
	public VeranstaltungCriteria(PersistentSession session) {
		this(session.createCriteria(Veranstaltung.class));
	}
	
	public VeranstaltungCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public StudentCriteria createStudentenCriteria() {
		return new StudentCriteria(createCriteria("ORM_studenten"));
	}
	
	public KursterminCriteria createKurstermineCriteria() {
		return new KursterminCriteria(createCriteria("ORM_kurstermine"));
	}
	
	public Veranstaltung uniqueVeranstaltung() {
		return (Veranstaltung) super.uniqueResult();
	}
	
	public Veranstaltung[] listVeranstaltung() {
		java.util.List list = super.list();
		return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
	}
}

