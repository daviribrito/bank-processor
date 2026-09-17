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

        switch (transaction.getType()) {
            case PIX:

                TransactionResult result = new TransactionResult(
                    TransactionStatus.SUCCESS,
                    "Transação PIX processada com sucesso!",
                    details
                );
                return result;
        
            case TED:

                return new TransactionResult(
                    TransactionStatus.ERROR,
                    "Transação TED não aceita no momento! Estamos trabalhando no cenário.",
                    details
                );
                    
             case CREDITO:

                return new TransactionResult(
                    TransactionStatus.ERROR,
                    "Transação CREDITO não aceita no momento! Estamos trabalhando no cenário.",
                    details
                );

             case BOLETO:

                return new TransactionResult(
                    TransactionStatus.ERROR,
                    "Transação BOLETO não aceita no momento! Estamos trabalhando no cenário.",
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
                    "Tipo de transação não suportada.",
                    errordetails
                );
                
        }
    }
}