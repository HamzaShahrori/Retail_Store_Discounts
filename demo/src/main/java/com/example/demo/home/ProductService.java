package com.example.demo.home;

import Products.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public int getCart(String role) {
        System.out.println(role.equals("employe") );
        System.out.println(role);
        int i=0;
if(role.equals("employe")){ i = data.stream().filter(element -> role.equals("employe")&&element.getAddToCart()=="true").mapToInt(Product::getPrice).sum();}

i=i-(i*30/100);
        return i;

//        System.out.println(role);
//        return (List<Product>) data.stream().filter(element ->element.getAddToCart()=="true").collect(Collectors.toList());
    }


    public int getDiscountForRegularCustomer(String roleForCustomer) {
        System.out.println(roleForCustomer.equals("RegularCustomer") );
        System.out.println(roleForCustomer);
        int i=0;
        if(roleForCustomer.equals("RegularCustomer")){ i = data.stream().filter(element -> roleForCustomer.equals("RegularCustomer")&&element.getAddToCart()=="true").mapToInt(Product::getPrice).sum();}

        i=i-(i*10/100);
        return i;

//        System.out.println(role);
//        return (List<Product>) data.stream().filter(element ->element.getAddToCart()=="true").collect(Collectors.toList());
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
