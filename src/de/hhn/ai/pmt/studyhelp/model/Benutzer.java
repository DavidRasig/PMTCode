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
/**
 * Test
 */
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Benutzer")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Benutzer")
public abstract class Benutzer implements Serializable {
	public Benutzer() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Benutzer))
			return false;
		Benutzer benutzer = (Benutzer)aObj;
		if (getId() != benutzer.getId())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getId();
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BENUTZER_LERNMATERIALIEN) {
			return ORM_lernmaterialien;
		}
		else if (key == ORMConstants.KEY_BENUTZER_FOREN) {
			return ORM_foren;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=11)	
	@Id	
	private int id;
	
	@Column(name="Vorname", nullable=true, length=255)	
	private String vorname;
	
	@Column(name="Nachname", nullable=true, length=255)	
	private String nachname;
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Lernmaterial_Benutzer", joinColumns={ @JoinColumn(name="BenutzerId") }, inverseJoinColumns={ @JoinColumn(name="LernmaterialienID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lernmaterialien = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_benutzer", targetEntity=de.hhn.ai.pmt.studyhelp.model.Forum.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_foren = new java.util.HashSet();
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setVorname(String value) {
		this.vorname = value;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setNachname(String value) {
		this.nachname = value;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	private void setORM_Lernmaterialien(java.util.Set value) {
		this.ORM_lernmaterialien = value;
	}
	
	private java.util.Set getORM_Lernmaterialien() {
		return ORM_lernmaterialien;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.LernmaterialSetCollection lernmaterialien = new de.hhn.ai.pmt.studyhelp.model.LernmaterialSetCollection(this, _ormAdapter, ORMConstants.KEY_BENUTZER_LERNMATERIALIEN, ORMConstants.KEY_LERNMATERIAL_BENUTZER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Foren(java.util.Set value) {
		this.ORM_foren = value;
	}
	
	private java.util.Set getORM_Foren() {
		return ORM_foren;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.ForumSetCollection foren = new de.hhn.ai.pmt.studyhelp.model.ForumSetCollection(this, _ormAdapter, ORMConstants.KEY_BENUTZER_FOREN, ORMConstants.KEY_FORUM_BENUTZER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
