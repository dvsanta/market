package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
