package com.example.WMS.repository;

import com.example.WMS.entity.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleOrderRepository extends JpaRepository<SalesOrder,Long> {
}
