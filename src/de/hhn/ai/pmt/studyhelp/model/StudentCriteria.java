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

public class StudentCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final CollectionExpression lernmaterialien;
	public final CollectionExpression foren;
	public final IntegerExpression studiengangId;
	public final AssociationExpression studiengang;
	public final IntegerExpression fachsemester;
	public final BooleanExpression machtMaster;
	public final CollectionExpression veranstaltungen;
	public final CollectionExpression stellenangebote;
	
	public StudentCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		vorname = new StringExpression("vorname", this);
		nachname = new StringExpression("nachname", this);
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this);
		foren = new CollectionExpression("ORM_foren", this);
		studiengangId = new IntegerExpression("studiengang.studiengangId", this);
		studiengang = new AssociationExpression("studiengang", this);
		fachsemester = new IntegerExpression("fachsemester", this);
		machtMaster = new BooleanExpression("machtMaster", this);
		veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this);
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this);
	}
	
	public StudentCriteria(PersistentSession session) {
		this(session.createCriteria(Student.class));
	}
	
	public StudentCriteria() throws PersistentException {
		this(GruppeAStudyhelpPersistentManager.instance().getSession());
	}
	
	public StudiengangCriteria createStudiengangCriteria() {
		return new StudiengangCriteria(createCriteria("studiengang"));
	}
	
	public VeranstaltungCriteria createVeranstaltungenCriteria() {
		return new VeranstaltungCriteria(createCriteria("ORM_veranstaltungen"));
	}
	
	public StellenangebotCriteria createStellenangeboteCriteria() {
		return new StellenangebotCriteria(createCriteria("ORM_stellenangebote"));
	}
	
	public LernmaterialCriteria createLernmaterialienCriteria() {
		return new LernmaterialCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumCriteria createForenCriteria() {
		return new ForumCriteria(createCriteria("ORM_foren"));
	}
	
	public Student uniqueStudent() {
		return (Student) super.uniqueResult();
	}
	
	public Student[] listStudent() {
		java.util.List list = super.list();
		return (Student[]) list.toArray(new Student[list.size()]);
	}
}

