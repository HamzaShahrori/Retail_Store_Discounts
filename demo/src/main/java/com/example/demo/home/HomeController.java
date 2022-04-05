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
    @GetMapping("/cart")
    public List<Product> getCart(){
//        System.out.println("endpoint");
        return  productService.getCart();
    }
@GetMapping("/{id}")
public Product getProductsById(@PathVariable int id ){
return productService.getById(id);
}

@PutMapping("/{id}")
    public Product addToCart(@PathVariable("id") int id,@RequestBody Product product){
       return productService.addToBill(id,product);
}



//    @GetMapping(value ="/{role}" )
//   public Product  findAllProductWithDiscount(@PathVariable String role){
//return  productService.findAllProductWithDiscount(role);
//    }
//    @PutMapping(value ="/cart/{id}" )
//    Product replaceProduct(@RequestBody Product newProduct,@PathVariable Long id){
//       return  data.stream().map(product -> )
//    }



}
