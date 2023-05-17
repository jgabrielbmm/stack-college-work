package com.problem3;

import java.util.Date;

public class App {
    public static void main(String args[]){

        Grade nota1 = new Grade(GradeValue.A, new Date("08/07/2020"));
        Grade nota2 = new Grade(GradeValue.A, new Date("08/07/2015"));
        Grade nota3 = new Grade(GradeValue.A, new Date("08/07/2021"));
        Grade nota4 = new Grade(GradeValue.A, new Date("08/05/2018"));

        GradeStack stack2 = new GradeStack();

        stack2.pushGrade(nota1);
        System.out.println(stack2);
        stack2.pushGrade(nota2);
        System.out.println(stack2);
        stack2.pushGrade(nota3);
        System.out.println(stack2);
        stack2.pushGrade(nota4);
        System.out.println(stack2);

    }
}
