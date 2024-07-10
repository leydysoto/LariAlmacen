package com.lari.almacen.product.Service;

import com.lari.almacen.product.entity.Producto;
import com.lari.almacen.product.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements  ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listadeProductos() {
        return productoRepository.findAll();
    }
}
