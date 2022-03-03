package com.CatogoriesService.CatogoriesService.services;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.CatogoriesService.CatogoriesService.entity.Category;
import com.CatogoriesService.CatogoriesService.repository.CategoryRepo;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	public CategoryRepo categoryrepo;

	@Override
	public Category getCategory(long categoryId) {
		// TODO Auto-generated method stub
		return categoryrepo.findById(categoryId).get();
	}

	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub;
		categoryrepo.save(category);
		
	}

}
