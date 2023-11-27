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

public class VeranstaltungDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression name;
	public final StringExpression beschreibung;
	public final StringExpression thema;
	public final StringExpression kursleiter;
	public final CollectionExpression studenten;
	public final CollectionExpression kurstermine;
	
	public VeranstaltungDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria.class);
		name = new StringExpression("name", this.getDetachedCriteria());
		beschreibung = new StringExpression("beschreibung", this.getDetachedCriteria());
		thema = new StringExpression("thema", this.getDetachedCriteria());
		kursleiter = new StringExpression("kursleiter", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
		kurstermine = new CollectionExpression("ORM_kurstermine", this.getDetachedCriteria());
	}
	
	public VeranstaltungDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.VeranstaltungCriteria.class);
		name = new StringExpression("name", this.getDetachedCriteria());
		beschreibung = new StringExpression("beschreibung", this.getDetachedCriteria());
		thema = new StringExpression("thema", this.getDetachedCriteria());
		kursleiter = new StringExpression("kursleiter", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
		kurstermine = new CollectionExpression("ORM_kurstermine", this.getDetachedCriteria());
	}
	
	public StudentDetachedCriteria createStudentenCriteria() {
		return new StudentDetachedCriteria(createCriteria("ORM_studenten"));
	}
	
	public KursterminDetachedCriteria createKurstermineCriteria() {
		return new KursterminDetachedCriteria(createCriteria("ORM_kurstermine"));
	}
	
	public Veranstaltung uniqueVeranstaltung(PersistentSession session) {
		return (Veranstaltung) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Veranstaltung[] listVeranstaltung(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
	}
}

