package com.sankalp.ledger_api.dtos;


import java.time.LocalDateTime;

public class TransactionDTO {
    private String description;
    private Double amount;
    private String type;

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

}
