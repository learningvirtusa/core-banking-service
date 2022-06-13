package com.core.banking.core.service.internetbankingcoreservice.repository;

import com.core.banking.core.service.internetbankingcoreservice.model.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {}
