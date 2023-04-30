package com.example.DMS.repository;

import com.example.DMS.Models.Dog;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Integer>{
	
List<Dog> findByName(String name);
}
