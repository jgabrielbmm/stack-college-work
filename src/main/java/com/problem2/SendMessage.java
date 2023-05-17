package com.problem2;

public class SendMessage extends Action{
    public SendMessage(String title, String description) {
        super(title, description);
    }

    @Override
    public void execute() {
        System.out.println("Exec");
    }
}
