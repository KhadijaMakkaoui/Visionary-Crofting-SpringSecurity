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
    public class Customer extends Users implements Serializable {


        @OneToMany(mappedBy = "customer" , fetch = FetchType.LAZY)
        private List<Order> orders ;


}
