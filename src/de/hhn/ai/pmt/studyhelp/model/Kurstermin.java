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
@Table(name="Kurstermin")
public class Kurstermin implements Serializable {
	public Kurstermin() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Kurstermin))
			return false;
		Kurstermin kurstermin = (Kurstermin)aObj;
		if ((getTitel() != null && !getTitel().equals(kurstermin.getTitel())) || (getTitel() == null && kurstermin.getTitel() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getTitel() == null ? 0 : getTitel().hashCode());
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_KURSTERMIN_VERANSTALTUNG) {
			this.veranstaltung = (de.hhn.ai.pmt.studyhelp.model.Veranstaltung) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=255)	
	@Id	
	private String titel;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Veranstaltungname", referencedColumnName="name", nullable=false) }, foreignKey=@ForeignKey(name="besteht aus"))	
	private de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung;
	
	@Column(name="Datum", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date datum;
	
	@Column(name="Dauer", nullable=false, length=10)	
	private int dauer;
	
	@Column(name="TerminBeschreibung", nullable=true, length=255)	
	private String terminBeschreibung;
	
	public void setDatum(java.util.Date value) {
		this.datum = value;
	}
	
	public java.util.Date getDatum() {
		return datum;
	}
	
	public void setDauer(int value) {
		this.dauer = value;
	}
	
	public int getDauer() {
		return dauer;
	}
	
	public void setTerminBeschreibung(String value) {
		this.terminBeschreibung = value;
	}
	
	public String getTerminBeschreibung() {
		return terminBeschreibung;
	}
	
	public void setTitel(String value) {
		this.titel = value;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public String getORMID() {
		return getTitel();
	}
	
	public void setVeranstaltung(de.hhn.ai.pmt.studyhelp.model.Veranstaltung value) {
		if (veranstaltung != null) {
			veranstaltung.kurstermine.remove(this);
		}
		if (value != null) {
			value.kurstermine.add(this);
		}
	}
	
	public de.hhn.ai.pmt.studyhelp.model.Veranstaltung getVeranstaltung() {
		return veranstaltung;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Veranstaltung(de.hhn.ai.pmt.studyhelp.model.Veranstaltung value) {
		this.veranstaltung = value;
	}
	
	private de.hhn.ai.pmt.studyhelp.model.Veranstaltung getORM_Veranstaltung() {
		return veranstaltung;
	}
	
	public String toString() {
		return String.valueOf(getTitel());
	}
	
}
