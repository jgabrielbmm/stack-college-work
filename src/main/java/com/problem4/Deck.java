package com.problem4;

import com.stack.Stack;

public class Deck extends Stack<MagicCard> {
    @Override
    public void push(MagicCard card) {
        if(list.isEmpty() &&  (card.getType() == TypeLine.Land ||
                card.getType() == TypeLine.Creature ||
                card.getType() == TypeLine.Enchantment ||
                card.getType() == TypeLine.Planeswalker ||
                card.getType() == TypeLine.Artifact ||
                card.getType() == TypeLine.Sorcery)
        ){
            return;
        }

        list.push(card);

    }

    public void removeCard(String cardName){
        Stack<MagicCard> stackAux = new Stack<>();
        while (!list.isEmpty()) {
            if (list.peek().getName() == cardName) {
                MagicCard temp = list.peek();
                list.pop();
                break;
            }

            stackAux.push(list.peek());
            list.pop();
        }

        while (!stackAux.isEmpty()){
            list.push(stackAux.peek());
            stackAux.pop();
        }
    }

    @Override
    public String toString() {
        return "Deck{"  + list +
                '}';
    }
}
