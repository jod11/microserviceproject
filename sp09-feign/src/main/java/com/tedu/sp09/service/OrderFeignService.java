package com.tedu.sp09.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.web.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jod
 * @date 2019/8/4-16:39
 */
@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable String orderId);

    @GetMapping("/")
    JsonResult addOrder();

}
