package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.ProductCategory;

public interface ProductCategoryDAO extends JpaRepository <ProductCategory, Long> {

}
