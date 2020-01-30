package main;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaveFirstObject {
    public static void main(String[] args) {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("examplePU");
        EntityManager entityManager = emf.createEntityManager();

        Customer customer = new Customer("Bruno", 23, "M", "Web Developer");

        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();

        System.out.println("Cliente salvo com sucesso!");

//        entityManager.close();
    }
}
