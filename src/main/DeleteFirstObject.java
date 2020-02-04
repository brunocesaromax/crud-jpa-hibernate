package main;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteFirstObject {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager entityManager = emf.createEntityManager();

        //Não funciona dessa maneira, pois o objeto não é conhecido pelo entity manager
//        Customer customer = new Customer();
//        customer.setId(5L);

        Customer customerPersisted = entityManager.find(Customer.class, 5L);

        entityManager.getTransaction().begin();
        entityManager.remove(customerPersisted);
        entityManager.getTransaction().commit();

        System.out.println("Objeto removido com sucesso!");
    }
}
