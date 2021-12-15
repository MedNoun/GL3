package com.codewithmosh.prototype;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public Component duplicate(Component component) {
        Component a= component.duplicate();
        return a;


    }
}
