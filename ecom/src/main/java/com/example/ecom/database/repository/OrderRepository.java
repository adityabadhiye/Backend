package com.example.ecom.database.repository;

import com.example.ecom.database.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Optional<Order> findByIdAndUserId(Long id,Long userId);
    Page<Order> findAllByUserId(Long userId, Pageable pageable);
}
