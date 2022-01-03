package com.americanidol.comapp.repo;


import org.springframework.data.repository.CrudRepository;

import com.americanidol.comapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findById(long id);

}
