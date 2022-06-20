package com.cts.skilltracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cts.skilltracker.entities.ProfileEntity;

public interface ProfileRepository extends MongoRepository<ProfileEntity, String> {

	Optional<ProfileEntity> findByUserId(String userId);

	@Query("{'name':{'$regex':'?0','$options':'i'}}")
	List<ProfileEntity> searchByName(String name);

	Optional<ProfileEntity> findByAssociateId(String associateId);
}
