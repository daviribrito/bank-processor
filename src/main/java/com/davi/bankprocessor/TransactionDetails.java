package com.davi.bankprocessor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDetails {

    private String id;
    private TransactionType type;
    private BigDecimal amount;
    private LocalDateTime processedAt;

    public TransactionDetails (String id, TransactionType type, BigDecimal amount, LocalDateTime processedAt){
        
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.processedAt = processedAt;
        
    }
        public String getId(){
            return id;
        }
        public TransactionType getType(){
            return type;
        }
        public BigDecimal getAmount(){
            return amount;
        }
        public LocalDateTime getProcessedAt(){
            return  processedAt;
        }

}