package com.pack.SpringBootRoleBasedSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.SpringBootRoleBasedSecurity.model.Product;
@Repository
public interface ProductRepsitory extends JpaRepository<Product, Long> {

}
