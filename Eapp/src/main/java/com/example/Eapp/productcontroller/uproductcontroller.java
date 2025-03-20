package com.example.Eapp.productcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Eapp.productservice.productservice;

@Controller
public class uproductcontroller {
	    @Autowired
        productservice ps;
        
        @GetMapping("/productlist1")
    	public String showproducts(Model model) {
    		model.addAttribute("plist1",ps.getproducts());
    		return"pdtlist1";
    	}
        
}
