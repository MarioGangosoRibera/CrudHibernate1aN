package com.example.crudhibernate1an.util;

import com.example.crudhibernate1an.Model.Coche;
import com.example.crudhibernate1an.Model.Multa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	static SessionFactory factory = null;
	static {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// Se registran las clases que hay que MAPEAR con cada tabla de la base de datos
		cfg.addAnnotatedClass(Coche.class);
		cfg.addAnnotatedClass(Multa.class);

		factory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static Session getSession() {
		return factory.openSession();
	}
	
	
}
