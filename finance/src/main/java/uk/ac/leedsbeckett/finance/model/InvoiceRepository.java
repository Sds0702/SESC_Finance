package uk.ac.leedsbeckett.finance.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository {
    List<Invoice> findInvoiceByAccount_IdAndStatus(Long accountId, Status status);
    Invoice findInvoiceByReference(String reference);
}
