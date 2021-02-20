package com.jameshaltiwanger.ProdCats.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.ProdCats.models.Category;
import com.jameshaltiwanger.ProdCats.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
