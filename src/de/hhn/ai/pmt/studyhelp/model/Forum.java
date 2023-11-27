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
@Table(name="Forum")
public class Forum implements Serializable {
	public Forum() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_FORUM_BENUTZER) {
			return ORM_benutzer;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ForumId", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_STUDYHELP_MODEL_FORUM_FORUMID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_STUDYHELP_MODEL_FORUM_FORUMID_GENERATOR", strategy="native")	
	private int forumId;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@ElementCollection	
	@CollectionTable(name="Entity", joinColumns={ @JoinColumn(name="ForumID") })	
	@org.hibernate.annotations.IndexColumn(name="ForumIndex")	
	@Column(name="ChatVerlauf", nullable=true, length=255)	
	private String[] chatVerlauf;
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.studyhelp.model.Benutzer.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Benutzer_Forum", joinColumns={ @JoinColumn(name="ForumID") }, inverseJoinColumns={ @JoinColumn(name="BenutzerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_benutzer = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setChatVerlauf(String[] value) {
		this.chatVerlauf = value;
	}
	
	public String[] getChatVerlauf() {
		return chatVerlauf;
	}
	
	private void setForumId(int value) {
		this.forumId = value;
	}
	
	public int getForumId() {
		return forumId;
	}
	
	public int getORMID() {
		return getForumId();
	}
	
	private void setORM_Benutzer(java.util.Set value) {
		this.ORM_benutzer = value;
	}
	
	private java.util.Set getORM_Benutzer() {
		return ORM_benutzer;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.studyhelp.model.BenutzerSetCollection benutzer = new de.hhn.ai.pmt.studyhelp.model.BenutzerSetCollection(this, _ormAdapter, ORMConstants.KEY_FORUM_BENUTZER, ORMConstants.KEY_BENUTZER_FOREN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getForumId());
	}
	
}
