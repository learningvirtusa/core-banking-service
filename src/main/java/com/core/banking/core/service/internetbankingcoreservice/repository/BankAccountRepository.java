package com.core.banking.core.service.internetbankingcoreservice.repository;

import com.core.banking.core.service.internetbankingcoreservice.model.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    Optional<BankAccountEntity> findByNumber(String accountNumber);
}
