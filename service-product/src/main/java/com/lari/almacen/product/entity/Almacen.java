package com.lari.almacen.product.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tbl-almacenes")
@Data
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
}
