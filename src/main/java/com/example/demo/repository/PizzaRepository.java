package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Pizza;


public interface PizzaRepository {

	List<Pizza> findAll();

	List<Pizza> findByNameLike(String keyword);

	Optional<Pizza> findById(Integer id);

}
