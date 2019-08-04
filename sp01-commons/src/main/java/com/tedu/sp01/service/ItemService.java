package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * @author jod
 * @date 2019/7/31-22:12
 */
public interface ItemService {
    List<Item> getItems(String orderId);

    void decreaseNumbers(List<Item> list);

}
