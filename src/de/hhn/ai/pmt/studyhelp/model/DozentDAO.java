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

public class DozentDAO {
	public static Dozent loadDozentByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadDozentByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent getDozentByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getDozentByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadDozentByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent getDozentByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getDozentByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Dozent) session.load(de.hhn.ai.pmt.studyhelp.model.Dozent.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent getDozentByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Dozent) session.get(de.hhn.ai.pmt.studyhelp.model.Dozent.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Dozent) session.load(de.hhn.ai.pmt.studyhelp.model.Dozent.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent getDozentByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Dozent) session.get(de.hhn.ai.pmt.studyhelp.model.Dozent.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDozent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryDozent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDozent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryDozent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent[] listDozentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listDozentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent[] listDozentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listDozentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDozent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Dozent as Dozent");
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
	
	public static List queryDozent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Dozent as Dozent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dozent", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent[] listDozentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDozent(session, condition, orderBy);
			return (Dozent[]) list.toArray(new Dozent[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent[] listDozentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDozent(session, condition, orderBy, lockMode);
			return (Dozent[]) list.toArray(new Dozent[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadDozentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadDozentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Dozent[] dozents = listDozentByQuery(session, condition, orderBy);
		if (dozents != null && dozents.length > 0)
			return dozents[0];
		else
			return null;
	}
	
	public static Dozent loadDozentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Dozent[] dozents = listDozentByQuery(session, condition, orderBy, lockMode);
		if (dozents != null && dozents.length > 0)
			return dozents[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDozentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateDozentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDozentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateDozentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDozentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Dozent as Dozent");
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
	
	public static java.util.Iterator iterateDozentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Dozent as Dozent");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Dozent", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent createDozent() {
		return new de.hhn.ai.pmt.studyhelp.model.Dozent();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Dozent dozent) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(dozent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Dozent dozent) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(dozent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Dozent dozent)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] lLehrveranstaltungens = dozent.lehrveranstaltungen.toArray();
			for(int i = 0; i < lLehrveranstaltungens.length; i++) {
				lLehrveranstaltungens[i].dozenten.remove(dozent);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = dozent.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(dozent);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = dozent.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(dozent);
			}
			return delete(dozent);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Dozent dozent, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Lehrveranstaltung[] lLehrveranstaltungens = dozent.lehrveranstaltungen.toArray();
			for(int i = 0; i < lLehrveranstaltungens.length; i++) {
				lLehrveranstaltungens[i].dozenten.remove(dozent);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = dozent.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(dozent);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = dozent.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(dozent);
			}
			try {
				session.delete(dozent);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Dozent dozent) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(dozent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Dozent dozent) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(dozent);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Dozent loadDozentByCriteria(DozentCriteria dozentCriteria) {
		Dozent[] dozents = listDozentByCriteria(dozentCriteria);
		if(dozents == null || dozents.length == 0) {
			return null;
		}
		return dozents[0];
	}
	
	public static Dozent[] listDozentByCriteria(DozentCriteria dozentCriteria) {
		return dozentCriteria.listDozent();
	}
}
