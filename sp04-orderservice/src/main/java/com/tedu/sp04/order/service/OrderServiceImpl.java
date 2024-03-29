package com.tedu.sp04.order.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jod
 * @date 2019/7/31-23:02
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrder(String orderId) {
        //TODO: 调用user-service获取用户信息
        //TODO: 调用item-service获取商品信息
        Order order = new Order();
        order.setId(orderId);
        return order;
    }

    @Override
    public void addOrder(Order order) {
        //TODO: 调用item-service减少商品库存
        //TODO: 调用user-service增加用户积分
        log.info("保存订单："+order);
    }

}
