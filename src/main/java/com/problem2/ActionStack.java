package com.problem2;

import com.stack.Stack;

import java.util.EmptyStackException;

public class ActionStack extends Stack<Action> {
    public void removeUpToSixteenAction(int qty){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        for(int i = 0; i < qty; i++){
            if(isEmpty()){
                break;
            }
            list.pop();
        }
    }

    public void popAndExecuteAction(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        peek().execute();
        pop();

    }
}
