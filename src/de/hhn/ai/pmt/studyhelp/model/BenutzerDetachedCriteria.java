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

public class BenutzerDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final CollectionExpression lernmaterialien;
	public final CollectionExpression foren;
	
	public BenutzerDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Benutzer.class, de.hhn.ai.pmt.studyhelp.model.BenutzerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
	}
	
	public BenutzerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.BenutzerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
	}
	
	public LernmaterialDetachedCriteria createLernmaterialienCriteria() {
		return new LernmaterialDetachedCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumDetachedCriteria createForenCriteria() {
		return new ForumDetachedCriteria(createCriteria("ORM_foren"));
	}
	
	public Benutzer uniqueBenutzer(PersistentSession session) {
		return (Benutzer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Benutzer[] listBenutzer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
	}
}

