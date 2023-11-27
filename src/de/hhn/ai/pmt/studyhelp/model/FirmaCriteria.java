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

public class FirmaCriteria extends AbstractORMCriteria {
	public final StringExpression name;
	public final CollectionExpression stellenangebote;
	
	public FirmaCriteria(Criteria criteria) {
		super(criteria);
		name = new StringExpression("name", this);
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this);
	}
	
	public FirmaCriteria(PersistentSession session) {
		this(session.createCriteria(Firma.class));
	}
	
	public FirmaCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public StellenangebotCriteria createStellenangeboteCriteria() {
		return new StellenangebotCriteria(createCriteria("ORM_stellenangebote"));
	}
	
	public Firma uniqueFirma() {
		return (Firma) super.uniqueResult();
	}
	
	public Firma[] listFirma() {
		java.util.List list = super.list();
		return (Firma[]) list.toArray(new Firma[list.size()]);
	}
}

