package com.codewithmosh.Command.Commands;

import java.util.ArrayList;
import java.util.List;

import com.codewithmosh.Command.Fx.Command;

public class CompositeCommand implements Command{
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command c){
        commands.add(c);
    }
    @Override
    public void execute() {
        for(var command: commands){
            command.execute();
        } 
    }
    
}
