package com.core.banking.core.service.internetbankingcoreservice.repository;

import com.core.banking.core.service.internetbankingcoreservice.model.entity.UtilityAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilityAccountRepository extends JpaRepository<UtilityAccountEntity, Long> {
    Optional<UtilityAccountEntity> findByProviderName(String provider);
}
