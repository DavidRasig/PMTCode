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

public class LehrveranstaltungDAO {
	public static Lehrveranstaltung loadLehrveranstaltungByORMID(int edvNummer) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLehrveranstaltungByORMID(session, edvNummer);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung getLehrveranstaltungByORMID(int edvNummer) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getLehrveranstaltungByORMID(session, edvNummer);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByORMID(int edvNummer, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLehrveranstaltungByORMID(session, edvNummer, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung getLehrveranstaltungByORMID(int edvNummer, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getLehrveranstaltungByORMID(session, edvNummer, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByORMID(PersistentSession session, int edvNummer) throws PersistentException {
		try {
			return (Lehrveranstaltung) session.load(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, Integer.valueOf(edvNummer));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung getLehrveranstaltungByORMID(PersistentSession session, int edvNummer) throws PersistentException {
		try {
			return (Lehrveranstaltung) session.get(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, Integer.valueOf(edvNummer));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByORMID(PersistentSession session, int edvNummer, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lehrveranstaltung) session.load(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, Integer.valueOf(edvNummer), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung getLehrveranstaltungByORMID(PersistentSession session, int edvNummer, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lehrveranstaltung) session.get(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung.class, Integer.valueOf(edvNummer), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLehrveranstaltung(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryLehrveranstaltung(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLehrveranstaltung(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryLehrveranstaltung(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung[] listLehrveranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listLehrveranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung[] listLehrveranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listLehrveranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLehrveranstaltung(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung as Lehrveranstaltung");
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
	
	public static List queryLehrveranstaltung(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung as Lehrveranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lehrveranstaltung", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung[] listLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLehrveranstaltung(session, condition, orderBy);
			return (Lehrveranstaltung[]) list.toArray(new Lehrveranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung[] listLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLehrveranstaltung(session, condition, orderBy, lockMode);
			return (Lehrveranstaltung[]) list.toArray(new Lehrveranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLehrveranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLehrveranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lehrveranstaltung[] lehrveranstaltungs = listLehrveranstaltungByQuery(session, condition, orderBy);
		if (lehrveranstaltungs != null && lehrveranstaltungs.length > 0)
			return lehrveranstaltungs[0];
		else
			return null;
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lehrveranstaltung[] lehrveranstaltungs = listLehrveranstaltungByQuery(session, condition, orderBy, lockMode);
		if (lehrveranstaltungs != null && lehrveranstaltungs.length > 0)
			return lehrveranstaltungs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLehrveranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateLehrveranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLehrveranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateLehrveranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung as Lehrveranstaltung");
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
	
	public static java.util.Iterator iterateLehrveranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung as Lehrveranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lehrveranstaltung", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung createLehrveranstaltung() {
		return new de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(lehrveranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(lehrveranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung)throws PersistentException {
		try {
			if (lehrveranstaltung.getStudiengang() != null) {
				lehrveranstaltung.getStudiengang().lehrveranstaltungen.remove(lehrveranstaltung);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Dozent[] lDozentens = lehrveranstaltung.dozenten.toArray();
			for(int i = 0; i < lDozentens.length; i++) {
				lDozentens[i].lehrveranstaltungen.remove(lehrveranstaltung);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = lehrveranstaltung.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].setLehrveranstaltung(null);
			}
			return delete(lehrveranstaltung);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lehrveranstaltung.getStudiengang() != null) {
				lehrveranstaltung.getStudiengang().lehrveranstaltungen.remove(lehrveranstaltung);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Dozent[] lDozentens = lehrveranstaltung.dozenten.toArray();
			for(int i = 0; i < lDozentens.length; i++) {
				lDozentens[i].lehrveranstaltungen.remove(lehrveranstaltung);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = lehrveranstaltung.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].setLehrveranstaltung(null);
			}
			try {
				session.delete(lehrveranstaltung);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(lehrveranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung lehrveranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(lehrveranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lehrveranstaltung loadLehrveranstaltungByCriteria(LehrveranstaltungCriteria lehrveranstaltungCriteria) {
		Lehrveranstaltung[] lehrveranstaltungs = listLehrveranstaltungByCriteria(lehrveranstaltungCriteria);
		if(lehrveranstaltungs == null || lehrveranstaltungs.length == 0) {
			return null;
		}
		return lehrveranstaltungs[0];
	}
	
	public static Lehrveranstaltung[] listLehrveranstaltungByCriteria(LehrveranstaltungCriteria lehrveranstaltungCriteria) {
		return lehrveranstaltungCriteria.listLehrveranstaltung();
	}
}
