package com.davi.bankprocessor;

public class TransactionResult {

    private TransactionStatus status;
    private String message;
    private TransactionDetails details;

    public TransactionResult(TransactionStatus status, String message, TransactionDetails details){
        this.status = status;
        this.message = message;
        this.details = details;
    }
        public TransactionStatus getStatus(){
            return status;
        }
        public String getMessage(){
            return message;
        }
        public TransactionDetails getDetails(){
            return details;
        }
}