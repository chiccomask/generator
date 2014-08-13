/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author chiccomask
 */
public class Jpa {

    private static final EntityManagerFactory emf;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            emf  =Persistence.createEntityManagerFactory("acapulco_generator_jar_1.0-SNAPSHOTPU");
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static EntityManagerFactory getSessionFactory() {
        return emf;
    }
}
