package com.pavlyshyn;

import java.util.Queue;

public class Command {

    private String command;

    public Command(String command) {
        this.command = command;
    }
    public String operation() {
        return command;
    }
}


