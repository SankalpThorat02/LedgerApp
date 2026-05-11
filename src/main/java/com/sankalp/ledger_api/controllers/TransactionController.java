package com.sankalp.ledger_api.controllers;

import com.sankalp.ledger_api.dtos.TransactionDTO;
import com.sankalp.ledger_api.models.Transaction;
import com.sankalp.ledger_api.services.TransactionService;
import jakarta.persistence.GeneratedValue;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody TransactionDTO requestDto) {
        Transaction transaction = new Transaction();
        transaction.setAmount(requestDto.getAmount());
        transaction.setDescription(requestDto.getDescription());
        transaction.setType(requestDto.getType());

        return transactionService.createTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransaction() {
        return transactionService.getAllTransactions();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }
}
