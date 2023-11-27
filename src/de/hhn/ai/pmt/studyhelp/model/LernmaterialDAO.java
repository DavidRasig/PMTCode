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

public class LernmaterialDAO {
	public static Lernmaterial loadLernmaterialByORMID(int materialID) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLernmaterialByORMID(session, materialID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial getLernmaterialByORMID(int materialID) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getLernmaterialByORMID(session, materialID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByORMID(int materialID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLernmaterialByORMID(session, materialID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial getLernmaterialByORMID(int materialID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getLernmaterialByORMID(session, materialID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByORMID(PersistentSession session, int materialID) throws PersistentException {
		try {
			return (Lernmaterial) session.load(de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class, Integer.valueOf(materialID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial getLernmaterialByORMID(PersistentSession session, int materialID) throws PersistentException {
		try {
			return (Lernmaterial) session.get(de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class, Integer.valueOf(materialID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByORMID(PersistentSession session, int materialID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lernmaterial) session.load(de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class, Integer.valueOf(materialID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial getLernmaterialByORMID(PersistentSession session, int materialID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lernmaterial) session.get(de.hhn.ai.pmt.studyhelp.model.Lernmaterial.class, Integer.valueOf(materialID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLernmaterial(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryLernmaterial(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLernmaterial(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryLernmaterial(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial[] listLernmaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listLernmaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial[] listLernmaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listLernmaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLernmaterial(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lernmaterial as Lernmaterial");
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
	
	public static List queryLernmaterial(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lernmaterial as Lernmaterial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lernmaterial", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial[] listLernmaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLernmaterial(session, condition, orderBy);
			return (Lernmaterial[]) list.toArray(new Lernmaterial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial[] listLernmaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLernmaterial(session, condition, orderBy, lockMode);
			return (Lernmaterial[]) list.toArray(new Lernmaterial[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLernmaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadLernmaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lernmaterial[] lernmaterials = listLernmaterialByQuery(session, condition, orderBy);
		if (lernmaterials != null && lernmaterials.length > 0)
			return lernmaterials[0];
		else
			return null;
	}
	
	public static Lernmaterial loadLernmaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lernmaterial[] lernmaterials = listLernmaterialByQuery(session, condition, orderBy, lockMode);
		if (lernmaterials != null && lernmaterials.length > 0)
			return lernmaterials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLernmaterialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateLernmaterialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLernmaterialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateLernmaterialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLernmaterialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lernmaterial as Lernmaterial");
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
	
	public static java.util.Iterator iterateLernmaterialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Lernmaterial as Lernmaterial");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lernmaterial", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial createLernmaterial() {
		return new de.hhn.ai.pmt.studyhelp.model.Lernmaterial();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(lernmaterial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(lernmaterial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial)throws PersistentException {
		try {
			if (lernmaterial.getLehrveranstaltung() != null) {
				lernmaterial.getLehrveranstaltung().lernmaterialien.remove(lernmaterial);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Benutzer[] lBenutzers = lernmaterial.benutzer.toArray();
			for(int i = 0; i < lBenutzers.length; i++) {
				lBenutzers[i].lernmaterialien.remove(lernmaterial);
			}
			return delete(lernmaterial);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lernmaterial.getLehrveranstaltung() != null) {
				lernmaterial.getLehrveranstaltung().lernmaterialien.remove(lernmaterial);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Benutzer[] lBenutzers = lernmaterial.benutzer.toArray();
			for(int i = 0; i < lBenutzers.length; i++) {
				lBenutzers[i].lernmaterialien.remove(lernmaterial);
			}
			try {
				session.delete(lernmaterial);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(lernmaterial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Lernmaterial lernmaterial) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(lernmaterial);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lernmaterial loadLernmaterialByCriteria(LernmaterialCriteria lernmaterialCriteria) {
		Lernmaterial[] lernmaterials = listLernmaterialByCriteria(lernmaterialCriteria);
		if(lernmaterials == null || lernmaterials.length == 0) {
			return null;
		}
		return lernmaterials[0];
	}
	
	public static Lernmaterial[] listLernmaterialByCriteria(LernmaterialCriteria lernmaterialCriteria) {
		return lernmaterialCriteria.listLernmaterial();
	}
}
