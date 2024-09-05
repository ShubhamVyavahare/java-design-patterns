package com.sv.learning.core_patterns.command;

public class OffCommand implements Command {

    Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }


}
