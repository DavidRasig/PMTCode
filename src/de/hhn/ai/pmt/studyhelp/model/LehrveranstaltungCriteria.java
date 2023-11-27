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

public class LehrveranstaltungCriteria extends AbstractORMCriteria {
	public final IntegerExpression edvNummer;
	public final IntegerExpression studiengangId;
	public final AssociationExpression studiengang;
	public final StringExpression kursName;
	public final IntegerExpression semester;
	public final CollectionExpression dozenten;
	public final CollectionExpression lernmaterialien;
	
	public LehrveranstaltungCriteria(Criteria criteria) {
		super(criteria);
		edvNummer = new IntegerExpression("edvNummer", this);
		studiengangId = new IntegerExpression("studiengang.studiengangId", this);
		studiengang = new AssociationExpression("studiengang", this);
		kursName = new StringExpression("kursName", this);
		semester = new IntegerExpression("semester", this);
		dozenten = new CollectionExpression("ORM_dozenten", this);
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this);
	}
	
	public LehrveranstaltungCriteria(PersistentSession session) {
		this(session.createCriteria(Lehrveranstaltung.class));
	}
	
	public LehrveranstaltungCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public StudiengangCriteria createStudiengangCriteria() {
		return new StudiengangCriteria(createCriteria("studiengang"));
	}
	
	public DozentCriteria createDozentenCriteria() {
		return new DozentCriteria(createCriteria("ORM_dozenten"));
	}
	
	public LernmaterialCriteria createLernmaterialienCriteria() {
		return new LernmaterialCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public Lehrveranstaltung uniqueLehrveranstaltung() {
		return (Lehrveranstaltung) super.uniqueResult();
	}
	
	public Lehrveranstaltung[] listLehrveranstaltung() {
		java.util.List list = super.list();
		return (Lehrveranstaltung[]) list.toArray(new Lehrveranstaltung[list.size()]);
	}
}

