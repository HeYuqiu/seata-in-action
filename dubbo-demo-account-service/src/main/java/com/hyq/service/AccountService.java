package com.hyq.service;

/**
 * @author Yuqiu.He
 * @date 2021/4/19
 */
public interface AccountService {
    void reduceBalance(Long userId, Integer price) throws Exception;
}
