package com.codewithmosh.Command.Editor.Interfaces;

public interface UndoableCommand extends Command {
    void unexecute();
}
