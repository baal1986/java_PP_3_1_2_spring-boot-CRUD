package com.example.java_pp_3_1_2_springbootcrud.model;




import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name = "users")
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public User() {
    }


    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User {\n" +
                "\tid = " + id + '\n' +
                "\tfirstName = " + firstName + '\n' +
                "\tlastName = " + lastName + '\n' +
                "\temail = " + email + '\n' +
                '}' + "\n";
    }

}

