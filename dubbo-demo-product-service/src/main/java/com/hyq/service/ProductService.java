package com.hyq.service;

/**
 * @author Yuqiu.He
 * @date 2021/4/19
 */
public interface ProductService {
    void reduceStock(Long productId, Integer amount) throws Exception;
}
