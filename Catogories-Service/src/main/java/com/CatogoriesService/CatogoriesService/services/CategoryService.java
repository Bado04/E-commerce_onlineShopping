package com.CatogoriesService.CatogoriesService.services;

import com.CatogoriesService.CatogoriesService.entity.Category;

public interface CategoryService {
	public Category getCategory(long categoryId);

	public void save(Category category);
}
