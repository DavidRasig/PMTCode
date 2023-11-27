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

public class StudiengangCriteria extends AbstractORMCriteria {
	public final IntegerExpression studiengangId;
	public final StringExpression name;
	public final IntegerExpression minAnzahlFachsemester;
	public final CollectionExpression studenten;
	public final CollectionExpression lehrveranstaltungen;
	
	public StudiengangCriteria(Criteria criteria) {
		super(criteria);
		studiengangId = new IntegerExpression("studiengangId", this);
		name = new StringExpression("name", this);
		minAnzahlFachsemester = new IntegerExpression("minAnzahlFachsemester", this);
		studenten = new CollectionExpression("ORM_studenten", this);
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this);
	}
	
	public StudiengangCriteria(PersistentSession session) {
		this(session.createCriteria(Studiengang.class));
	}
	
	public StudiengangCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public StudentCriteria createStudentenCriteria() {
		return new StudentCriteria(createCriteria("ORM_studenten"));
	}
	
	public LehrveranstaltungCriteria createLehrveranstaltungenCriteria() {
		return new LehrveranstaltungCriteria(createCriteria("ORM_lehrveranstaltungen"));
	}
	
	public Studiengang uniqueStudiengang() {
		return (Studiengang) super.uniqueResult();
	}
	
	public Studiengang[] listStudiengang() {
		java.util.List list = super.list();
		return (Studiengang[]) list.toArray(new Studiengang[list.size()]);
	}
}

