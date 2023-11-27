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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class StudiengangDAO {
	public static Studiengang loadStudiengangByORMID(int studiengangId) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudiengangByORMID(session, studiengangId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang getStudiengangByORMID(int studiengangId) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStudiengangByORMID(session, studiengangId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByORMID(int studiengangId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudiengangByORMID(session, studiengangId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang getStudiengangByORMID(int studiengangId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStudiengangByORMID(session, studiengangId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByORMID(PersistentSession session, int studiengangId) throws PersistentException {
		try {
			return (Studiengang) session.load(de.hhn.ai.pmt.studyhelp.model.Studiengang.class, Integer.valueOf(studiengangId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang getStudiengangByORMID(PersistentSession session, int studiengangId) throws PersistentException {
		try {
			return (Studiengang) session.get(de.hhn.ai.pmt.studyhelp.model.Studiengang.class, Integer.valueOf(studiengangId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByORMID(PersistentSession session, int studiengangId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Studiengang) session.load(de.hhn.ai.pmt.studyhelp.model.Studiengang.class, Integer.valueOf(studiengangId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang getStudiengangByORMID(PersistentSession session, int studiengangId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Studiengang) session.get(de.hhn.ai.pmt.studyhelp.model.Studiengang.class, Integer.valueOf(studiengangId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudiengang(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStudiengang(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudiengang(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStudiengang(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang[] listStudiengangByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStudiengangByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang[] listStudiengangByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStudiengangByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudiengang(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Studiengang as Studiengang");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudiengang(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Studiengang as Studiengang");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Studiengang", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang[] listStudiengangByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStudiengang(session, condition, orderBy);
			return (Studiengang[]) list.toArray(new Studiengang[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang[] listStudiengangByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStudiengang(session, condition, orderBy, lockMode);
			return (Studiengang[]) list.toArray(new Studiengang[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudiengangByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudiengangByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Studiengang[] studiengangs = listStudiengangByQuery(session, condition, orderBy);
		if (studiengangs != null && studiengangs.length > 0)
			return studiengangs[0];
		else
			return null;
	}
	
	public static Studiengang loadStudiengangByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Studiengang[] studiengangs = listStudiengangByQuery(session, condition, orderBy, lockMode);
		if (studiengangs != null && studiengangs.length > 0)
			return studiengangs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStudiengangByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStudiengangByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudiengangByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStudiengangByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudiengangByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Studiengang as Studiengang");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudiengangByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Studiengang as Studiengang");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Studiengang", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang createStudiengang() {
		return new de.hhn.ai.pmt.studyhelp.model.Studiengang();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(studiengang);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(studiengang);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = studiengang.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].setStudiengang(null);
			}
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] lLehrveranstaltungens = studiengang.lehrveranstaltungen.toArray();
			for(int i = 0; i < lLehrveranstaltungens.length; i++) {
				lLehrveranstaltungens[i].setStudiengang(null);
			}
			return delete(studiengang);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = studiengang.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].setStudiengang(null);
			}
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] lLehrveranstaltungens = studiengang.lehrveranstaltungen.toArray();
			for(int i = 0; i < lLehrveranstaltungens.length; i++) {
				lLehrveranstaltungens[i].setStudiengang(null);
			}
			try {
				session.delete(studiengang);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(studiengang);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Studiengang studiengang) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(studiengang);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Studiengang loadStudiengangByCriteria(StudiengangCriteria studiengangCriteria) {
		Studiengang[] studiengangs = listStudiengangByCriteria(studiengangCriteria);
		if(studiengangs == null || studiengangs.length == 0) {
			return null;
		}
		return studiengangs[0];
	}
	
	public static Studiengang[] listStudiengangByCriteria(StudiengangCriteria studiengangCriteria) {
		return studiengangCriteria.listStudiengang();
	}
}
