package com.example.masjoin.dto;

import com.example.masjoin.entity.Order;

import java.util.List;

public class UserOrderDto {
    private int userId;
    private String name;
    private int age;

    //연관관계를 가져갈 수 있는 Order 목록
    private List<Order> orderList;

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "userId : " + userId + "age : " + age + "name : " + name;
    }
}
