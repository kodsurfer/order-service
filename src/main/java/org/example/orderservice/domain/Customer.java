package org.example.orderservice.domain;

import java.util.List;

public record Customer(long id,
                       String firstName,
                       String lastName,
                       String mobileNumber,
                       String email,
                       Address defaultAddress,
                       List<Address> addresses) {
}
