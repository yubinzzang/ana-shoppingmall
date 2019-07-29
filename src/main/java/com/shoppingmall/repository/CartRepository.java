package com.shoppingmall.repository;

import com.shoppingmall.domain.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Page<Cart> findAllByNormalUserIdOrderByCreatedDateDesc(Long userId, Pageable pageable);

    List<Cart> findAllByNormalUserId(Long userId);
}