package com.problem1;

import com.problem1.EnumRegion;

import java.math.BigDecimal;
import java.util.UUID;

public class Truck {
    private UUID id = UUID.randomUUID();
    private EnumRegion region;
    private double loadWeight;

    public Truck(EnumRegion region, double loadWeight) {
        this.region = region;
        this.loadWeight = loadWeight;
    }

    public EnumRegion getRegion() {
        return region;
    }

    public void setRegion(EnumRegion region) {
        this.region = region;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}
