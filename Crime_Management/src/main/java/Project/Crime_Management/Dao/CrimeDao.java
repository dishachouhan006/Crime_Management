package Project.Crime_Management.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Project.Crime_Management.Crime;

public class CrimeDao {

    private final SessionFactory sessionFactory;

    public CrimeDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void addCrime(Crime crime) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(crime);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Crime getCrimeById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Crime.class, id);
        }
    }

    public void updateCrime(Crime crime) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(crime);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteCrime(Crime crime) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(crime);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}

