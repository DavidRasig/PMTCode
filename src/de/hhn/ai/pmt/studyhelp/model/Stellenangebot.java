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
@Table(name="Stellenangebot")
public class Stellenangebot implements Serializable {
	public Stellenangebot() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_STELLENANGEBOT_STUDENTEN) {
			return ORM_studenten;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_STELLENANGEBOT_FIRMA) {
			this.firma = (de.hhn.ai.pmt.studyhelp.model.Firma) owner;
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
	
	@Column(name="stellenId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_STUDYHELP_MODEL_STELLENANGEBOT_STELLENID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_STUDYHELP_MODEL_STELLENANGEBOT_STELLENID_GENERATOR", strategy="native")	
	private int stellenId;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.studyhelp.model.Firma.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Firmaname", referencedColumnName="name", nullable=false) }, foreignKey=@ForeignKey(name="erstellt"))	
	private de.hhn.ai.pmt.studyhelp.model.Firma firma;
	
	@Column(name="Titel", nullable=true, length=255)	
	private String titel;
	
	@Column(name="Beschreibung", nullable=true, length=255)	
	private String beschreibung;
	
	@Column(name="Art", nullable=true, length=255)	
	private String art;
	
	@Column(name="Standort", nullable=true, length=255)	
	private String standort;
	
	@Column(name="Bewerbungsfrist", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date bewerbungsfrist;
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.studyhelp.model.Student.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Benutzer_Stellenangebot", joinColumns={ @JoinColumn(name="StellenangebotID") }, inverseJoinColumns={ @JoinColumn(name="BenutzerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_studenten = new java.util.HashSet();
	
	public void setTitel(String value) {
		this.titel = value;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setBeschreibung(String value) {
		this.beschreibung = value;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setArt(String value) {
		this.art = value;
	}
	
	public String getArt() {
		return art;
	}
	
	public void setStandort(String value) {
		this.standort = value;
	}
	
	public String getStandort() {
		return standort;
	}
	
	public void setBewerbungsfrist(java.util.Date value) {
		this.bewerbungsfrist = value;
	}
	
	public java.util.Date getBewerbungsfrist() {
		return bewerbungsfrist;
	}
	
	private void setStellenId(int value) {
		this.stellenId = value;
	}
	
	public int getStellenId() {
		return stellenId;
	}
	
	public int getORMID() {
		return getStellenId();
	}
	
	public void setFirma(de.hhn.ai.pmt.studyhelp.model.Firma value) {
		if (firma != null) {
			firma.stellenangebote.remove(this);
		}
		if (value != null) {
			value.stellenangebote.add(this);
		}
	}
	
	public de.hhn.ai.pmt.studyhelp.model.Firma getFirma() {
		return firma;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Firma(de.hhn.ai.pmt.studyhelp.model.Firma value) {
		this.firma = value;
	}
	
	private de.hhn.ai.pmt.studyhelp.model.Firma getORM_Firma() {
		return firma;
	}
	
	private void setORM_Studenten(java.util.Set value) {
		this.ORM_studenten = value;
	}
	
	private java.util.Set getORM_Studenten() {
		return ORM_studenten;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.StudentSetCollection studenten = new de.hhn.ai.pmt.studyhelp.model.StudentSetCollection(this, _ormAdapter, ORMConstants.KEY_STELLENANGEBOT_STUDENTEN, ORMConstants.KEY_STUDENT_STELLENANGEBOTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getStellenId());
	}
	
}
