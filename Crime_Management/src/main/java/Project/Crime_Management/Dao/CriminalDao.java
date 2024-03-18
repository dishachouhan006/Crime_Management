package Project.Crime_Management.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Project.Crime_Management.Criminal;

import java.util.List;

public class CriminalDao {

    private final SessionFactory sessionFactory;

    public CriminalDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void addCriminal(Criminal criminal) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(criminal);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Criminal getCriminalById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Criminal.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Criminal> getAllCriminals() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Criminal", Criminal.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateCriminal(Criminal criminal) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(criminal);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteCriminal(Criminal criminal) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(criminal);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
