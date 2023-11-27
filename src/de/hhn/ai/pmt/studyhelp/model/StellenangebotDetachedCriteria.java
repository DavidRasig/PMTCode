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

public class StellenangebotDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression stellenId;
	public final StringExpression firmaId;
	public final AssociationExpression firma;
	public final StringExpression titel;
	public final StringExpression beschreibung;
	public final StringExpression art;
	public final StringExpression standort;
	public final DateExpression bewerbungsfrist;
	public final CollectionExpression studenten;
	
	public StellenangebotDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class, de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria.class);
		stellenId = new IntegerExpression("stellenId", this.getDetachedCriteria());
		firmaId = new StringExpression("firma.name", this.getDetachedCriteria());
		firma = new AssociationExpression("firma", this.getDetachedCriteria());
		titel = new StringExpression("titel", this.getDetachedCriteria());
		beschreibung = new StringExpression("beschreibung", this.getDetachedCriteria());
		art = new StringExpression("art", this.getDetachedCriteria());
		standort = new StringExpression("standort", this.getDetachedCriteria());
		bewerbungsfrist = new DateExpression("bewerbungsfrist", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
	}
	
	public StellenangebotDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.StellenangebotCriteria.class);
		stellenId = new IntegerExpression("stellenId", this.getDetachedCriteria());
		firmaId = new StringExpression("firma.name", this.getDetachedCriteria());
		firma = new AssociationExpression("firma", this.getDetachedCriteria());
		titel = new StringExpression("titel", this.getDetachedCriteria());
		beschreibung = new StringExpression("beschreibung", this.getDetachedCriteria());
		art = new StringExpression("art", this.getDetachedCriteria());
		standort = new StringExpression("standort", this.getDetachedCriteria());
		bewerbungsfrist = new DateExpression("bewerbungsfrist", this.getDetachedCriteria());
		studenten = new CollectionExpression("ORM_studenten", this.getDetachedCriteria());
	}
	
	public FirmaDetachedCriteria createFirmaCriteria() {
		return new FirmaDetachedCriteria(createCriteria("firma"));
	}
	
	public StudentDetachedCriteria createStudentenCriteria() {
		return new StudentDetachedCriteria(createCriteria("ORM_studenten"));
	}
	
	public Stellenangebot uniqueStellenangebot(PersistentSession session) {
		return (Stellenangebot) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Stellenangebot[] listStellenangebot(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Stellenangebot[]) list.toArray(new Stellenangebot[list.size()]);
	}
}

