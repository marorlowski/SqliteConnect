package Dao;

import Entiti.Adres;
import Util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;


public class AdresDao {
    public List<Adres> getAllAdres() {
        List<Adres> things = new ArrayList<Adres>();


        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
//            things = (List<Adres>) session.createQuery(" from Entiti.Adres a where a.miasto='Legionowo'").list();
            things = (List<Adres>) session.createQuery("from Entiti.Adres").list();


        } catch (Exception e) {
            System.out.println("######## Nie działa ###############" + e.getMessage());
        }

        return things;

    }

}
