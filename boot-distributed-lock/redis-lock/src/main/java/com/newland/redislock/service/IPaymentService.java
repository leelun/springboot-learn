package com.newland.redislock.service;

import java.math.BigDecimal;

public interface IPaymentService {
    String payment(String account, BigDecimal money,String orderId);
}
