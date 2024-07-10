package com.lari.almacen.product.repository;

import com.lari.almacen.product.entity.Almacen;
import com.lari.almacen.product.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    public List<Producto> findByAlmacen(Almacen almacen);
}
