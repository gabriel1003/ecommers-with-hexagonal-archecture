package com.ecommers.application.ports.input;

import com.ecommers.application.core.domain.Product;

import java.util.UUID;

public interface ProductsUseCases {
    Product createProduct(Product product);

    Product updateProduct(UUID id, Product product);

    void deletProduct(UUID id);

}
