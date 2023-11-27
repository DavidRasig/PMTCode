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
@DiscriminatorValue("Dozent")
public class Dozent extends de.hhn.ai.pmt.studyhelp.model.Benutzer implements Serializable {
	public Dozent() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_DOZENT_LEHRVERANSTALTUNGEN) {
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
	
	@ManyToMany(mappedBy="ORM_dozenten", targetEntity=de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_lehrveranstaltungen = new java.util.HashSet();
	
	private void setORM_Lehrveranstaltungen(java.util.Set value) {
		this.ORM_lehrveranstaltungen = value;
	}
	
	private java.util.Set getORM_Lehrveranstaltungen() {
		return ORM_lehrveranstaltungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungSetCollection lehrveranstaltungen = new de.hhn.ai.pmt.studyhelp.model.LehrveranstaltungSetCollection(this, _ormAdapter, ORMConstants.KEY_DOZENT_LEHRVERANSTALTUNGEN, ORMConstants.KEY_LEHRVERANSTALTUNG_DOZENTEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
