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
@Table(name="Firma")
public class Firma implements Serializable {
	public Firma() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Firma))
			return false;
		Firma firma = (Firma)aObj;
		if ((getName() != null && !getName().equals(firma.getName())) || (getName() == null && firma.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_FIRMA_STELLENANGEBOTE) {
			return ORM_stellenangebote;
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
	
	@OneToMany(mappedBy="firma", targetEntity=de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_stellenangebote = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	private void setORM_Stellenangebote(java.util.Set value) {
		this.ORM_stellenangebote = value;
	}
	
	private java.util.Set getORM_Stellenangebote() {
		return ORM_stellenangebote;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.StellenangebotSetCollection stellenangebote = new de.hhn.ai.pmt.studyhelp.model.StellenangebotSetCollection(this, _ormAdapter, ORMConstants.KEY_FIRMA_STELLENANGEBOTE, ORMConstants.KEY_STELLENANGEBOT_FIRMA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
