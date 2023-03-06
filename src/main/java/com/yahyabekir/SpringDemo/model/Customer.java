package com.yahyabekir.SpringDemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@Table(name = "customer", schema = "public")
@NoArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(name = "created_date")
    private Date joinDate;

    public Customer(String name, String email, Date joinDate) {
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
    }
}
