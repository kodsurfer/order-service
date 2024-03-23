package org.example.orderservice.services;

import org.example.orderservice.domain.Region;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface RegionService {
    interface IRegionService {
        CompletableFuture<List<Region>> GetRegions();
    }
}
