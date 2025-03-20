package com.example.Eapp.productresp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Eapp.products.products;

public interface productresp extends JpaRepository<products,Integer> {
	List<products> findByPnameContainingIgnoreCase(String pname);
}

