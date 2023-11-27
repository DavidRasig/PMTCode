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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Student")
public class Student extends de.hhn.ai.pmt.studyhelp.model.Benutzer implements Serializable {
	public Student() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_STUDENT_VERANSTALTUNGEN) {
			return ORM_veranstaltungen;
		}
		else if (key == ORMConstants.KEY_STUDENT_STELLENANGEBOTE) {
			return ORM_stellenangebote;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_STUDENT_STUDIENGANG) {
			this.studiengang = (de.hhn.ai.pmt.studyhelp.model.Studiengang) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.studyhelp.model.Studiengang.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="StudiengangstudiengangId", referencedColumnName="studiengangId") }, foreignKey=@ForeignKey(name="besucht"))	
	private de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang;
	
	@Column(name="Fachsemester", nullable=true, length=10)	
	private int fachsemester;
	
	@Column(name="MachtMaster", nullable=true, length=1)	
	private boolean machtMaster;
	
	@ManyToMany(mappedBy="ORM_studenten", targetEntity=de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_veranstaltungen = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_studenten", targetEntity=de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_stellenangebote = new java.util.HashSet();
	
	public void setFachsemester(int value) {
		this.fachsemester = value;
	}
	
	public int getFachsemester() {
		return fachsemester;
	}
	
	public void setMachtMaster(boolean value) {
		this.machtMaster = value;
	}
	
	public boolean getMachtMaster() {
		return machtMaster;
	}
	
	public void setStudiengang(de.hhn.ai.pmt.studyhelp.model.Studiengang value) {
		if (studiengang != null) {
			studiengang.studenten.remove(this);
		}
		if (value != null) {
			value.studenten.add(this);
		}
	}
	
	public de.hhn.ai.pmt.studyhelp.model.Studiengang getStudiengang() {
		return studiengang;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Studiengang(de.hhn.ai.pmt.studyhelp.model.Studiengang value) {
		this.studiengang = value;
	}
	
	private de.hhn.ai.pmt.studyhelp.model.Studiengang getORM_Studiengang() {
		return studiengang;
	}
	
	private void setORM_Veranstaltungen(java.util.Set value) {
		this.ORM_veranstaltungen = value;
	}
	
	private java.util.Set getORM_Veranstaltungen() {
		return ORM_veranstaltungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.VeranstaltungSetCollection veranstaltungen = new de.hhn.ai.pmt.studyhelp.model.VeranstaltungSetCollection(this, _ormAdapter, ORMConstants.KEY_STUDENT_VERANSTALTUNGEN, ORMConstants.KEY_VERANSTALTUNG_STUDENTEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Stellenangebote(java.util.Set value) {
		this.ORM_stellenangebote = value;
	}
	
	private java.util.Set getORM_Stellenangebote() {
		return ORM_stellenangebote;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.StellenangebotSetCollection stellenangebote = new de.hhn.ai.pmt.studyhelp.model.StellenangebotSetCollection(this, _ormAdapter, ORMConstants.KEY_STUDENT_STELLENANGEBOTE, ORMConstants.KEY_STELLENANGEBOT_STUDENTEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
