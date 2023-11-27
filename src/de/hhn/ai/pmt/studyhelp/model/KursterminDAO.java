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

public class KursterminDAO {
	public static Kurstermin loadKursterminByORMID(String titel) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadKursterminByORMID(session, titel);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin getKursterminByORMID(String titel) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getKursterminByORMID(session, titel);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByORMID(String titel, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadKursterminByORMID(session, titel, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin getKursterminByORMID(String titel, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getKursterminByORMID(session, titel, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByORMID(PersistentSession session, String titel) throws PersistentException {
		try {
			return (Kurstermin) session.load(de.hhn.ai.pmt.studyhelp.model.Kurstermin.class, titel);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin getKursterminByORMID(PersistentSession session, String titel) throws PersistentException {
		try {
			return (Kurstermin) session.get(de.hhn.ai.pmt.studyhelp.model.Kurstermin.class, titel);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByORMID(PersistentSession session, String titel, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kurstermin) session.load(de.hhn.ai.pmt.studyhelp.model.Kurstermin.class, titel, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin getKursterminByORMID(PersistentSession session, String titel, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Kurstermin) session.get(de.hhn.ai.pmt.studyhelp.model.Kurstermin.class, titel, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKurstermin(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryKurstermin(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKurstermin(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryKurstermin(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin[] listKursterminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listKursterminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin[] listKursterminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listKursterminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryKurstermin(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Kurstermin as Kurstermin");
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
	
	public static List queryKurstermin(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Kurstermin as Kurstermin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kurstermin", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin[] listKursterminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryKurstermin(session, condition, orderBy);
			return (Kurstermin[]) list.toArray(new Kurstermin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin[] listKursterminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryKurstermin(session, condition, orderBy, lockMode);
			return (Kurstermin[]) list.toArray(new Kurstermin[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadKursterminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadKursterminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Kurstermin[] kurstermins = listKursterminByQuery(session, condition, orderBy);
		if (kurstermins != null && kurstermins.length > 0)
			return kurstermins[0];
		else
			return null;
	}
	
	public static Kurstermin loadKursterminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Kurstermin[] kurstermins = listKursterminByQuery(session, condition, orderBy, lockMode);
		if (kurstermins != null && kurstermins.length > 0)
			return kurstermins[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateKursterminByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateKursterminByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKursterminByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateKursterminByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateKursterminByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Kurstermin as Kurstermin");
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
	
	public static java.util.Iterator iterateKursterminByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Kurstermin as Kurstermin");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Kurstermin", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin createKurstermin() {
		return new de.hhn.ai.pmt.studyhelp.model.Kurstermin();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(kurstermin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(kurstermin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin)throws PersistentException {
		try {
			if (kurstermin.getVeranstaltung() != null) {
				kurstermin.getVeranstaltung().kurstermine.remove(kurstermin);
			}
			
			return delete(kurstermin);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (kurstermin.getVeranstaltung() != null) {
				kurstermin.getVeranstaltung().kurstermine.remove(kurstermin);
			}
			
			try {
				session.delete(kurstermin);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(kurstermin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Kurstermin kurstermin) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(kurstermin);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Kurstermin loadKursterminByCriteria(KursterminCriteria kursterminCriteria) {
		Kurstermin[] kurstermins = listKursterminByCriteria(kursterminCriteria);
		if(kurstermins == null || kurstermins.length == 0) {
			return null;
		}
		return kurstermins[0];
	}
	
	public static Kurstermin[] listKursterminByCriteria(KursterminCriteria kursterminCriteria) {
		return kursterminCriteria.listKurstermin();
	}
}
