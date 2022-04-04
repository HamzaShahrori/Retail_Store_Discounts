package com.example.demo.home;

import Products.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private List<Product> data= Arrays.asList(
            new Product(1,"Potato","false",30,0),
            new Product(2,"Cola","false",10,0),
            new Product(3,"Chips","false",15,0),
            new Product(4,"rice","false",35,0),
            new Product(5,"oil","false",50,0),
            new Product(6,"chocolate","false",5,0),
            new Product(7,"mit","false",3,0)
    );

    public List<Product> findAll() {
        return data;
    }

    public Product getById(int id) {
        for (Product product:data){
            if (product.getId()==id) return product;
        }
        return null;
    }

    public Product addToBill(int id, Product product) {
        data.stream().forEach(element ->{
            if(element.getId()==id){
                element.setAddToCart(product.getAddToCart());
            }
        });
        return data.stream().filter(element ->element.getId()==id).findFirst().get();
    }

    public Product getCart(String addToCart) {
        for (Product product:data){
            if (product.getAddToCart()==addToCart) return product;
        }
        return null;
    }
}
