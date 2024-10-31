package com.insilicogen.kioskproject.layer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class Menu {
    private final String menuId; // 메뉴 id
    private final String menuName; // 메뉴명
    private final int menuPrice; // 메뉴 가격
    private final String menuDesc; // 메뉴 설명
    private final String menuCategory; // 카테고리
    // private final String menuCategoryId;

    // dummy
    public static List<Menu> getMenuList() {
        return List.of(
                Menu.builder().menuId("M001").menuName("아메리카노").menuPrice(10000).menuDesc("음료 설명").menuCategory("음료").build(),
                Menu.builder().menuId("M002").menuName("카페라떼").menuPrice(20000).menuDesc("음료 설명").menuCategory("음료").build(),
                Menu.builder().menuId("M003").menuName("카푸치노").menuPrice(30000).menuDesc("음료 설명").menuCategory("음료").build(),
                Menu.builder().menuId("M004").menuName("치즈케익").menuPrice(40000).menuDesc("디저트 설명").menuCategory("디저트").build(),
                Menu.builder().menuId("M005").menuName("케익초").menuPrice(50000).menuDesc("기타 설명").menuCategory("기타").build()
        );
    }
}