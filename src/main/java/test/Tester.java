/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.EntityManager;

/**
 *
 * @author chiccomask
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManager em = Jpa.getSessionFactory().createEntityManager();

        em.getTransaction().begin();

        em.persist(new A());
        em.persist(new A());
        em.persist(new B());
        em.persist(new B());
        
        em.getTransaction().commit();
    }

}
