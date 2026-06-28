package com.example.WMS.repository;

import com.example.WMS.entity.SalesOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleOrderItemRepository extends JpaRepository<SalesOrderItem,Long> {
}
