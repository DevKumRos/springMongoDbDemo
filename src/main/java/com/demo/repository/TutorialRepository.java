package com.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
	  List<Tutorial> findByTitleContaining(String title);
	  List<Tutorial> findByPublished(boolean published);
	}
