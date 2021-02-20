package com.jameshaltiwanger.ProdCats.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jameshaltiwanger.ProdCats.models.Category;
import com.jameshaltiwanger.ProdCats.models.Product;
import com.jameshaltiwanger.ProdCats.repositories.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository pRepo;

	public List<Product> getAllProducts() {
		return pRepo.findAll();
	}
	
	public Product createProduct(Product p) {
		return pRepo.save(p);
	}
	
	public Product getProduct(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCatToProduct(Category category, Product product) {
		List<Category> chosenCats = product.getCategories();
		chosenCats.add(category);
		this.pRepo.save(product);
	}
}
