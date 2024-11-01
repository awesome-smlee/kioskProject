package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Receipt {
    private final String paymentInfoId; // 결제정보 id
    private final String orderId; // 주문 id
    private final int paymentType; // 결제 수단 (1:카드,2:쿠폰,3:현금)
    private final int paymentAmount; // 결제 금액
    private final String paymentDate; // 결제 일시

    // 상점 정보(임시로 여기에 추가함)
    private final String storeName; // 상점 이름
    private final String storeAddress; // 상점 주소
    private final String storePhone; // 상점 전화번호

    // dummy
    public static Receipt getReceipt() {
        return Receipt.builder()
                .paymentType(1)
                .paymentAmount(100000)
                .paymentDate("2024-10-31 00:00:00")
                .storeName("인코벅스")
                .storeAddress("대전 유성구 문지로 272-7")
                .storePhone("010-5324-6883")
                .build();
    }
}
