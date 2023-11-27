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

public class StellenangebotDAO {
	public static Stellenangebot loadStellenangebotByORMID(int stellenId) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStellenangebotByORMID(session, stellenId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot getStellenangebotByORMID(int stellenId) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStellenangebotByORMID(session, stellenId);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByORMID(int stellenId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStellenangebotByORMID(session, stellenId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot getStellenangebotByORMID(int stellenId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStellenangebotByORMID(session, stellenId, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByORMID(PersistentSession session, int stellenId) throws PersistentException {
		try {
			return (Stellenangebot) session.load(de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class, Integer.valueOf(stellenId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot getStellenangebotByORMID(PersistentSession session, int stellenId) throws PersistentException {
		try {
			return (Stellenangebot) session.get(de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class, Integer.valueOf(stellenId));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByORMID(PersistentSession session, int stellenId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Stellenangebot) session.load(de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class, Integer.valueOf(stellenId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot getStellenangebotByORMID(PersistentSession session, int stellenId, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Stellenangebot) session.get(de.hhn.ai.pmt.studyhelp.model.Stellenangebot.class, Integer.valueOf(stellenId), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStellenangebot(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStellenangebot(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStellenangebot(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStellenangebot(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot[] listStellenangebotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStellenangebotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot[] listStellenangebotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStellenangebotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStellenangebot(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Stellenangebot as Stellenangebot");
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
	
	public static List queryStellenangebot(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Stellenangebot as Stellenangebot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Stellenangebot", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot[] listStellenangebotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStellenangebot(session, condition, orderBy);
			return (Stellenangebot[]) list.toArray(new Stellenangebot[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot[] listStellenangebotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStellenangebot(session, condition, orderBy, lockMode);
			return (Stellenangebot[]) list.toArray(new Stellenangebot[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStellenangebotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStellenangebotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Stellenangebot[] stellenangebots = listStellenangebotByQuery(session, condition, orderBy);
		if (stellenangebots != null && stellenangebots.length > 0)
			return stellenangebots[0];
		else
			return null;
	}
	
	public static Stellenangebot loadStellenangebotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Stellenangebot[] stellenangebots = listStellenangebotByQuery(session, condition, orderBy, lockMode);
		if (stellenangebots != null && stellenangebots.length > 0)
			return stellenangebots[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStellenangebotByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStellenangebotByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStellenangebotByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStellenangebotByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStellenangebotByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Stellenangebot as Stellenangebot");
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
	
	public static java.util.Iterator iterateStellenangebotByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Stellenangebot as Stellenangebot");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Stellenangebot", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot createStellenangebot() {
		return new de.hhn.ai.pmt.studyhelp.model.Stellenangebot();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(stellenangebot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(stellenangebot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot)throws PersistentException {
		try {
			if (stellenangebot.getFirma() != null) {
				stellenangebot.getFirma().stellenangebote.remove(stellenangebot);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = stellenangebot.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].stellenangebote.remove(stellenangebot);
			}
			return delete(stellenangebot);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (stellenangebot.getFirma() != null) {
				stellenangebot.getFirma().stellenangebote.remove(stellenangebot);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Student[] lStudentens = stellenangebot.studenten.toArray();
			for(int i = 0; i < lStudentens.length; i++) {
				lStudentens[i].stellenangebote.remove(stellenangebot);
			}
			try {
				session.delete(stellenangebot);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(stellenangebot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Stellenangebot stellenangebot) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(stellenangebot);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Stellenangebot loadStellenangebotByCriteria(StellenangebotCriteria stellenangebotCriteria) {
		Stellenangebot[] stellenangebots = listStellenangebotByCriteria(stellenangebotCriteria);
		if(stellenangebots == null || stellenangebots.length == 0) {
			return null;
		}
		return stellenangebots[0];
	}
	
	public static Stellenangebot[] listStellenangebotByCriteria(StellenangebotCriteria stellenangebotCriteria) {
		return stellenangebotCriteria.listStellenangebot();
	}
}
