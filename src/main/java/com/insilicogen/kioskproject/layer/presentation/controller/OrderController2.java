package com.insilicogen.kioskproject.layer.presentation.controller;

import com.insilicogen.kioskproject.layer.application.service.OrderService;
import com.insilicogen.kioskproject.layer.domain.Menu;
import com.insilicogen.kioskproject.layer.domain.PaymentInfo;
import com.insilicogen.kioskproject.layer.domain.Receipt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/order2")
public class OrderController2 {

    private final OrderService orderService;

    // 메뉴 조회
    @GetMapping("/menu")
    public List<Menu> getMenu() {
        return orderService.getMenu();
    }

    // 결제 요청
    @ResponseBody
    @PostMapping("/payment/{paymentType}")
    public String requestCardPayment(@PathVariable int paymentType) {
        try {
            PaymentInfo paymentInfo = PaymentInfo.builder()
                    .cardNumber("1234-1234-1234-1234")
                    .cardExpiryDate("0220")
                    .cardCVC(333)
                    .build();
            // 1:카드, 2:쿠폰, 3:현금
            if(paymentType == 1) {
                // 카드 결제 정보 넘어왔다고 가정 @RequestBody
                return orderService.requestCardPayment(paymentInfo);
            } else if(paymentType == 2) {
                // 쿠폰 결제 정보 넘어왔다고 가정 @RequestBody
                return orderService.requestCouponPayment(paymentInfo);
            } else if(paymentType == 3) {
                return orderService.requestCashPayment();
            } else {return "잘못된 요청입니다.";}

        } catch (Exception e) {
            e.printStackTrace();
            return "서버 오류가 발생했습니다.";
        }
    }
    
    // 결제 내역 조회
    @ResponseBody
    @GetMapping("/paymentInfo")
    public PaymentInfo getPaymentInfo(){
        return orderService.getPaymentInfo();
    }

    // 영수증 조회
    @ResponseBody
    @GetMapping("/receipt")
    public Receipt getReceipt(){
        return orderService.getReceipt();
    }

    // JSP TEST -----------
    // @RestController -> @Controller로 바꿔야함
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
