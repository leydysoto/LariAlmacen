package com.lari.almacen.product.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="tbl_productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private Double stock;
    private Double precio;
    private String estado;
    @Column(name="fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @ManyToOne
    @JoinColumn(name="almacen_id")
    private Almacen almacen;
}
