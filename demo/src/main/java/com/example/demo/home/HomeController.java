package com.example.demo.home;


import Products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        return  productService.getCart();
    }




    @GetMapping("/bill/{role}")
    public int getDiscountForEmployee(@PathVariable String role){

        return  productService.getDiscountForEmployee(role);
    }

    @GetMapping("/price/{roleForCustomer}")
    public int getDiscountForRegularCustomer(@PathVariable String roleForCustomer){

        return  productService.getDiscountForRegularCustomer(roleForCustomer);
    }
@GetMapping("/{id}")
public Product getProductsById(@PathVariable int id ){
return productService.getById(id);
}

@PutMapping("/{id}")
    public Product addToCart(@PathVariable("id") int id,@RequestBody Product product){
       return productService.addToBill(id,product);
}







}
