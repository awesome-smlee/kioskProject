package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class PaymentInfo {
    private final String paymentId; // 결제 id
    private final String paymentInfoId; // 결제정보 id
    private final String userNumber; // 사용자 번호
    private final int paymentAmount; // 결제금액

    // 카드 결제 정보
    private final String cardNumber; // 카드 번호
    private final String cardExpiryDate; // 카드 유효기간
    private final int cardCVC;// 카드 CVC
    private final String cardOwner; // 카드 소유자명

    // 현금 결제 정보
    private final String cashPaymentDetail; // 현금 결제 관련 세부 정보

    // 쿠폰 결제 정보
    private final String couponCode; // 쿠폰 정보

    // dummy
    public static PaymentInfo getPaymentInfo() {
        return PaymentInfo.builder().cardNumber("1234-5678-1234-5678").userNumber("1235-1234-6234-1235").build();
    }
}
