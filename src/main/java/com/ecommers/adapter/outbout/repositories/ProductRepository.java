package com.ecommers.adapter.outbout.repositories;

import com.ecommers.adapter.inbout.entities.ProductEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public class ProductRepository implements PanacheRepositoryBase<ProductEntity, UUID> {
}
