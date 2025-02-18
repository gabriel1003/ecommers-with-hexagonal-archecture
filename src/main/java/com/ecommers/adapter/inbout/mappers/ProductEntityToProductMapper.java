package com.ecommers.adapter.inbout.mappers;

import com.ecommers.adapter.inbout.entities.ProductEntity;
import com.ecommers.application.core.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProductEntityToProductMapper {

    Product productMapper(ProductEntity product);
}
