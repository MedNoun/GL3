package com.codewithmosh.Visitor;

import com.codewithmosh.Visitor.Operations.Operation;

public class AnchorNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("highlighting Anchor !");
    }

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
    
}
