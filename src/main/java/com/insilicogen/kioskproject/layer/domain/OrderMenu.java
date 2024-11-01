package com.insilicogen.kioskproject.layer.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class OrderMenu {
    private final String orderMenuId;
    private final String orderId;
    private final String menuId;
    private final int menuQty;

    public static List<OrderMenu> getOrderMenuList(){
        return List.of(
                OrderMenu.builder().orderMenuId("R001").orderId("1").menuId("1").menuQty(2).build(),
                OrderMenu.builder().orderMenuId("R002").orderId("2").menuId("2").menuQty(2).build(),
                OrderMenu.builder().orderMenuId("R003").orderId("3").menuId("3").menuQty(3).build(),
                OrderMenu.builder().orderMenuId("R004").orderId("4").menuId("4").menuQty(4).build(),
                OrderMenu.builder().orderMenuId("R005").orderId("5").menuId("5").menuQty(15).build(),
                OrderMenu.builder().orderMenuId("R006").orderId("6").menuId("6").menuQty(5).build()
        );
    }

}
