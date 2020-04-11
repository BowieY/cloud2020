package fun.bowie.springcloud.service;

import fun.bowie.springcloud.domain.Order;

public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
