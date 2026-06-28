package com.example.WMS.repository;

import com.example.WMS.entity.GoodReceiptItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodReceiptItemRepository extends JpaRepository<GoodReceiptItem,Long> {
}
