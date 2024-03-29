package org.example.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.example.springcloud.entities.Payment;

public interface PaymentService {
    Payment create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
