package com.ecommers.application.ports.output;

import com.ecommers.application.core.domain.Product;

import java.util.List;
import java.util.UUID;

public interface ProductsRepository {

    List<Product> findAll(Integer page, Integer pageSize);

    Product findById(UUID id);

}
