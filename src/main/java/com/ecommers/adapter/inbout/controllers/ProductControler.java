package com.ecommers.adapter.inbout.controllers;

import com.ecommers.adapter.inbout.dto.ProductDTO;
import com.ecommers.adapter.outbout.service.ProductServiceAdapter;
import com.ecommers.application.core.domain.Product;
import com.ecommers.application.ports.input.ProductsUseCase;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductControler {

    @Inject
    ProductsUseCase productsUseCase;

    @Inject
    ProductServiceAdapter productServiceAdapter;

    @GET
    public Response findAll(@QueryParam("page") @DefaultValue("0") Integer page, @QueryParam("pageSize") @DefaultValue("10") Integer pageSize) {
        var products = productServiceAdapter.findAll(page, pageSize);
        return Response.ok(products).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@QueryParam("id")UUID id) {
        return Response.ok(productServiceAdapter.findById(id)).build();
    }

    @POST
    @Transactional
    public Response createProduct(@Valid ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setQuantity(Integer.parseInt(productDTO.getQuantity()));
        product.setPrice(Double.parseDouble(productDTO.getPrice()));

        return Response.ok(productsUseCase.createProduct(product)).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateProduct(@QueryParam("id") UUID id, ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setQuantity(Integer.parseInt(productDTO.getQuantity()));
        product.setPrice(Double.parseDouble(productDTO.getPrice()));

        return Response.ok(productsUseCase.updateProduct(id, product)).build();
    }

}