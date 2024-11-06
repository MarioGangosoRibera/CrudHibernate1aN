package com.example.crudhibernate1an.DAO;

import com.example.crudhibernate1an.Model.Coche;
import com.mysql.cj.Session;

import java.util.List;

public class CocheDAO {


    public List<Coche> listarCoches(org.hibernate.Session session) {
        session.beginTransaction();
        List<Coche> listaCoches;
        listaCoches = session.createQuery("from Coche", Coche.class).list();
        session.getTransaction().commit();
        return listaCoches;
    }

}
