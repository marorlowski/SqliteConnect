package Dao;

import Entiti.Tbl1;
import Util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class Tbl1Dao {


    public List<Tbl1> getAllTbl1() {
        List<Tbl1> things = new ArrayList<Tbl1>();


        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            things = (List<Tbl1>) session.createQuery("from Entiti.Tbl1").list();

        } catch (Exception e) {
            System.out.println("######## Nie działa ###############" + e.getMessage());
        }
        return things;
    }

}
