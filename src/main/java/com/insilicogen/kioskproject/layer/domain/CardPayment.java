package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class CardPayment {
    private String cardPaymentId; // 카드 결제 id
    private String paymentId; // 결제 id
    private String cardNumber; // 카드 번호
    private String userNumber; // 사용자 번호

    // dummy
    public static CardPayment getCardPayment() {
        return CardPayment.builder().cardPaymentId("CP001").cardNumber("1234-2345-1234-1235").userNumber("1235-1234-6234-1235").build();
    }
}
