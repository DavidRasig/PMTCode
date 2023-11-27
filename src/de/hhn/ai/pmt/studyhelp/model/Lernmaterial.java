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
@Table(name="Lernmaterial")
public class Lernmaterial implements Serializable {
	public Lernmaterial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LERNMATERIAL_BENUTZER) {
			return ORM_benutzer;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LERNMATERIAL_LEHRVERANSTALTUNG) {
			this.lehrveranstaltung = (de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung) owner;
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
	
	@Column(name="MaterialID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_STUDYHELP_MODEL_LERNMATERIAL_MATERIALID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_STUDYHELP_MODEL_LERNMATERIAL_MATERIALID_GENERATOR", strategy="native")	
	private int materialID;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="LehrveranstaltungedvNummer", referencedColumnName="edvNummer", nullable=false) }, foreignKey=@ForeignKey(name="zugeordnet zu"))	
	private de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung;
	
	@Column(name="Titel", nullable=true, length=255)	
	private String titel;
	
	@Column(name="DateiFormat", nullable=true, length=255)	
	private String dateiFormat;
	
	@Column(name="DateiName", nullable=true, length=255)	
	private String dateiName;
	
	@Column(name="UploadPfad", nullable=true, length=255)	
	private String uploadPfad;
	
	@Column(name="DownloadPfad", nullable=true, length=255)	
	private String downloadPfad;
	
	@ManyToMany(mappedBy="ORM_lernmaterialien", targetEntity=de.hhn.ai.pmt.studyhelp.model.Benutzer.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_benutzer = new java.util.HashSet();
	
	private void setMaterialID(int value) {
		this.materialID = value;
	}
	
	public int getMaterialID() {
		return materialID;
	}
	
	public int getORMID() {
		return getMaterialID();
	}
	
	public void setTitel(String value) {
		this.titel = value;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setDateiFormat(String value) {
		this.dateiFormat = value;
	}
	
	public String getDateiFormat() {
		return dateiFormat;
	}
	
	public void setDateiName(String value) {
		this.dateiName = value;
	}
	
	public String getDateiName() {
		return dateiName;
	}
	
	public void setUploadPfad(String value) {
		this.uploadPfad = value;
	}
	
	public String getUploadPfad() {
		return uploadPfad;
	}
	
	public void setDownloadPfad(String value) {
		this.downloadPfad = value;
	}
	
	public String getDownloadPfad() {
		return downloadPfad;
	}
	
	public void setLehrveranstaltung(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung value) {
		if (lehrveranstaltung != null) {
			lehrveranstaltung.lernmaterialien.remove(this);
		}
		if (value != null) {
			value.lernmaterialien.add(this);
		}
	}
	
	public de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung getLehrveranstaltung() {
		return lehrveranstaltung;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Lehrveranstaltung(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung value) {
		this.lehrveranstaltung = value;
	}
	
	private de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung getORM_Lehrveranstaltung() {
		return lehrveranstaltung;
	}
	
	private void setORM_Benutzer(java.util.Set value) {
		this.ORM_benutzer = value;
	}
	
	private java.util.Set getORM_Benutzer() {
		return ORM_benutzer;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.BenutzerSetCollection benutzer = new de.hhn.ai.pmt.studyhelp.model.BenutzerSetCollection(this, _ormAdapter, ORMConstants.KEY_LERNMATERIAL_BENUTZER, ORMConstants.KEY_BENUTZER_LERNMATERIALIEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getMaterialID());
	}
	
}
