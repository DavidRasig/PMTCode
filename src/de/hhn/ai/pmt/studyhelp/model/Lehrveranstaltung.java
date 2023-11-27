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
@Table(name="Lehrveranstaltung")
public class Lehrveranstaltung implements Serializable {
	public Lehrveranstaltung() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LEHRVERANSTALTUNG_DOZENTEN) {
			return ORM_dozenten;
		}
		else if (key == ORMConstants.KEY_LEHRVERANSTALTUNG_LERNMATERIALIEN) {
			return ORM_lernmaterialien;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LEHRVERANSTALTUNG_STUDIENGANG) {
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
	
	@Column(name="edvNummer", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_STUDYHELP_MODEL_LEHRVERANSTALTUNG_EDVNUMMER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_STUDYHELP_MODEL_LEHRVERANSTALTUNG_EDVNUMMER_GENERATOR", strategy="native")	
	private int edvNummer;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.studyhelp.model.Studiengang.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="StudiengangstudiengangId", referencedColumnName="studiengangId", nullable=false) }, foreignKey=@ForeignKey(name="besteht aus Lehrveranstaltung"))	
	private de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang;
	
	@Column(name="KursName", nullable=true, length=255)	
	private String kursName;
	
	@Column(name="Semester", nullable=false, length=10)	
	private int semester;
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.studyhelp.model.Dozent.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Benutzer_Lehrveranstaltung", joinColumns={ @JoinColumn(name="LehrveranstaltungID") }, inverseJoinColumns={ @JoinColumn(name="BenutzerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dozenten = new java.util.HashSet();
	
	@OneToMany(mappedBy="lehrveranstaltung", targetEntity=de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lernmaterialien = new java.util.HashSet();
	
	private void setEdvNummer(int value) {
		this.edvNummer = value;
	}
	
	public int getEdvNummer() {
		return edvNummer;
	}
	
	public int getORMID() {
		return getEdvNummer();
	}
	
	public void setKursName(String value) {
		this.kursName = value;
	}
	
	public String getKursName() {
		return kursName;
	}
	
	public void setSemester(int value) {
		this.semester = value;
	}
	
	public int getSemester() {
		return semester;
	}
	
	public void setStudiengang(de.hhn.ai.pmt.studyhelp.model.Studiengang value) {
		if (studiengang != null) {
			studiengang.lehrveranstaltungen.remove(this);
		}
		if (value != null) {
			value.lehrveranstaltungen.add(this);
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
	
	private void setORM_Dozenten(java.util.Set value) {
		this.ORM_dozenten = value;
	}
	
	private java.util.Set getORM_Dozenten() {
		return ORM_dozenten;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.DozentSetCollection dozenten = new de.hhn.ai.pmt.studyhelp.model.DozentSetCollection(this, _ormAdapter, ORMConstants.KEY_LEHRVERANSTALTUNG_DOZENTEN, ORMConstants.KEY_DOZENT_LEHRVERANSTALTUNGEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Lernmaterialien(java.util.Set value) {
		this.ORM_lernmaterialien = value;
	}
	
	private java.util.Set getORM_Lernmaterialien() {
		return ORM_lernmaterialien;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.LernmaterialSetCollection lernmaterialien = new de.hhn.ai.pmt.studyhelp.model.LernmaterialSetCollection(this, _ormAdapter, ORMConstants.KEY_LEHRVERANSTALTUNG_LERNMATERIALIEN, ORMConstants.KEY_LERNMATERIAL_LEHRVERANSTALTUNG, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getEdvNummer());
	}
	
}
