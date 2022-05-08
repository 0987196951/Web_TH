package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Product;
import com.example.demo.data.ProductRepository;
import java.util.*;
import antlr.collections.List;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/storage")
public class StorageController {
	private final ProductRepository repository;
	@Autowired
	public StorageController(ProductRepository repository) {
		this.repository = repository;
	}
	@GetMapping
	public String showProduct(Model model) {
		ArrayList<Product> list = (ArrayList<Product>) repository.findAll();
		model.addAttribute("products",list);
		return "storage";
	}
}
