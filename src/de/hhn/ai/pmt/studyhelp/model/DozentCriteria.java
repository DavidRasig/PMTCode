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

public class DozentCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final CollectionExpression lernmaterialien;
	public final CollectionExpression foren;
	public final CollectionExpression lehrveranstaltungen;
	
	public DozentCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		vorname = new StringExpression("vorname", this);
		nachname = new StringExpression("nachname", this);
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this);
		foren = new CollectionExpression("ORM_foren", this);
		lehrveranstaltungen = new CollectionExpression("ORM_lehrveranstaltungen", this);
	}
	
	public DozentCriteria(PersistentSession session) {
		this(session.createCriteria(Dozent.class));
	}
	
	public DozentCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public LehrveranstaltungCriteria createLehrveranstaltungenCriteria() {
		return new LehrveranstaltungCriteria(createCriteria("ORM_lehrveranstaltungen"));
	}
	
	public LernmaterialCriteria createLernmaterialienCriteria() {
		return new LernmaterialCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumCriteria createForenCriteria() {
		return new ForumCriteria(createCriteria("ORM_foren"));
	}
	
	public Dozent uniqueDozent() {
		return (Dozent) super.uniqueResult();
	}
	
	public Dozent[] listDozent() {
		java.util.List list = super.list();
		return (Dozent[]) list.toArray(new Dozent[list.size()]);
	}
}

