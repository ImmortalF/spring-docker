package com.code.springdockercompose.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastname;


    public Customer(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }
}
