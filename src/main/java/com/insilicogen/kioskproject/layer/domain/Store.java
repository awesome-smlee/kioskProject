package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Store {
    private final String storeName; // 상점 이름
    private final String storeAddress; // 상점 주소
    private final String storePhone; // 상점 전화번호

    // dummy
    public static Store getStoreInfo() {
        return Store.builder().storeName("인코벅스").storeAddress("대전 유성구 문지로 272-7").storePhone("010-5324-6883").build();
    }
}
