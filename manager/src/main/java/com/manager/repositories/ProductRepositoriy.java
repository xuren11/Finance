package com.manager.repositories;


import com.manager.model.jpa.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 产品repositories
 */
public interface ProductRepositoriy extends JpaRepository<Product,Integer>, JpaSpecificationExecutor<Product> {


}
