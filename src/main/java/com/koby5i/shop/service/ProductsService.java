package com.koby5i.shop.service;

import com.koby5i.shop.model.Product;

import java.util.List;

public interface ProductsService {
    Product saveProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long productId);

    Long numberOfproducts();

    List<Product> findAllProducts();
}
