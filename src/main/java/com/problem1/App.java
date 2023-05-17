package com.problem1;

import com.problem2.Action;
import com.problem2.ActionStack;
import com.problem2.SendMessage;

public class App {
    public static void main(String args[]){
        SendMessage message;
        ActionStack list = new ActionStack();
        for(int i = 0; i < 13; i++){
            message = new SendMessage("oi", "ola");
            list.push(message);
        }

        System.out.println(list);
        list.removeUpToSixteenAction(7);
        System.out.println(list);
    }
}
