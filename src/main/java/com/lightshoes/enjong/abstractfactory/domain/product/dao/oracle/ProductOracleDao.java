package com.lightshoes.enjong.abstractfactory.domain.product.dao.oracle;

import com.lightshoes.enjong.abstractfactory.domain.product.Product;
import com.lightshoes.enjong.abstractfactory.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Oracle DB productId - " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from Oracle DB productId - " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Oracle DB productId - " + product.getProductId());
    }
}
