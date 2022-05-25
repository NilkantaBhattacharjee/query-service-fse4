package com.cts.skilltracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.skilltracker.entities.ProfileEntity;

public interface ProfileRepository extends MongoRepository<ProfileEntity, String> {

	Optional<ProfileEntity> findByUserId(String userId);

	List<ProfileEntity> findByNameLike(String name);

	Optional<ProfileEntity> findByAssociateId(String associateId);
}
