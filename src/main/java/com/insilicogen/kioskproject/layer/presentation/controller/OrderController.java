package com.insilicogen.kioskproject.layer.presentation.controller;

import com.insilicogen.kioskproject.layer.application.service.OrderService;
import com.insilicogen.kioskproject.layer.domain.Menu;
import com.insilicogen.kioskproject.layer.domain.PaymentInfo;
import com.insilicogen.kioskproject.layer.domain.Receipt;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    // 결제 요청
    @PostMapping("/payment/{paymentType}")
    public String requestCardPayment(@PathVariable int paymentType) {
        PaymentInfo paymentInfo = PaymentInfo.builder().build();
        // 1:카드, 2:쿠폰, 3:현금
        if(paymentType == 1) {
            // 카드 결제 정보 넘어왔다고 가정
            return orderService.requestCardPayment(paymentInfo);
        } else if(paymentType == 2) {
            return orderService.requestCouponPayment(paymentInfo);
        } else if(paymentType == 3) {
            return orderService.requestCashPayment();
        } else {return "잘못된 요청입니다.";}
    }
    
    // 결제 내역 조회
    @GetMapping("/paymentInfo")
    public PaymentInfo getPaymentInfo(){
        return orderService.getPaymentInfo();
    }

    // 영수증 조회
    @GetMapping("/receipt")
    public Receipt getReceipt(){
        return orderService.getReceipt();
    }

}
