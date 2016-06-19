package com.ddd.infrastructure.persistence.hibernate;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Required;


/**
 * Functionality common to all Hibernate repositories.
 */
public class HibernateRepository {

  static SessionFactory sessionFactory;
  static ServiceRegistry serviceRegistry;
  
  static {
	  try {
		  Configuration configuration = new Configuration().configure();
		  serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		  sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	  } catch(HibernateException e) {
		  e.printStackTrace();
	  }
  }
  

  @Required
  public void setSessionFactory(final SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  protected Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  

}

