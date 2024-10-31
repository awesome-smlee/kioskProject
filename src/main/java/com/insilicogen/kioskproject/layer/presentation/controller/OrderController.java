package com.insilicogen.kioskproject.layer.presentation.controller;

import com.insilicogen.kioskproject.layer.application.service.OrderService;
import com.insilicogen.kioskproject.layer.domain.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    // 메뉴 조회
    @GetMapping("/menu")
    public List<Menu> getMenu() {
        return orderService.getMenu();
    }

    // 결제
    @PostMapping("/payment")
    public String requestPayment() {
        String result = orderService.requestPayment();
        return result;
    }
}
