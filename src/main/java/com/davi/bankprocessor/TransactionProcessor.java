package com.davi.bankprocessor;

import java.time.LocalDateTime;

public class TransactionProcessor {

    public TransactionResult process (Transaction transaction){
        
        TransactionDetails details = new TransactionDetails(
                    transaction.getId(),
                    transaction.getType(),
                    transaction.getAmount(),
                    LocalDateTime.now()
                );

        switch (transaction.getType().getAvailability()) {
            case AVAILABLE:
                return new TransactionResult(
                    TransactionStatus.SUCCESS,
                    "Transação " + details.getType() + " processada com sucesso!",
                    details
                );
                
                case MAINTENANCE:
                return new TransactionResult(
                    TransactionStatus.ERROR,
                    "Transação do tipo " + details.getType() + " em manutenção!",
                    details
                );
        
            default:
                TransactionDetails errordetails = new TransactionDetails(
                    transaction.getId(),
                    transaction.getType(),
                    transaction.getAmount(),
                    LocalDateTime.now()
                );
                
                return new TransactionResult(
                    TransactionStatus.ERROR,
                    "Transação do tipo:" + details.getType() + " não válida!",
                    errordetails
                );
                
        }
    }
}