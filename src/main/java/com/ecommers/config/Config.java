package com.ecommers.config;

import com.ecommers.application.core.services.ProductServiceImpl;
import com.ecommers.application.ports.input.ProductsUseCase;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;
import jakarta.ws.rs.DefaultValue;

@Dependent
public class Config {

@Default
    public ProductServiceImpl productService() {
    return
}
}
