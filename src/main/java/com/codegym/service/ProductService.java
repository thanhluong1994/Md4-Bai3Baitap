package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer,Product> products;
    static {
        products=new HashMap<>();
        products.put(1,new Product(1,"May Giat",300000,"Loai to","LG"));
        products.put(2,new Product(2,"Tu Lanh",5000000,"500l","LG"));
        products.put(3,new Product(3,"Dieu Hoa",400000,"Loai nho","SamSung"));
        products.put(4,new Product(4,"Quat",500000,"Mau Trang","Dien Co 91"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
