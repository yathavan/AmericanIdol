package com.americanidol.comapp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.americanidol.comapp.domain.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	Item findById(long id);
	Item findByName(String name);
	Item findByNameIgnoreCase(String name);
	List<Item> findByNameInIgnoreCase(List<String> names);
}
