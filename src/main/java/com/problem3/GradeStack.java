package com.problem3;

import com.stack.Stack;

public class GradeStack extends Stack<Grade> {
    public void pushGrade(Grade grade){
        Stack<Grade> stackAux = new Stack<>();
        while (!list.isEmpty()){
            if (grade.getDate().compareTo(list.peek().getDate()) < 0 ){
                Grade top = list.peek();
                list.pop();
                stackAux.push(top);
            } else {
                break;
            }
        }

        list.push(grade);

        while (!stackAux.isEmpty()){
            list.push(stackAux.peek());
            stackAux.pop();
        }

    }

}
