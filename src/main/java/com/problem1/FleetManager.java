package com.problem1;

import com.stack.Stack;

public class FleetManager {
    private Stack<Truck> northFleet = new Stack<>();
    private Stack<Truck> northeastFleet = new Stack<>();
    private Stack<Truck> centralWestFleet = new Stack<>();
    private Stack<Truck> southeastFleet = new Stack<>();
    private Stack<Truck> southFleet = new Stack<>();
    public void addTruck(Truck truck){
        switch (truck.getRegion()){
            case North: northFleet.push(truck);
                        break;
            case Northeast: northeastFleet.push(truck);
                            break;
            case CentralWest: centralWestFleet.push(truck);
                              break;
            case Southeast: southeastFleet.push(truck);
                            break;
            case South: southFleet.push(truck);
                        break;
            default:
                break;
        }
    }

    public Stack<Truck> getNorthFleet() {
        return northFleet;
    }

    public Stack<Truck> getNortheastFleet() {
        return northeastFleet;
    }

    public Stack<Truck> getCentralWestFleet() {
        return centralWestFleet;
    }

    public Stack<Truck> getSoutheastFleet() {
        return southeastFleet;
    }

    public Stack<Truck> getSouthFleet() {
        return southFleet;
    }
}
