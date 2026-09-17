package com.davi.bankprocessor;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        Transaction transaction = new Transaction(
            "001",
            TransactionType.CREDITO,
            new BigDecimal("150.00")
        );

        
        TransactionProcessor processor = new TransactionProcessor();

        TransactionResult result = processor.process(transaction);
            
            DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("ID: " + result.getDetails().getId());
        System.out.println("Valor: " + result.getDetails().getAmount());
        System.out.println("Tipo: " + result.getDetails().getType());
        System.out.println("Status: " + result.getStatus());
        System.out.println("Mensagem: " + result.getMessage());
        System.out.println("Processado: " + result.getDetails().getProcessedAt().format(formatter));

    }

}