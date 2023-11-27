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

public class BenutzerDAO {
	public static Benutzer loadBenutzerByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadBenutzerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getBenutzerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadBenutzerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getBenutzerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Benutzer) session.load(de.hhn.ai.pmt.studyhelp.model.Benutzer.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Benutzer) session.get(de.hhn.ai.pmt.studyhelp.model.Benutzer.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Benutzer) session.load(de.hhn.ai.pmt.studyhelp.model.Benutzer.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Benutzer) session.get(de.hhn.ai.pmt.studyhelp.model.Benutzer.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryBenutzer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryBenutzer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Benutzer as Benutzer");
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
	
	public static List queryBenutzer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Benutzer as Benutzer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Benutzer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBenutzer(session, condition, orderBy);
			return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBenutzer(session, condition, orderBy, lockMode);
			return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Benutzer[] benutzers = listBenutzerByQuery(session, condition, orderBy);
		if (benutzers != null && benutzers.length > 0)
			return benutzers[0];
		else
			return null;
	}
	
	public static Benutzer loadBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Benutzer[] benutzers = listBenutzerByQuery(session, condition, orderBy, lockMode);
		if (benutzers != null && benutzers.length > 0)
			return benutzers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Benutzer as Benutzer");
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
	
	public static java.util.Iterator iterateBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Benutzer as Benutzer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Benutzer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer)throws PersistentException {
		if (benutzer instanceof de.hhn.ai.pmt.studyhelp.model.Dozent) {
			return de.hhn.ai.pmt.studyhelp.model.DozentDAO.deleteAndDissociate((de.hhn.ai.pmt.studyhelp.model.Dozent) benutzer);
		}
		
		if (benutzer instanceof de.hhn.ai.pmt.studyhelp.model.Student) {
			return de.hhn.ai.pmt.studyhelp.model.StudentDAO.deleteAndDissociate((de.hhn.ai.pmt.studyhelp.model.Student) benutzer);
		}
		
		try {
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = benutzer.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(benutzer);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = benutzer.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(benutzer);
			}
			return delete(benutzer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer, org.orm.PersistentSession session)throws PersistentException {
		if (benutzer instanceof de.hhn.ai.pmt.studyhelp.model.Dozent) {
			return de.hhn.ai.pmt.studyhelp.model.DozentDAO.deleteAndDissociate((de.hhn.ai.pmt.studyhelp.model.Dozent) benutzer, session);
		}
		
		if (benutzer instanceof de.hhn.ai.pmt.studyhelp.model.Student) {
			return de.hhn.ai.pmt.studyhelp.model.StudentDAO.deleteAndDissociate((de.hhn.ai.pmt.studyhelp.model.Student) benutzer, session);
		}
		
		try {
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = benutzer.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(benutzer);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = benutzer.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(benutzer);
			}
			try {
				session.delete(benutzer);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Benutzer benutzer) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByCriteria(BenutzerCriteria benutzerCriteria) {
		Benutzer[] benutzers = listBenutzerByCriteria(benutzerCriteria);
		if(benutzers == null || benutzers.length == 0) {
			return null;
		}
		return benutzers[0];
	}
	
	public static Benutzer[] listBenutzerByCriteria(BenutzerCriteria benutzerCriteria) {
		return benutzerCriteria.listBenutzer();
	}
}
