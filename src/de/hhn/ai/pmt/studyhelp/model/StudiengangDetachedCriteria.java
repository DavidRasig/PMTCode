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

public class StudiengangDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression studiengangId;
	public final StringExpression name;
	public final IntegerExpression minAnzahlFachsemester;
	public final CollectionExpression studenten;
	public final CollectionExpression lehrveranstaltungen;
	
	public StudiengangDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Studiengang.class, de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria.class);
		studiengangId = new IntegerExpression("studiengangId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		minAnzahlFachsemester = new IntegerExpression("minAnzahlFachsemester", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this.getDetachedCriteria());
	}
	
	public StudiengangDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.StudiengangCriteria.class);
		studiengangId = new IntegerExpression("studiengangId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		minAnzahlFachsemester = new IntegerExpression("minAnzahlFachsemester", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this.getDetachedCriteria());
	}
	
	public StudentDetachedCriteria createStudentenCriteria() {
		return new StudentDetachedCriteria(createCriteria("ORM_studenten"));
	}
	
	public LehrveranstaltungDetachedCriteria createLehrveranstaltungenCriteria() {
		return new LehrveranstaltungDetachedCriteria(createCriteria("ORM_lehrveranstaltungen"));
	}
	
	public Studiengang uniqueStudiengang(PersistentSession session) {
		return (Studiengang) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Studiengang[] listStudiengang(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Studiengang[]) list.toArray(new Studiengang[list.size()]);
	}
}

