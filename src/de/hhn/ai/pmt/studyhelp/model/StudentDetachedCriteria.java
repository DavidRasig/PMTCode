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

public class StudentDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public StudentDetachedCriteria() {
		super(de.hhn.ai.pmt.studyhelp.model.Student.class, de.hhn.ai.pmt.studyhelp.model.StudentCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
		studiengangId = new IntegerExpression("studiengang.studiengangId", this.getDetachedCriteria());
		studiengang = new AssociationExpression("studiengang", this.getDetachedCriteria());
		fachsemester = new IntegerExpression("fachsemester", this.getDetachedCriteria());
		machtMaster = new BooleanExpression("machtMaster", this.getDetachedCriteria());
		veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this.getDetachedCriteria());
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this.getDetachedCriteria());
	}
	
	public StudentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.studyhelp.model.StudentCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		lernmaterialien = new CollectionExpression("ORM_lernmaterialien", this.getDetachedCriteria());
		foren = new CollectionExpression("ORM_foren", this.getDetachedCriteria());
		studiengangId = new IntegerExpression("studiengang.studiengangId", this.getDetachedCriteria());
		studiengang = new AssociationExpression("studiengang", this.getDetachedCriteria());
		fachsemester = new IntegerExpression("fachsemester", this.getDetachedCriteria());
		machtMaster = new BooleanExpression("machtMaster", this.getDetachedCriteria());
		veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this.getDetachedCriteria());
		stellenangebote = new CollectionExpression("ORM_stellenangebote", this.getDetachedCriteria());
	}
	
	public StudiengangDetachedCriteria createStudiengangCriteria() {
		return new StudiengangDetachedCriteria(createCriteria("studiengang"));
	}
	
	public VeranstaltungDetachedCriteria createVeranstaltungenCriteria() {
		return new VeranstaltungDetachedCriteria(createCriteria("ORM_veranstaltungen"));
	}
	
	public StellenangebotDetachedCriteria createStellenangeboteCriteria() {
		return new StellenangebotDetachedCriteria(createCriteria("ORM_stellenangebote"));
	}
	
	public LernmaterialDetachedCriteria createLernmaterialienCriteria() {
		return new LernmaterialDetachedCriteria(createCriteria("ORM_lernmaterialien"));
	}
	
	public ForumDetachedCriteria createForenCriteria() {
		return new ForumDetachedCriteria(createCriteria("ORM_foren"));
	}
	
	public Student uniqueStudent(PersistentSession session) {
		return (Student) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Student[] listStudent(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Student[]) list.toArray(new Student[list.size()]);
	}
}

