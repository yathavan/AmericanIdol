package com.americanidol.comapp.repo;


import org.springframework.data.repository.CrudRepository;

import com.americanidol.comapp.domain.AdditionalInfo;

public interface AdditionalInfoRepository extends CrudRepository<AdditionalInfo, Long> {

	AdditionalInfo findById(long id);

}
