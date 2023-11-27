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

public class FirmaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression name;
	public final CollectionExpression stellenangebote;
	
	public FirmaDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Firma.class, de.hhn.ai.pmt.studyhelp.model.FirmaCriteria.class);
		name = new StringExpression("name", this.getDetachedCriteria());
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this.getDetachedCriteria());
	}
	
	public FirmaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.FirmaCriteria.class);
		name = new StringExpression("name", this.getDetachedCriteria());
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this.getDetachedCriteria());
	}
	
	public StellenangebotDetachedCriteria createStellenangeboteCriteria() {
		return new StellenangebotDetachedCriteria(createCriteria("ORM_stellenangebote"));
	}
	
	public Firma uniqueFirma(PersistentSession session) {
		return (Firma) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Firma[] listFirma(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Firma[]) list.toArray(new Firma[list.size()]);
	}
}

