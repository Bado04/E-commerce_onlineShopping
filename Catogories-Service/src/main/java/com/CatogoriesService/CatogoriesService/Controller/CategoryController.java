package com.CatogoriesService.CatogoriesService.Controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.CatogoriesService.CatogoriesService.entity.Category;
import com.CatogoriesService.CatogoriesService.services.CategoryService;



@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	//@Autowired
	//private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public String save(@RequestBody Category category) {
		service.save(category);
		return "Category Added successfully!!";
	}
	
	@GetMapping("/{categoryId}")
	public Category getcategory(@PathVariable("categoryId") long categoryId) {
		return service.getCategory(categoryId);
	}
	
}

