package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String profession;

    public Customer(String name, Integer age, String gender, String profession) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }

    public Customer() { }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
