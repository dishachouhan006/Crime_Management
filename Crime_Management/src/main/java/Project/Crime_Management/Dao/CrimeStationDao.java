package Project.Crime_Management.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Project.Crime_Management.Crime;
import Project.Crime_Management.CrimeStation;

import java.util.List;

public class CrimeStationDao {

    private final SessionFactory sessionFactory;

    public CrimeStationDao() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void addCrimeStation(CrimeStation station) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(station);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public CrimeStation getCrimeStationById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(CrimeStation.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<CrimeStation> getAllCrimeStations() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM CrimeStation", CrimeStation.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateCrimeStation(CrimeStation station) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(station);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteCrimeStation(CrimeStation station) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(station);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

	public void addCrime(Crime crime) {
		// TODO Auto-generated method stub
		
	}
}
