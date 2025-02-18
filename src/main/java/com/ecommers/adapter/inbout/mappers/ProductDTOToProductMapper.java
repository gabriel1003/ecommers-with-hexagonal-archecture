package com.ecommers.adapter.inbout.mappers;

import com.ecommers.adapter.inbout.dto.ProductDTO;
import com.ecommers.application.core.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProductDTOToProductMapper {

    Product mapper(ProductDTO productDTO);
}
