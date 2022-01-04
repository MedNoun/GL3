package com.codewithmosh.Command.Editor.Commands;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import com.codewithmosh.Command.Editor.Interfaces.UndoableCommand;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();
    public void push(UndoableCommand e){
        commands.add(e);
    }
    public UndoableCommand pop(){
        return commands.pop();
    }
    public int size(){
        return commands.size();
    }
}
