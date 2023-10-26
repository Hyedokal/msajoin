package com.example.masjoin.repository;

import com.example.masjoin.entity.Order;

import java.util.List;

public interface OrderRepository {
    public List<Order> getOrderByUserId(int userId);
    public List<Order> getAllOrder();
}
