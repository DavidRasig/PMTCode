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

public class ForumCriteria extends AbstractORMCriteria {
	public final IntegerExpression forumId;
	public final StringExpression name;
	public final CollectionExpression benutzer;
	
	public ForumCriteria(Criteria criteria) {
		super(criteria);
		forumId = new IntegerExpression("forumId", this);
		name = new StringExpression("name", this);
		benutzer = new CollectionExpression("ORM_benutzer", this);
	}
	
	public ForumCriteria(PersistentSession session) {
		this(session.createCriteria(Forum.class));
	}
	
	public ForumCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public BenutzerCriteria createBenutzerCriteria() {
		return new BenutzerCriteria(createCriteria("ORM_benutzer"));
	}
	
	public Forum uniqueForum() {
		return (Forum) super.uniqueResult();
	}
	
	public Forum[] listForum() {
		java.util.List list = super.list();
		return (Forum[]) list.toArray(new Forum[list.size()]);
	}
}

