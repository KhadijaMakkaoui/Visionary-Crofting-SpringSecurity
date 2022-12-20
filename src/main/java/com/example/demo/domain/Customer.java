package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

    @Entity
    @Table(name = "customer")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class Customer implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        private Long id;
        private String nom;
        @Column(unique = true)
        private String email;
        @Column(unique = true)
        private String telephone;
        private String password;

        @OneToMany(mappedBy = "client" , fetch = FetchType.LAZY)
        private List<Order> orders ;


}
