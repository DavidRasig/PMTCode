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

public class LehrveranstaltungDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression edvNummer;
	public final IntegerExpression studiengangId;
	public final AssociationExpression studiengang;
	public final StringExpression kursName;
	public final IntegerExpression semester;
	public final CollectionExpression dozenten;
	public final CollectionExpression lernmaterialien;
	
	public LehrveranstaltungDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria.class);
		edvNummer = new IntegerExpression("edvNummer", this.getDetachedCriteria());
		studiengangId = new IntegerExpression("studiengang.studiengangId", this.getDetachedCriteria());
		studiengang = new AssociationExpression("studiengang", this.getDetachedCriteria());
		kursName = new StringExpression("kursName", this.getDetachedCriteria());
		semester = new IntegerExpression("semester", this.getDetachedCriteria());
		dozenten = new CollectionExpression("ORM_dozenten", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
	}
	
	public LehrveranstaltungDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungCriteria.class);
		edvNummer = new IntegerExpression("edvNummer", this.getDetachedCriteria());
		studiengangId = new IntegerExpression("studiengang.studiengangId", this.getDetachedCriteria());
		studiengang = new AssociationExpression("studiengang", this.getDetachedCriteria());
		kursName = new StringExpression("kursName", this.getDetachedCriteria());
		semester = new IntegerExpression("semester", this.getDetachedCriteria());
		dozenten = new CollectionExpression("ORM_dozenten", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
	}
	
	public StudiengangDetachedCriteria createStudiengangCriteria() {
		return new StudiengangDetachedCriteria(createCriteria("studiengang"));
	}
	
	public DozentDetachedCriteria createDozentenCriteria() {
		return new DozentDetachedCriteria(createCriteria("ORM_dozenten"));
	}
	
	public LernmaterialDetachedCriteria createLernmaterialienCriteria() {
		return new LernmaterialDetachedCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public Lehrveranstaltung uniqueLehrveranstaltung(PersistentSession session) {
		return (Lehrveranstaltung) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lehrveranstaltung[] listLehrveranstaltung(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lehrveranstaltung[]) list.toArray(new Lehrveranstaltung[list.size()]);
	}
}

