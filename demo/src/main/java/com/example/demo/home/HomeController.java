package com.example.demo.home;


import Products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
private ProductService productService;
   @RequestMapping(value = "/")
   public List<Product> getAllProducts(){
       return productService.findAll();

   }
@GetMapping("/{id}")
public Product getProductsById(@PathVariable int id ){
return productService.getById(id);
}

@PutMapping("/{id}")
    public Product addToCart(@PathVariable("id") int id,@RequestBody Product product){
       return productService.addToBill(id,product);
}


    @GetMapping("/cart/{addToCart}")
    public Product getCart(@PathVariable String addToCart ){
        return productService.getCart(addToCart);
    }
    @GetMapping(value ="/{role}" )
   public List<Product>  findAllProductWithDiscount(@PathVariable String role){
return  productService.findAllProductWithDiscount();
    }
//    @PutMapping(value ="/cart/{id}" )
//    Product replaceProduct(@RequestBody Product newProduct,@PathVariable Long id){
//       return  data.stream().map(product -> )
//    }



}
