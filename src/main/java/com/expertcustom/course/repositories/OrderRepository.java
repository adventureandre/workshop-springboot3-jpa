package com.expertcustom.course.repositories;

import com.expertcustom.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {}
