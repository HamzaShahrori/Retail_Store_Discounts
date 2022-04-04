package com.example.demo.home;


import Products.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    private List<Product> data= Arrays.asList(
            new Product(1,"Potato","false",30,0),
            new Product(2,"Cola","false",10,0),
            new Product(3,"Chips","false",15,0),
            new Product(4,"rice","false",35,0),
            new Product(5,"oil","false",50,0),
            new Product(6,"chocolate","false",5,0),
            new Product(7,"mit","false",3,0)
    );

   @RequestMapping(value = "/")
   public List<Product> listProducts(){
return data;

   }
    @GetMapping(value ="/{name}" )
   public String greetingWithRole(@PathVariable String name){
return String.format("Welcome to the market as a %s",name);
    }
}
