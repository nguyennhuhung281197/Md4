package com.example.product.service;

import com.example.product.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService implements IProductService {

    private static final List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "rau", 20, "tươi", "vườn"));
        productList.add(new Product(2, "củ", 30, "tươi", "vườn"));
        productList.add(new Product(3, "quả", 40, "tươi", "vườn"));
        productList.add(new Product(4, "Nước", 50, "lạnh", "nhà máy"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Product> search(String name) {
      return   productList.stream().filter(product -> product.getNameProduct().equalsIgnoreCase(name)).collect(Collectors.toList());
    }


}
