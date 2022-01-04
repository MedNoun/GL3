package com.codewithmosh.Visitor;

import com.codewithmosh.Visitor.Operations.Operation;

public class HeadingNode implements HtmlNode {

    @Override
    public void highlight() {
        System.out.println("Highlighting the heading node !");
        
    }

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
        
    }
    
}
