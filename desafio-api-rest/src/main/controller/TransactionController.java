package controller;

import domain.model.Transaction;
import service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> executeTransaction(@RequestParam Long fromAccountId,
                                                          @RequestParam Long toAccountId,
                                                          @RequestParam BigDecimal amount) {
        Transaction transaction = transactionService.executeTransaction(fromAccountId, toAccountId, amount);
        return ResponseEntity.ok(transaction);
    }
}
