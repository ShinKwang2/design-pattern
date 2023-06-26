package com.lightshoes.enjong.abstractfactory.domain.product.dao.mysql;

import com.lightshoes.enjong.abstractfactory.domain.product.Product;
import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB productId - " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from MySQL DB productId - " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySQL DB productId - " + product.getProductId());
    }
}
