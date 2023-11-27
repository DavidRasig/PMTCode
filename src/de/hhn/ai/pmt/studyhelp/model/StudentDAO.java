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

public class StudentDAO {
	public static Student loadStudentByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudentByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStudentByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudentByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return getStudentByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Student) session.load(de.hhn.ai.pmt.studyhelp.model.Student.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Student) session.get(de.hhn.ai.pmt.studyhelp.model.Student.class, Integer.valueOf(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Student) session.load(de.hhn.ai.pmt.studyhelp.model.Student.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student getStudentByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Student) session.get(de.hhn.ai.pmt.studyhelp.model.Student.class, Integer.valueOf(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStudent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return queryStudent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return listStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryStudent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Student as Student");
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
	
	public static List queryStudent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Student as Student");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Student", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStudent(session, condition, orderBy);
			return (Student[]) list.toArray(new Student[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student[] listStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStudent(session, condition, orderBy, lockMode);
			return (Student[]) list.toArray(new Student[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return loadStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Student[] students = listStudentByQuery(session, condition, orderBy);
		if (students != null && students.length > 0)
			return students[0];
		else
			return null;
	}
	
	public static Student loadStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Student[] students = listStudentByQuery(session, condition, orderBy, lockMode);
		if (students != null && students.length > 0)
			return students[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateStudentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStudentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = GruppeAStudyhelpPersistentManager.instance().getSession();
			return iterateStudentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateStudentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Student as Student");
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
	
	public static java.util.Iterator iterateStudentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.studyhelp.model.Student as Student");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Student", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student createStudent() {
		return new de.hhn.ai.pmt.studyhelp.model.Student();
	}
	
	public static boolean save(de.hhn.ai.pmt.studyhelp.model.Student student) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().saveObject(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.studyhelp.model.Student student) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().deleteObject(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Student student)throws PersistentException {
		try {
			if (student.getStudiengang() != null) {
				student.getStudiengang().studenten.remove(student);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Veranstaltung[] lVeranstaltungens = student.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].studenten.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] lStellenangebotes = student.stellenangebote.toArray();
			for(int i = 0; i < lStellenangebotes.length; i++) {
				lStellenangebotes[i].studenten.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = student.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = student.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(student);
			}
			return delete(student);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.studyhelp.model.Student student, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (student.getStudiengang() != null) {
				student.getStudiengang().studenten.remove(student);
			}
			
			de.hhn.ai.pmt.studyhelp.model.Veranstaltung[] lVeranstaltungens = student.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].studenten.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Stellenangebot[] lStellenangebotes = student.stellenangebote.toArray();
			for(int i = 0; i < lStellenangebotes.length; i++) {
				lStellenangebotes[i].studenten.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Lernmaterial[] lLernmaterialiens = student.lernmaterialien.toArray();
			for(int i = 0; i < lLernmaterialiens.length; i++) {
				lLernmaterialiens[i].benutzer.remove(student);
			}
			de.hhn.ai.pmt.studyhelp.model.Forum[] lForens = student.foren.toArray();
			for(int i = 0; i < lForens.length; i++) {
				lForens[i].benutzer.remove(student);
			}
			try {
				session.delete(student);
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
	
	public static boolean refresh(de.hhn.ai.pmt.studyhelp.model.Student student) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().refresh(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.studyhelp.model.Student student) throws PersistentException {
		try {
			GruppeAStudyhelpPersistentManager.instance().getSession().evict(student);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Student loadStudentByCriteria(StudentCriteria studentCriteria) {
		Student[] students = listStudentByCriteria(studentCriteria);
		if(students == null || students.length == 0) {
			return null;
		}
		return students[0];
	}
	
	public static Student[] listStudentByCriteria(StudentCriteria studentCriteria) {
		return studentCriteria.listStudent();
	}
}
