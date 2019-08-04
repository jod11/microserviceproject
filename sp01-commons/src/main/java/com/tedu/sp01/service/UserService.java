package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * @author jod
 * @date 2019/7/31-22:13
 */
public interface UserService {
    User getUser(Integer id);

    void addScore(Integer id, Integer score);

}
