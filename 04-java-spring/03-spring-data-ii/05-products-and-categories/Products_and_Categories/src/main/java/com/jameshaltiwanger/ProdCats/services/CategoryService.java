package com.jameshaltiwanger.ProdCats.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jameshaltiwanger.ProdCats.models.Category;
import com.jameshaltiwanger.ProdCats.models.Product;
import com.jameshaltiwanger.ProdCats.repositories.CategoryRepository;

@Service
public class CategoryService {
@Autowired
private CategoryRepository cRepo;

	public List<Category> getAllCategories() {
		return cRepo.findAll();
	}
	
	public Category createCategory(Category c) {
		return cRepo.save(c);
	}
	
	public Category getCategory(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	
	public void addProdToCategory(Product product, Category category) {
		List<Product> chosenProds = category.getProducts();
		chosenProds.add(product);
		this.cRepo.save(category);
	}
}
