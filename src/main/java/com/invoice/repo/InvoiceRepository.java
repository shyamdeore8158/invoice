package com.invoice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invoice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
