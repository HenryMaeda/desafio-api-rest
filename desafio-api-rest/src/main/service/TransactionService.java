package service;

import domain.model.Transaction;

public interface TransactionService {
    Transaction executeTransaction(Long fromAccountId, Long toAccountId, BigDecimal amount);
}
