package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Payment {
    private final String paymentId; // 결제 id
    private final String orderId; // 주문 id
    private final int paymentAmount; // 결제금액
    private final String paymentDate; // 결제일시
    private final int paymentType; // 결제 수단 (1:카드,2:쿠폰,3:현금)
    private final String status; // 결제 상태 (1:성공, 0:실패)

    public static Payment getPayment() {
        return Payment.builder().paymentId("P001").paymentDate("2022-01-01 12:00:00").paymentAmount(10000).paymentType(1).build();
    }
}
