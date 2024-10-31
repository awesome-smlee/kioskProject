package com.insilicogen.kioskproject.layer.application.service;

import com.insilicogen.kioskproject.layer.domain.Menu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public List<Menu> getMenu() {
        return Menu.getMenuList(); // Menu.getMenuList() returns a list of Menu objects
    }

    @Override
    public String requestPayment() {

        return "";
    }
}
