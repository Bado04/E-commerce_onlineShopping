package com.CatogoriesService.CatogoriesService.repository;
import com.CatogoriesService.CatogoriesService.entity.Category;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




//It is also called DAO file

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
	

}

