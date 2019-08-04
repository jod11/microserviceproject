package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * @author jod
 * @date 2019/7/31-22:12
 */
public interface OrderService {
    Order getOrder(String orderId);

    void addOrder(Order order);
}
