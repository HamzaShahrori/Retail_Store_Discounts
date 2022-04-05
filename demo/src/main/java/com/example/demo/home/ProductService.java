package com.example.demo.home;

import Products.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {
    private List<Product> data=new ArrayList<>(Arrays.asList(
            new Product(1,"Potato","true",30,0),
            new Product(2,"Cola","true",10,0),
            new Product(3,"Chips","false",15,0),
            new Product(4,"rice","false",35,0),
            new Product(5,"oil","false",50,0),
            new Product(6,"chocolate","false",5,0),
            new Product(7,"mit","false",3,0)
    )) ;

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

    public List<Product> getCart() {

//        System.out.println("service");
        return (List<Product>) data.stream().filter(element ->element.getAddToCart()=="true").collect(Collectors.toList());
    }

//    public Product findAllProductWithDiscount(String role) {
//        int discount =50;
//        data.stream().forEach(element ->{
//            if(role=="employee"){
//;
//
//            }
//
//        });
//
//        return null;
//    }
}
