package com.ecommers.application.core.services;

import com.ecommers.application.core.domain.Product;
import com.ecommers.application.ports.input.ProductsUseCase;
import com.ecommers.application.ports.output.ProductsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductsUseCase {

    private final ProductsRepository productsRepository;

    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public Product createProduct(Product product) {
        List<Product> products = new ArrayList<>();
        products.add(product);
        return product;
    }

    @Override
    public Product updateProduct(UUID id, Product product) {
        var prod = productsRepository.findById(id);
        prod.setName(product.getName());
        return prod;
    }

    @Override
    public void deletProduct(UUID id) {
        List<Product> products = productsRepository.findById(id);
        products.remove(id);
    }
}
