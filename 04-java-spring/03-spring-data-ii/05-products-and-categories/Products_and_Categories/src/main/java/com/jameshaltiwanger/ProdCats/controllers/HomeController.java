package com.jameshaltiwanger.ProdCats.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jameshaltiwanger.ProdCats.models.Category;
import com.jameshaltiwanger.ProdCats.models.Product;
import com.jameshaltiwanger.ProdCats.services.CategoryService;
import com.jameshaltiwanger.ProdCats.services.ProductService;

@Controller
	public class HomeController {
	@Autowired
	private ProductService pService;
	@Autowired 
	private CategoryService cService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Product> products = pService.getAllProducts();
		List<Category> categories = cService.getAllCategories();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "index.jsp";
	}
	
	@RequestMapping("/new/product")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/create/product")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newPruduct.jsp";
		}
		pService.createProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping("/new/category")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/create/category")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}
		cService.createCategory(category);
		return "redirect:/";
	}
	
	@GetMapping("/product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		Product thisProduct = pService.getProduct(id);
		model.addAttribute("product", thisProduct);
		List<Category> catNotInProduct = cService.findCategoriesNotInProduct(thisProduct);
		model.addAttribute("catAssociation", catNotInProduct);
		return "productShow.jsp";
	}
	
	@PostMapping("/product/{id}")
	public String addCategoryToProduct(@RequestParam("category") Long catId, @PathVariable("id") Long prodId) {
		Product thisProduct = pService.getProduct(prodId);
		Category chosenCat = cService.getCategory(catId);
		pService.addCatToProduct(chosenCat, thisProduct);
		return "redirect:/product/" + prodId;
	}
	
	@GetMapping("/category/{id}")
		public String showCategory(@PathVariable("id") Long id, Model model) {
			Category thisCategory = cService.getCategory(id);
			model.addAttribute("category", thisCategory);
			List<Product> prodNotInCategory = pService.findProductsNotInCategory(thisCategory);
			model.addAttribute("prodAssociation", prodNotInCategory);
			return "categoryShow.jsp";
		}
	@PostMapping("/category/{id}")
		public String addProductToCategory(@RequestParam("product") Long prodId, @PathVariable("id") Long catId) {
		Category thisCategory = cService.getCategory(catId);
		Product chosenProd = pService.getProduct(prodId);
		cService.addProdToCategory(chosenProd, thisCategory);
		return "redirect:/category/" + catId;
	}
}
