package com.ecommers.adapter.inbout.mappers;

import com.ecommers.adapter.inbout.entities.ProductEntity;
import com.ecommers.application.core.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProductToProductEntityMapper {

    ProductEntity productEntityMapper(Product product);
}
