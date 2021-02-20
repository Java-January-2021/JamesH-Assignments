package com.jameshaltiwanger.ProdCats.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jameshaltiwanger.ProdCats.models.Category;
import com.jameshaltiwanger.ProdCats.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
