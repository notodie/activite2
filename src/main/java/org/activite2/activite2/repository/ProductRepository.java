package org.activite2.activite2.repository;

import org.activite2.activite2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
 List<Product> findByNameContains(String mc);
 @Query("SELECT p FROM Product p WHERE p.price > :price")
 List<Product> searchByPrice(double price);
 @Query("select p from Product p where p.name like :x")
 List<Product> search(@Param("x") String mc);


}
