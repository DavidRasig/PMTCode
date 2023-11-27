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

public class DozentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final CollectionExpression lernmaterialien;
	public final CollectionExpression foren;
	public final CollectionExpression lehrveranstaltungen;
	
	public DozentDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Dozent.class, de.hhn.ai.pmt.studyhelp.model.DozentCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this.getDetachedCriteria());
	}
	
	public DozentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.DozentCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this.getDetachedCriteria());
	}
	
	public LehrveranstaltungDetachedCriteria createLehrveranstaltungenCriteria() {
		return new LehrveranstaltungDetachedCriteria(createCriteria("ORM_lehrveranstaltungen"));
	}
	
	public LernmaterialDetachedCriteria createLernmaterialienCriteria() {
		return new LernmaterialDetachedCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumDetachedCriteria createForenCriteria() {
		return new ForumDetachedCriteria(createCriteria("ORM_foren"));
	}
	
	public Dozent uniqueDozent(PersistentSession session) {
		return (Dozent) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Dozent[] listDozent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Dozent[]) list.toArray(new Dozent[list.size()]);
	}
}

