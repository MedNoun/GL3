package com.codewithmosh.Visitor.Operations;

import com.codewithmosh.Visitor.AnchorNode;
import com.codewithmosh.Visitor.HeadingNode;

public class HighlightOperation implements Operation {

    @Override
    public void apply(HeadingNode n) {
        System.out.println("Highlighting a heading node !");
    }

    @Override
    public void apply(AnchorNode n) {
        System.out.println("highlighting an anchor node !");
    }
    
}
