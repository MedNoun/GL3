package com.codewithmosh.Command.Editor.Commands;

import com.codewithmosh.Command.Editor.HtmlDocument;
import com.codewithmosh.Command.Editor.Interfaces.UndoableCommand;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument doc;
    private History hist;
    public BoldCommand(HtmlDocument doc, History hist) {
        this.doc = doc;
        this.hist = hist;
    }

    @Override
    public void execute() {
        prevContent = doc.getContent();
        doc.makeBold();
        hist.push(this);
    }

    @Override
    public void unexecute() {
        doc.setContent(prevContent);
        
    }
    
}
