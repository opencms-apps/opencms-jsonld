package com.timsdt.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.timsdt.core.jsonld.Brand;
import com.timsdt.core.jsonld.Organization;
import com.timsdt.core.jsonld.Product;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter writer = objectMapper.writerWithDefaultPrettyPrinter();
        Product product = new Product();
        product.productName = "Example Name";
        product.setBrand(new Brand());

        String personJsonLd = writer.writeValueAsString(product);
        System.out.println(personJsonLd);
    }
}
