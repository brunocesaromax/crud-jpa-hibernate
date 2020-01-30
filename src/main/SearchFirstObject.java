package main;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchFirstObject {
    public static void main(String[] args) {
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("examplePU");
        EntityManager entityManager = emf.createEntityManager();

        Customer customerPersisted = entityManager.find(Customer.class, 1L);

        if (customerPersisted != null) {
            System.out.println(customerPersisted.toString());
        }else{
            System.out.println("Cliente não encontrado!");
        }
    }
}
