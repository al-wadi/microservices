package com.wadi.order.kafka;



import com.wadi.order.customer.CustomerResponse;
import com.wadi.order.order.PaymentMethod;
import com.wadi.order.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
