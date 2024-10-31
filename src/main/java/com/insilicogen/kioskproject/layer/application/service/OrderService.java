package com.insilicogen.kioskproject.layer.application.service;

import com.insilicogen.kioskproject.layer.domain.Menu;

import java.util.List;

public interface OrderService {
    public List<Menu> getMenu();
    String requestPayment();
}
