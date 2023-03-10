package com.example.ecom.database.repository;

import com.example.ecom.database.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart,Long> {
    Cart findByUserId(Long userId);
}
