package main;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateFirstObject {
    public static void main(String[] args) {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("examplePU");
        EntityManager entityManager = emf.createEntityManager();

        Customer customerPersisted = entityManager.find(Customer.class, 4L);

        entityManager.getTransaction().begin();

        customerPersisted.setAge(60);
        customerPersisted.setGender("F");
        customerPersisted.setName("Dani");
        customerPersisted.setProfession("Vendedora");

        entityManager.getTransaction().commit();

        System.out.println("Cliente atualizado com sucesso!");
    }
}
