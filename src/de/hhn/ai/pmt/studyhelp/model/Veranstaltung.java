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
@Table(name="Veranstaltung")
public class Veranstaltung implements Serializable {
	public Veranstaltung() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Veranstaltung))
			return false;
		Veranstaltung veranstaltung = (Veranstaltung)aObj;
		if ((getName() != null && !getName().equals(veranstaltung.getName())) || (getName() == null && veranstaltung.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_VERANSTALTUNG_STUDENTEN) {
			return ORM_studenten;
		}
		else if (key == ORMConstants.KEY_VERANSTALTUNG_KURSTERMINE) {
			return ORM_kurstermine;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="name", nullable=false, length=255)	
	@Id	
	private String name;
	
	@Column(name="Beschreibung", nullable=true, length=255)	
	private String beschreibung;
	
	@Column(name="Thema", nullable=true, length=255)	
	private String thema;
	
	@Column(name="Kursleiter", nullable=true, length=255)	
	private String kursleiter;
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.studyhelp.model.Student.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Benutzer_Veranstaltung", joinColumns={ @JoinColumn(name="VeranstaltungID") }, inverseJoinColumns={ @JoinColumn(name="BenutzerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_studenten = new java.util.HashSet();
	
	@OneToMany(mappedBy="veranstaltung", orphanRemoval=true, targetEntity=de.hhn.ai.pmt.studyhelp.model.Kurstermin.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_kurstermine = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setBeschreibung(String value) {
		this.beschreibung = value;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setThema(String value) {
		this.thema = value;
	}
	
	public String getThema() {
		return thema;
	}
	
	public void setKursleiter(String value) {
		this.kursleiter = value;
	}
	
	public String getKursleiter() {
		return kursleiter;
	}
	
	private void setORM_Studenten(java.util.Set value) {
		this.ORM_studenten = value;
	}
	
	private java.util.Set getORM_Studenten() {
		return ORM_studenten;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.StudentSetCollection studenten = new de.hhn.ai.pmt.studyhelp.model.StudentSetCollection(this, _ormAdapter, ORMConstants.KEY_VERANSTALTUNG_STUDENTEN, ORMConstants.KEY_STUDENT_VERANSTALTUNGEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Kurstermine(java.util.Set value) {
		this.ORM_kurstermine = value;
	}
	
	private java.util.Set getORM_Kurstermine() {
		return ORM_kurstermine;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.KursterminSetCollection kurstermine = new de.hhn.ai.pmt.studyhelp.model.KursterminSetCollection(this, _ormAdapter, ORMConstants.KEY_VERANSTALTUNG_KURSTERMINE, ORMConstants.KEY_KURSTERMIN_VERANSTALTUNG, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
