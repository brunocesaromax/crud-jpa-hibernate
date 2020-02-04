package main;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ConsultWithJPQL {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager entityManager = emf.createEntityManager();

        List<Customer> customers = entityManager.createQuery("from Customer where gender = 'F' ", Customer.class)
                .getResultList();

        customers.forEach(customer -> System.out.println(customer.toString()));
    }
}
