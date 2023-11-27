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

public class BenutzerCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final CollectionExpression lernmaterialien;
	public final CollectionExpression foren;
	
	public BenutzerCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		vorname = new StringExpression("vorname", this);
		nachname = new StringExpression("nachname", this);
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this);
		foren = new CollectionExpression("ORM_foren", this);
	}
	
	public BenutzerCriteria(PersistentSession session) {
		this(session.createCriteria(Benutzer.class));
	}
	
	public BenutzerCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public LernmaterialCriteria createLernmaterialienCriteria() {
		return new LernmaterialCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumCriteria createForenCriteria() {
		return new ForumCriteria(createCriteria("ORM_foren"));
	}
	
	public Benutzer uniqueBenutzer() {
		return (Benutzer) super.uniqueResult();
	}
	
	public Benutzer[] listBenutzer() {
		java.util.List list = super.list();
		return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
	}
}

