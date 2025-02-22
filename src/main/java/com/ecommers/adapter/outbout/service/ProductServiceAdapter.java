package com.ecommers.adapter.outbout.service;

import com.ecommers.adapter.inbout.entities.ProductEntity;
import com.ecommers.adapter.inbout.mappers.ProductDTOToProductMapper;
import com.ecommers.adapter.inbout.mappers.ProductEntityToProductMapper;
import com.ecommers.adapter.inbout.mappers.ProductToProductEntityMapper;
import com.ecommers.adapter.outbout.repositories.ProductRepository;
import com.ecommers.application.core.domain.Product;
import com.ecommers.application.ports.output.ProductsRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class ProductServiceAdapter implements ProductsRepository {

@Inject
    ProductRepository product;

@Inject
    ProductToProductEntityMapper productToProductEntityMapper;

    @Inject
    ProductEntityToProductMapper productEntityToProductMapper;

    @Inject
    ProductDTOToProductMapper


    @Override
    @Transactional
    public List<Product> findAll(Integer page, Integer pageSize) {
        return product.findAll().page(page, pageSize).list();
    }

    @Override
    @Transactional
    public Product findById(UUID id) {
        return (ProductEntity) product.findByIdOptional(id).orElseThrow();
    }
}
