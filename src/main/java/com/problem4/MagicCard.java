package com.problem4;

public class MagicCard {
    private String name;
    private TypeLine type;
    private int cost;
    private String effect;

    public void attack(){
        System.out.println("Atack");
    }

    public MagicCard(String name, TypeLine type, int cost, String effect) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }


    public TypeLine getType() {
        return type;
    }



    public int getCost() {
        return cost;
    }


    public String getEffect() {
        return effect;
    }


    @Override
    public String toString() {
        return "\n{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", cost=" + cost +
                ", effect='" + effect + '\'' +
                "}";
    }
}
