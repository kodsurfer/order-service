package org.example.orderservice.services;

import org.example.orderservice.domain.Order;
import org.example.orderservice.domain.OrderStatus;

import java.util.concurrent.CompletableFuture;

public interface OrdersService {
    public interface IOrdersService {
        CompletableFuture<Order> GetOrder(long id);

        CompletableFuture<Boolean> CancelOrder(long id);

        CompletableFuture<OrderStatus> GetOrderStatus(long id);
    }
}
