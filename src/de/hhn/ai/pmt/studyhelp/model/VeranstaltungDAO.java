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

public class VeranstaltungDAO {
	public static Veranstaltung loadVeranstaltungByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadVeranstaltungByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getVeranstaltungByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadVeranstaltungByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getVeranstaltungByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Veranstaltung) session.load(de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Veranstaltung) session.get(de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstaltung) session.load(de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstaltung) session.get(de.hhn.ai.pmt.studyhelp.model.Veranstaltung.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryVeranstaltung(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryVeranstaltung(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Veranstaltung as Veranstaltung");
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
	
	public static List queryVeranstaltung(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Veranstaltung as Veranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstaltung", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVeranstaltung(session, condition, orderBy);
			return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVeranstaltung(session, condition, orderBy, lockMode);
			return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Veranstaltung[] veranstaltungs = listVeranstaltungByQuery(session, condition, orderBy);
		if (veranstaltungs != null && veranstaltungs.length > 0)
			return veranstaltungs[0];
		else
			return null;
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Veranstaltung[] veranstaltungs = listVeranstaltungByQuery(session, condition, orderBy, lockMode);
		if (veranstaltungs != null && veranstaltungs.length > 0)
			return veranstaltungs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Veranstaltung as Veranstaltung");
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
	
	public static java.util.Iterator iterateVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Veranstaltung as Veranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstaltung", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung createVeranstaltung() {
		return new de.hhn.ai.pmt.studyhelp.model.Veranstaltung();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = veranstaltung.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].veranstaltungen.remove(veranstaltung);
			}
			de.hhn.ai.pmt.studyhelp.model.Kurstermin[] lKurstermines = veranstaltung.kurstermine.toArray();
			for(int i = 0; i < lKurstermines.length; i++) {
				lKurstermines[i].setVeranstaltung(null);
			}
			return delete(veranstaltung);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = veranstaltung.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].veranstaltungen.remove(veranstaltung);
			}
			de.hhn.ai.pmt.studyhelp.model.Kurstermin[] lKurstermines = veranstaltung.kurstermine.toArray();
			for(int i = 0; i < lKurstermines.length; i++) {
				lKurstermines[i].setVeranstaltung(null);
			}
			try {
				session.delete(veranstaltung);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByCriteria(VeranstaltungCriteria veranstaltungCriteria) {
		Veranstaltung[] veranstaltungs = listVeranstaltungByCriteria(veranstaltungCriteria);
		if(veranstaltungs == null || veranstaltungs.length == 0) {
			return null;
		}
		return veranstaltungs[0];
	}
	
	public static Veranstaltung[] listVeranstaltungByCriteria(VeranstaltungCriteria veranstaltungCriteria) {
		return veranstaltungCriteria.listVeranstaltung();
	}
}
