package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class Payment {
    private final String paymentId; // 결제 id
    private final String orderId; // 주문 id
    private final String paymentDate; // 결제일시
    private final int paymentAmount; // 결제금액

    public static List<Payment> getPaymentList() {
        return List.of(
                Payment.builder().paymentId("P001").orderId("R001").paymentDate("2022-01-01 12:00:00").paymentAmount(10000).build()
        );
    }
}
