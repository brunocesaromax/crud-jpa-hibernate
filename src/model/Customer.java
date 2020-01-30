package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

    public Customer(String name, Integer age, String gender, String profession){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
    }
}