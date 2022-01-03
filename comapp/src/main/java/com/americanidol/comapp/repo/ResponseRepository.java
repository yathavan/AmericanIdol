package com.americanidol.comapp.repo;


import org.springframework.data.repository.CrudRepository;

import com.americanidol.comapp.domain.Response;

public interface ResponseRepository extends CrudRepository<Response, Long> {

	Response findById(long id);

}
