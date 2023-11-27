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

public class StellenangebotCriteria extends AbstractORMCriteria {
	public final IntegerExpression stellenId;
	public final StringExpression firmaId;
	public final AssociationExpression firma;
	public final StringExpression titel;
	public final StringExpression beschreibung;
	public final StringExpression art;
	public final StringExpression standort;
	public final DateExpression bewerbungsfrist;
	public final CollectionExpression studenten;
	
	public StellenangebotCriteria(Criteria criteria) {
		super(criteria);
		stellenId = new IntegerExpression("stellenId", this);
		firmaId = new StringExpression("firma.name", this);
		firma = new AssociationExpression("firma", this);
		titel = new StringExpression("titel", this);
		beschreibung = new StringExpression("beschreibung", this);
		art = new StringExpression("art", this);
		standort = new StringExpression("standort", this);
		bewerbungsfrist = new DateExpression("bewerbungsfrist", this);
		studenten = new CollectionExpression("ORM_studenten", this);
	}
	
	public StellenangebotCriteria(PersistentSession session) {
		this(session.createCriteria(Stellenangebot.class));
	}
	
	public StellenangebotCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public FirmaCriteria createFirmaCriteria() {
		return new FirmaCriteria(createCriteria("firma"));
	}
	
	public StudentCriteria createStudentenCriteria() {
		return new StudentCriteria(createCriteria("ORM_studenten"));
	}
	
	public Stellenangebot uniqueStellenangebot() {
		return (Stellenangebot) super.uniqueResult();
	}
	
	public Stellenangebot[] listStellenangebot() {
		java.util.List list = super.list();
		return (Stellenangebot[]) list.toArray(new Stellenangebot[list.size()]);
	}
}

