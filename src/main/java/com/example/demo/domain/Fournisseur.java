package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "fournisseur")
public class Fournisseur extends Users  implements Serializable {

}
