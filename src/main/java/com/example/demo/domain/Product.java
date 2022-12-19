package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String reference;
    private String name;
    private Float initialPrice;
    private String description;
    private int quantity;
    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems = new ArrayList<>();
    @JsonIgnore
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
    @JsonSetter
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
