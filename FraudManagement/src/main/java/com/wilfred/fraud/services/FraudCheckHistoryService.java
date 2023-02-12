package com.wilfred.fraud.services;

import com.wilfred.fraud.models.FraudCheckHistory;
import com.wilfred.fraud.repositories.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckHistoryService {

    private FraudCheckHistoryRepository fraudCheckHistoryRepository;


    public boolean isFradulentCustomer(Long customerId) {
        fraudCheckHistoryRepository.save(FraudCheckHistory.builder()
                .customerId(customerId).isFraudSter(false).dateRecorded(LocalDateTime.now()).build());
        return false;
    }
}
