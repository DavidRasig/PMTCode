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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Studiengang")
public class Studiengang implements Serializable {
	public Studiengang() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_STUDIENGANG_STUDENTEN) {
			return ORM_studenten;
		}
		else if (key == ORMConstants.KEY_STUDIENGANG_LEHRVERANSTALTUNGEN) {
			return ORM_lehrveranstaltungen;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="studiengangId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_STUDYHELP_MODEL_STUDIENGANG_STUDIENGANGID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_STUDYHELP_MODEL_STUDIENGANG_STUDIENGANGID_GENERATOR", strategy="native")	
	private int studiengangId;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="MinAnzahlFachsemester", nullable=false, length=10)	
	private int minAnzahlFachsemester;
	
	@OneToMany(mappedBy="studiengang", targetEntity=de.hhn.ai.pmt.studyhelp.model.Student.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_studenten = new java.util.HashSet();
	
	@OneToMany(mappedBy="studiengang", targetEntity=de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lehrveranstaltungen = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMinAnzahlFachsemester(int value) {
		this.minAnzahlFachsemester = value;
	}
	
	public int getMinAnzahlFachsemester() {
		return minAnzahlFachsemester;
	}
	
	private void setStudiengangId(int value) {
		this.studiengangId = value;
	}
	
	public int getStudiengangId() {
		return studiengangId;
	}
	
	public int getORMID() {
		return getStudiengangId();
	}
	
	private void setORM_Studenten(java.util.Set value) {
		this.ORM_studenten = value;
	}
	
	private java.util.Set getORM_Studenten() {
		return ORM_studenten;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.StudentSetCollection studenten = new de.hhn.ai.pmt.studyhelp.model.StudentSetCollection(this, _ormAdapter, ORMConstants.KEY_STUDIENGANG_STUDENTEN, ORMConstants.KEY_STUDENT_STUDIENGANG, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Lehrveranstaltungen(java.util.Set value) {
		this.ORM_lehrveranstaltungen = value;
	}
	
	private java.util.Set getORM_Lehrveranstaltungen() {
		return ORM_lehrveranstaltungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungSetCollection lehrveranstaltungen = new de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungSetCollection(this, _ormAdapter, ORMConstants.KEY_STUDIENGANG_LEHRVERANSTALTUNGEN, ORMConstants.KEY_LEHRVERANSTALTUNG_STUDIENGANG, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getStudiengangId());
	}
	
}
