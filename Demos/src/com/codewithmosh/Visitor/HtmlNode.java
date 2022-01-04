package com.codewithmosh.Visitor;

import com.codewithmosh.Visitor.Operations.Operation;

public interface HtmlNode {
    void highlight();
    void execute(Operation operation);
}
