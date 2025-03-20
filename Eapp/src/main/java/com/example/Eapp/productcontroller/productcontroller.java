package com.example.Eapp.productcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Eapp.products.products;
import com.example.Eapp.productservice.productservice;

import jakarta.transaction.Transactional;

@Controller


public class productcontroller {
	@Autowired
	productservice ps;
	@GetMapping("/")
	public String get1() {
		return"index";
	}
	@GetMapping("/search")
	public String searchProducts(@RequestParam("query") String query, Model model) {
	    List<products> searchResults = ps.searchProducts(query);
	    model.addAttribute("plist", searchResults);
	    return "pdtlist"; // Redirect to product list page with filtered results
	}
	
	@GetMapping("/add1")
	 public String add1() {
		return "addpdt";
	};
	
	
	
	@PostMapping("/add")
	@Transactional
	public String result(products p) {
		ps.saveproduct(p);
		return "redirect:/productlist";
		
	}
	@GetMapping("/productlist")
	public String showproducts(Model model) {
		model.addAttribute("plist",ps.getproducts());
		return"pdtlist";
	}
	@GetMapping("/specific/{id}")
	public String showproductid(@PathVariable int id, Model model) {
	    Optional<products> p = ps.getproductid(id);
	    if (p.isPresent()) {
	        model.addAttribute("pid", p.get());
	        return "specific";
	    } else {
	        return "error";
	    }
	}
	@GetMapping("/delete/{id}")
	public String deletepdt(@PathVariable int id) {
		ps.deletebsid(id);
		return "remain";
	} 
    // **New - Edit Product Page**
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {
        Optional<products> p = ps.getproductid(id);
        if (p.isPresent()) {
            model.addAttribute("product", p.get());
            return "editpdt";
        } else {
            return "error";
        }      
        
    }
    // **New - Update Product**
    @PostMapping("/update/{id}")
    @Transactional
    public String updateProduct(@PathVariable int id, @ModelAttribute products updatedProduct) {
        ps.updateProduct(id, updatedProduct);
        return "redirect:/productlist";
    }


	
	}


	
		
		
	


