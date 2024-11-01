package com.insilicogen.kioskproject.layer.application.service;

import com.insilicogen.kioskproject.layer.domain.Menu;
import com.insilicogen.kioskproject.layer.domain.PaymentInfo;
import com.insilicogen.kioskproject.layer.domain.Receipt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    // 메뉴 조회
    @Override
    public List<Menu> getMenu() {
        return Menu.getMenuList();
    }

    // 카드 결제
    @Override
    public String requestCardPayment(PaymentInfo paymentInfo) {
        log.info("카드 결제 요청중 ....");

        boolean isApproved = processCardPayment(paymentInfo);

        return paymentResult(isApproved);
    }

    // 쿠폰 결제
    @Override
    public String requestCouponPayment(PaymentInfo paymentInfo) {
        log.info("쿠폰 결제 요청중 ....");

        boolean isApproved = processCardPayment(paymentInfo);

        return paymentResult(true);
    }


    // 카드 결제 로직
    private boolean processCardPayment(PaymentInfo paymentInfo) {

        String cardNumber = paymentInfo.getCardNumber();
        String cardExpiryDate = paymentInfo.getCardExpiryDate();
        int cardCVC = paymentInfo.getCardCVC();


        // 유효성 검증
        if(isCardInfoVaild(cardNumber, cardExpiryDate, cardCVC)) {
            // 카드 정보 유효O
            log.info("카드 정보가 유효합니다. 결제를 승인합니다.");
            return true;

        } else {
            // 카드 정보 유효X
            log.info("카드 정보가 유효하지 않습니다. 결제를 실패 처리합니다.");
            return false;
        }
    }

    // 카드 결제 유효성 검사
    public boolean isCardInfoVaild(String cardNumber, String cardExpiryDate, int cardCVC) {
        int cardNumberLength = cardNumber.replaceAll("-", "").length(); // 카드 번호의 길이
        int expiryDateLength = cardExpiryDate.replaceAll("-", "").length(); // 유효 기간의 길이 (MMYY)
        String cvcString = String.valueOf(cardCVC); // CVC를 문자열로 변환
        return cardNumberLength == 16 && expiryDateLength == 4 && cvcString.length() == 3; // 유효성 검사
    }
    
    // 결제 결과를 반환하는 공통 메서드
    public String paymentResult(boolean isApproved) {
        if (isApproved) {
            return "결제가 완료되었습니다.";
        } else {
            return "결제 실패하였습니다. 다시 시도해주세요.";
        }
    }

    // 현금 결제
    @Override
    public String requestCashPayment() {
        return "카운터에 문의 바랍니다.";
    }


    // 결제 내역 조회
    @Override
    public PaymentInfo getPaymentInfo() {
        return PaymentInfo.getPaymentInfo();
    }

    // 영수증
    @Override
    public Receipt getReceipt() {
        return Receipt.getReceipt();
    }


    @Override
    public String cancelOrder(int orderId) {
        return "";
    }

    @Override
    public String cancelPayment(int paymentId) {
        return "";
    }
}