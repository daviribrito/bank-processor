package com.davi.bankprocessor;


public enum TransactionType {
    PIX(TransactionAvailability.AVAILABLE),
    CREDITO(TransactionAvailability.MAINTENANCE),
    TED(TransactionAvailability.MAINTENANCE),
    BOLETO(TransactionAvailability.MAINTENANCE);

    private TransactionAvailability availability;

    private TransactionType (TransactionAvailability availability){
        this.availability = availability;

    }

    public TransactionAvailability getAvailability(){
        return availability;
    }

}