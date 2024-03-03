package org.example.orderservice.domain;

public record Address(int id, String country, String region, String city, String street, String building,
                      String apartment, double latitude, double longitude) {
}
