package com.codewithmosh.prototype;

public class Audio implements Component {

    @Override
    public Component duplicate() {
        return new Audio();
    }
}
