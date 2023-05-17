package com.problem3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Grade {
    private GradeValue value;
    private Date date;

    public Grade(GradeValue value, Date date) {
        this.value = value;
        this.date = date;
    }

    public GradeValue getValue() {
        return value;
    }

    public void setValue(GradeValue value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd MMMM yyyy");
        return "{" +
                "value=" + value +
                ", date=" + DateFor.format(date)  +
                '}';
    }
}
