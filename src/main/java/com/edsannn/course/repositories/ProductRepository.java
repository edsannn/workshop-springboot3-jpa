package com.edsannn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsannn.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
