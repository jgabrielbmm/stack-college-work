package com.problem4;

public class App {
    public static void main(String args[]){
        MagicCard card1 = new MagicCard("Gabriel", TypeLine.Creature, 1000, "slow" );
        MagicCard card2 = new MagicCard("Spider", TypeLine.Enchantment, 2000, "slow" );
        MagicCard card3 = new MagicCard("Men", TypeLine.Sorcery, 100, "slow" );
        MagicCard card4 = new MagicCard("Goku", TypeLine.ActivatedAbility, 7000, "slow" );
        MagicCard card5 = new MagicCard("Gohan", TypeLine.AbilityShot, 10000, "slow" );

        Deck deck = new Deck();

        deck.push(card1);
        deck.push(card4);
        deck.push(card2);
        deck.push(card3);
        deck.push(card5);

        deck.removeCard("Men");

        System.out.println(deck);

        System.out.println(deck.size());
        System.out.println(deck.peek());
    }

}
