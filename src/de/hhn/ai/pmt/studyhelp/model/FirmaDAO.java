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

public class FirmaDAO {
	public static Firma loadFirmaByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadFirmaByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma getFirmaByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getFirmaByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadFirmaByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma getFirmaByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getFirmaByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Firma) session.load(de.hhn.ai.pmt.studyhelp.model.Firma.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma getFirmaByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Firma) session.get(de.hhn.ai.pmt.studyhelp.model.Firma.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Firma) session.load(de.hhn.ai.pmt.studyhelp.model.Firma.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma getFirmaByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Firma) session.get(de.hhn.ai.pmt.studyhelp.model.Firma.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFirma(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryFirma(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFirma(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryFirma(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma[] listFirmaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listFirmaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma[] listFirmaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listFirmaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFirma(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Firma as Firma");
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
	
	public static List queryFirma(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Firma as Firma");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Firma", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma[] listFirmaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFirma(session, condition, orderBy);
			return (Firma[]) list.toArray(new Firma[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma[] listFirmaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFirma(session, condition, orderBy, lockMode);
			return (Firma[]) list.toArray(new Firma[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadFirmaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadFirmaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Firma[] firmas = listFirmaByQuery(session, condition, orderBy);
		if (firmas != null && firmas.length > 0)
			return firmas[0];
		else
			return null;
	}
	
	public static Firma loadFirmaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Firma[] firmas = listFirmaByQuery(session, condition, orderBy, lockMode);
		if (firmas != null && firmas.length > 0)
			return firmas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFirmaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateFirmaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFirmaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateFirmaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFirmaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Firma as Firma");
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
	
	public static java.util.Iterator iterateFirmaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Firma as Firma");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Firma", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma createFirma() {
		return new de.hhn.ai.pmt.studyhelp.model.Firma();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Firma firma) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(firma);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Firma firma) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(firma);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Firma firma)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] lStellenangebotes = firma.stellenangebote.toArray();
			for(int i = 0; i < lStellenangebotes.length; i++) {
				lStellenangebotes[i].setFirma(null);
			}
			return delete(firma);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Firma firma, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] lStellenangebotes = firma.stellenangebote.toArray();
			for(int i = 0; i < lStellenangebotes.length; i++) {
				lStellenangebotes[i].setFirma(null);
			}
			try {
				session.delete(firma);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Firma firma) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(firma);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Firma firma) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(firma);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Firma loadFirmaByCriteria(FirmaCriteria firmaCriteria) {
		Firma[] firmas = listFirmaByCriteria(firmaCriteria);
		if(firmas == null || firmas.length == 0) {
			return null;
		}
		return firmas[0];
	}
	
	public static Firma[] listFirmaByCriteria(FirmaCriteria firmaCriteria) {
		return firmaCriteria.listFirma();
	}
}
