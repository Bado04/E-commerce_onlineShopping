package com.payment.paymentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.paymentService.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    
}

