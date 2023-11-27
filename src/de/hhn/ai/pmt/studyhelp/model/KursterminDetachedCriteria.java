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

public class KursterminDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression titel;
	public final StringExpression veranstaltungId;
	public final AssociationExpression veranstaltung;
	public final DateExpression datum;
	public final IntegerExpression dauer;
	public final StringExpression terminBeschreibung;
	
	public KursterminDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Kurstermin.class, de.hhn.ai.pmt.studyhelp.model.KursterminCriteria.class);
		titel = new StringExpression("titel", this.getDetachedCriteria());
		veranstaltungId = new StringExpression("veranstaltung.name", this.getDetachedCriteria());
		veranstaltung = new AssociationExpression("veranstaltung", this.getDetachedCriteria());
		datum = new DateExpression("datum", this.getDetachedCriteria());
		dauer = new IntegerExpression("dauer", this.getDetachedCriteria());
		terminBeschreibung = new StringExpression("terminBeschreibung", this.getDetachedCriteria());
	}
	
	public KursterminDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.KursterminCriteria.class);
		titel = new StringExpression("titel", this.getDetachedCriteria());
		veranstaltungId = new StringExpression("veranstaltung.name", this.getDetachedCriteria());
		veranstaltung = new AssociationExpression("veranstaltung", this.getDetachedCriteria());
		datum = new DateExpression("datum", this.getDetachedCriteria());
		dauer = new IntegerExpression("dauer", this.getDetachedCriteria());
		terminBeschreibung = new StringExpression("terminBeschreibung", this.getDetachedCriteria());
	}
	
	public VeranstaltungDetachedCriteria createVeranstaltungCriteria() {
		return new VeranstaltungDetachedCriteria(createCriteria("veranstaltung"));
	}
	
	public Kurstermin uniqueKurstermin(PersistentSession session) {
		return (Kurstermin) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Kurstermin[] listKurstermin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Kurstermin[]) list.toArray(new Kurstermin[list.size()]);
	}
}

