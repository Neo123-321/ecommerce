package com.example.Eapp.productservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Eapp.productresp.productresp;
import com.example.Eapp.products.products;

@Service
public class productservice {
	@Autowired
	productresp presp;
	public void saveproduct(products p) {
      presp.save(p);}
	public List<products> searchProducts(String keyword) {
	    return presp.findByPnameContainingIgnoreCase(keyword);
	}

	
	public List<products> getproducts(){
		return presp.findAll();
	}
	  public Optional<products> getproductid(int id) {
	        return presp.findById(id);
	    }
	  public void deletebsid(int id) {
		  presp.deleteById(id);   
	  }
	// **New - Update Product**
	    public void updateProduct(int id, products updatedProduct) {
	        Optional<products> existingProduct = presp.findById(id);
	        if (existingProduct.isPresent()) {
	            products p = existingProduct.get();
	            p.setPname(updatedProduct.getPname());
	            p.setPrice(updatedProduct.getPrice());
	            p.setQuantity(updatedProduct.getQuantity());
	            presp.save(p);
	        }	     
	      }
}
