package com.codewithmosh.Command.Editor.Commands;

import com.codewithmosh.Command.Editor.Interfaces.Command;

public class UndoCommand implements Command {
    private History hist;
    
    public UndoCommand(History hist) {
        this.hist = hist;
    }

    @Override
    public void execute() {
        if(hist.size()>0){
            hist.pop().unexecute();
        }
        
    }
    
}
