package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Order {
    private final String orderId;
    private final String orderDate;
}
