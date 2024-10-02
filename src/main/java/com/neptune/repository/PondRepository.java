package com.neptune.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.neptune.entity.Pond;

public interface PondRepository extends MongoRepository<Pond, String> {
}
