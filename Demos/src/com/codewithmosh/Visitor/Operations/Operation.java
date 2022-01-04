package com.codewithmosh.Visitor.Operations;

import com.codewithmosh.Visitor.AnchorNode;
import com.codewithmosh.Visitor.HeadingNode;

public interface Operation {
    void apply(HeadingNode n);
    void apply (AnchorNode n);
}
