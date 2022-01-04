package com.codewithmosh.Visitor;

import java.util.ArrayList;
import java.util.List;

import com.codewithmosh.Visitor.Operations.Operation;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();
    public void add(HtmlNode e){
        nodes.add(e);
    }
    public void execute(Operation operation){
        for(var node : nodes){
            node.execute(operation);
        }
    }
}
