package com.codewithmosh;

import java.util.List;

import com.codewithmosh.ChainOfResponsibility.Authenticator;
import com.codewithmosh.ChainOfResponsibility.Compressor;
import com.codewithmosh.ChainOfResponsibility.Handler;
import com.codewithmosh.ChainOfResponsibility.HttpRequest;
import com.codewithmosh.ChainOfResponsibility.Logger;
import com.codewithmosh.ChainOfResponsibility.WebServer;
import com.codewithmosh.Command.Commands.AddCustomerCommand;
import com.codewithmosh.Command.Commands.BlackAndWhiteCommand;
import com.codewithmosh.Command.Commands.CompositeCommand;
import com.codewithmosh.Command.Commands.ResizeCommand;
import com.codewithmosh.Command.Editor.HtmlDocument;
import com.codewithmosh.Command.Editor.Commands.BoldCommand;
import com.codewithmosh.Command.Editor.Commands.History;
import com.codewithmosh.Command.Editor.Commands.UndoCommand;
import com.codewithmosh.Command.Services.CustomerService;
import com.codewithmosh.Iterator.BrowseHistory;
import com.codewithmosh.Iterator.Iterator;
import com.codewithmosh.Observer.Chart;
import com.codewithmosh.Observer.DataSource;
import com.codewithmosh.Observer.SpreadSheet;
import com.codewithmosh.Observer.Subject;
import com.codewithmosh.Visitor.AnchorNode;
import com.codewithmosh.Visitor.HeadingNode;
import com.codewithmosh.Visitor.Operations.HighlightOperation;

public class Main {
    public static void main(String[] args) {
        var document = new com.codewithmosh.Visitor.HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());
        document.execute(new HighlightOperation());
    }
}