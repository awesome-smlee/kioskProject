package com.insilicogen.kioskproject.layer.application.service;

import com.insilicogen.kioskproject.layer.domain.Menu;
import com.insilicogen.kioskproject.layer.domain.PaymentInfo;
import com.insilicogen.kioskproject.layer.domain.Receipt;

import java.util.List;

public interface OrderService {

    public List<Menu> getMenu();

    public PaymentInfo getPaymentInfo();

    public Receipt getReceipt();

    public String requestCardPayment(PaymentInfo paymentInfo);

    public String requestCouponPayment(PaymentInfo paymentInfo);

    public String requestCashPayment();

    public String cancelOrder(int orderId);

    public String cancelPayment(int paymentId);
}
