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

public class ForumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression forumId;
	public final StringExpression name;
	public final CollectionExpression benutzer;
	
	public ForumDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Forum.class, de.hhn.ai.pmt.studyhelp.model.ForumCriteria.class);
		forumId = new IntegerExpression("forumId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		benutzer = new CollectionExpression("ORM_benutzer", this.getDetachedCriteria());
	}
	
	public ForumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.ForumCriteria.class);
		forumId = new IntegerExpression("forumId", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		benutzer = new CollectionExpression("ORM_benutzer", this.getDetachedCriteria());
	}
	
	public BenutzerDetachedCriteria createBenutzerCriteria() {
		return new BenutzerDetachedCriteria(createCriteria("ORM_benutzer"));
	}
	
	public Forum uniqueForum(PersistentSession session) {
		return (Forum) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Forum[] listForum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Forum[]) list.toArray(new Forum[list.size()]);
	}
}

