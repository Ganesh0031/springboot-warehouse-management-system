package com.example.WMS.repository;

import com.example.WMS.entity.StockTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockTransferItemRepository extends JpaRepository<StockTransfer,Long> {
}
