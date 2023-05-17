package com.problem2;

public abstract class Action {
    private String title;
    private String description;

    public Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    abstract public void execute();

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
