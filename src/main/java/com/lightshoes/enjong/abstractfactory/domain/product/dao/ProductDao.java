package com.lightshoes.enjong.abstractfactory.domain.product.dao;

import com.lightshoes.enjong.abstractfactory.domain.product.Product;

public interface ProductDao {

    public void insertProduct(Product product);
    public void deleteProduct(Product product);
    public void updateProduct(Product product);
}
