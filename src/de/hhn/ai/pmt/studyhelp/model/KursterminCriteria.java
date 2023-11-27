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

public class KursterminCriteria extends AbstractORMCriteria {
	public final StringExpression titel;
	public final StringExpression veranstaltungId;
	public final AssociationExpression veranstaltung;
	public final DateExpression datum;
	public final IntegerExpression dauer;
	public final StringExpression terminBeschreibung;
	
	public KursterminCriteria(Criteria criteria) {
		super(criteria);
		titel = new StringExpression("titel", this);
		veranstaltungId = new StringExpression("veranstaltung.name", this);
		veranstaltung = new AssociationExpression("veranstaltung", this);
		datum = new DateExpression("datum", this);
		dauer = new IntegerExpression("dauer", this);
		terminBeschreibung = new StringExpression("terminBeschreibung", this);
	}
	
	public KursterminCriteria(PersistentSession session) {
		this(session.createCriteria(Kurstermin.class));
	}
	
	public KursterminCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public VeranstaltungCriteria createVeranstaltungCriteria() {
		return new VeranstaltungCriteria(createCriteria("veranstaltung"));
	}
	
	public Kurstermin uniqueKurstermin() {
		return (Kurstermin) super.uniqueResult();
	}
	
	public Kurstermin[] listKurstermin() {
		java.util.List list = super.list();
		return (Kurstermin[]) list.toArray(new Kurstermin[list.size()]);
	}
}

