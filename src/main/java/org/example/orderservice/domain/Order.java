package org.example.orderservice.domain;

import java.util.Date;
import java.util.Optional;

record Order(long Id,
             int GoodsCount,
             double TotalSum,
             double TotalWeight,
             OrderType OrderType,
             Date OrderDate,
             Region Region,
             OrderStatus OrderStatus,
             String CustomerName,
             Optional<Address> Address,
             Optional<String> Phone) {
}
